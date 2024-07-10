
package Controller;

import Componant.Dailog;
import DataBase.Dbms;
import Model.LoginModel;
import java.sql.*;
import java.util.*;
import project.HomeCoffee;

public class Login_SignUp {
    
    static List<LoginModel> list = new ArrayList<>();
    
    Dbms dbms = new Dbms();
    PreparedStatement ps;
    ResultSet rs;
    
    public Login_SignUp(){
        dbms.connectDB();
    }

    public List<LoginModel> getList() {
        try {
            String sql = "SELECT * FROM `user`";
            ps = dbms.connectDB().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                
                list.add(new LoginModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
            
            System.out.println("Login success");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void adduser(LoginModel model)
    {
        String sql = "INSERT INTO `user`(`username`, `email`, `password`) VALUES (?,?,?)";
        try {
            ps = dbms.connectDB().prepareStatement(sql);
            ps.setString(1, model.getUsername());
            ps.setString(2, model.getEmail());
            ps.setString(3, model.getPassword());
            int i = ps.executeUpdate();
            if (i>0){
                System.out.println("Create account is Success");
            } else{
                System.out.println("Create account isn't Success");
            }         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
