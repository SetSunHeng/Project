
package Controller;

import Model.RegisterModel;
import java.util.*;
import DataBase.Dbms;
import java.sql.*;
public class RegisterController {

    Dbms dbms = new Dbms();
    PreparedStatement ps;
    ResultSet rs;
    static List<RegisterModel> list = new ArrayList<>();

    public List<RegisterModel> getList() {
        
        String sql = "SELECT * FROM `register`";
        try {
            ps = dbms.connectDB().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new RegisterModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),                        
                        rs.getString(7),
                        rs.getString(8)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
   
    public RegisterController() {
        dbms.connectDB();
    }
    
    public void Add(RegisterModel model){
        String sql = "INSERT INTO `register`(`name`, `gender`, `course`, `price`, `shift`, `dob`, `pob`) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = dbms.connectDB().prepareStatement(sql);
            ps.setString(1, model.getName());
            ps.setString(2, model.getGender());
            ps.setString(3, model.getCourse());
            ps.setString(4, model.getPrice());
            ps.setString(5, model.getShift());
            ps.setString(6, model.getDob());
            ps.setString(7, model.getPob());
            
            
            int i = ps.executeUpdate();
            if (i>0){
                System.out.println("Add Success");
            } else{
                System.out.println("Add not Success");
            }         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public void Update(RegisterModel model){
        String sql = "UPDATE `register` SET `name`=?,`gender`=?,`course`=?,`price`=?,`shift`=?,`dob`=?,`pob`=?  WHERE `id` = ?";
        try {
            ps = dbms.connectDB().prepareStatement(sql);
            ps.setString(1, model.getName());
            ps.setString(2, model.getGender());
            ps.setString(3, model.getCourse());
            ps.setString(4, model.getPrice());
            ps.setString(5, model.getShift());
            ps.setString(6, model.getDob());
            ps.setString(7, model.getPob());
            ps.setInt(8, model.getId());

            int i = ps.executeUpdate();
            if (i>0){
                System.out.println("Update Success");
            } else{
                System.out.println("Update not Success");
            }         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
    public void Remove(int id){
        String sql = "DELETE FROM `register` WHERE `id` = ?";
        try {
            ps = dbms.connectDB().prepareStatement(sql);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            if (result > 0){
                System.out.println("Delete Success");
            }else {
                System.out.println("Delete not Success");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
