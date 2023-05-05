import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayDb {
    private String Id;
    private String Name;
    private String Address;

    DbConnect dbc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    public void Display(){
        dbc= new DbConnect();
        con=dbc.myCon();

        try {
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from basic_data");

            while (rs.next()){
                Id=rs.getString(1);
                Name=rs.getString("stu_name");
                Address=rs.getString(3);

                System.out.println(Id+"\t"+Name+"\t"+Address);
            }
        } catch (SQLException e) {
            System.out.println("The Error In Statement..."+e.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("The Error In Close the Con..."+e.getMessage());
            }
        }
    }
}
