package bankManagementSystem;

import java.sql.*;

public class Conn {
    public Conn(){
        try {
            Class.forName(com.mysql.cj.jdbc.Driver);
            c = Driver.getConnection("jdbc:mysql:///");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
