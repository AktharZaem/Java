import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDB {

    DbConnect dbc;
    Connection con;
    PreparedStatement ps;

    public void Dltstd(String Id){
        dbc=new DbConnect();
        con=dbc.myCon();

        try {
            ps=con.prepareStatement("delete from basic_data where stu_id=?");
            ps.setString(1,Id);
           // ps.setString(2,Name);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error in the Ps..."+e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("The Issue in connectin close..."+e.getMessage());
            }
        }

    }

}
