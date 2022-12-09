package Database;
import java.sql.*;
 
public class konekdb{
    private static Connection conn;
    public static Connection db() throws SQLException{
        try{
            final String url  = "jdbc:mysql://localhost:3306/PA_PBO";
            final String user = "root";
            final String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Pesan : Selamat, Koneksi berhasil");
            
        }catch (SQLException r){
            System.out.println("Pesan : "+r.getMessage());
        }
        return conn;
    }
}
