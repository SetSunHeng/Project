
package Controller;

import DataBase.Dbms;
import Model.CoffeeModel;
import java.util.*;
import java.sql.*;

public class CoffeeController {
    
    static List<CoffeeModel> list = new ArrayList<>();
    Dbms dbms = new Dbms();
    PreparedStatement ps;
    ResultSet rs;

    public CoffeeController() {
        dbms.connectDB();
    }

    public List<CoffeeModel> getList() {
        
        return list;
    }
    
    
    
    public void buyCoffee(){
        
    }
    public void updateOrder(){
        
    }
    public void removeOrder(){
        
    }
}
