import java.io.FileNotFoundException;
import java.sql.*;
public class DbConnect {

    private String URL="jdbc:mysql://localhost:3306/student";
    private String Name="root";
    private String Password="mhda21234";

    private Connection con=null;

    private void Register(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error In Register... "+e.getException());
        }

    }
    public Connection myCon(){
        Register();
        try{
        con=DriverManager.getConnection(URL,Name,Password);
        } catch (SQLException e) {
            System.out.println("Error In Con..."+e.getMessage());
        }
        return con;
    }


    }
