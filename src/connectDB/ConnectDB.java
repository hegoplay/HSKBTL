package connectDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class ConnectDB {
	private static Connection con;
	private static ConnectDB instance = new ConnectDB();
	public static ConnectDB getInstance(){
		return instance;
	}
	public void connect() throws SQLException {				
        String url = "jdbc:sqlserver://localhost:1433;databasename=QLyDuLich";
        String user = "sa";
        String password = "sapassword";
        con = DriverManager.getConnection(url, user, password);		
	}	
	public void disconnect(){
		if(con != null)
        try {
            con.close();
        } 
        catch(SQLException e){	
            e.printStackTrace();			
        }
	}
	public static Connection getConnection(){
		return con;
	}
}