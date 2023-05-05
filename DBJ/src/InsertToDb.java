import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;

public class InsertToDb {
    //String Id;
    //String Name;
    //String Address;

    DbConnect dbc;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public void Insrt(String Id,String Name,String Address ){
        dbc=new DbConnect();
        con= dbc.myCon();

        try {

            ps=con.prepareStatement("insert into basic_data (stu_id,stu_name,stu_address )values(?,?,?)");
            ps.setString(1,Id);
            ps.setString(2,Name);
            ps.setString(3,Address);

            ps.executeUpdate();


        } catch (SQLException e) {
            System.out.println("Error In Insert Statment..."+e.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error In Insert Statment..."+e.getMessage());
            }
        }


    }
}
