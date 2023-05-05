import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStu {

    DbConnect dbc;
    Connection con;
    PreparedStatement ps;

    public void Updatest(String Id,String Name,String Address){
        dbc=new DbConnect();
        con=dbc.myCon();

        try {
            ps=con.prepareStatement("update basic_data set stu_id=?,stu_name=?,stu_address=? where stu_id=?");
        } catch (SQLException e) {
            System.out.println("Prashnam in sql code (Update)"+e.getMessage());
        }

        try {
            ps.setString(1,Id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            ps.setString(2,Name);
        } catch (SQLException e) {
            System.out.println("Prashnam in Inserting (Update)"+e.getMessage());
        }
        try {
            ps.setString(3,Address);
        } catch (SQLException e) {
            System.out.println("Prashnam in Inserting (Update)"+e.getMessage());
        }
        try {
            ps.setString(4,Id);
        } catch (SQLException e) {
            System.out.println("Prashnam in Inserting (Update)"+e.getMessage());
        }
        try {
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Prashnam in Inserting (Update)"+e.getMessage());
        }

        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Prashnam in con Close (Update)"+e.getMessage());
        }


    }

}
