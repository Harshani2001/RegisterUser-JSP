import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationDAO {
	private String dburl ="jdbc:mysql://localhost:3306/member";
	private String dbuname ="root";
	private String dbpassword ="";
	private String dbdriver ="com.mysql.cj.jdbc.Driver";
	private void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		}
	}
	public Connection getConnection() {
		Connection con =null;
		try {
			con = DriverManager.getConnection(dburl,dbuname,dbpassword);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Member member) {
		
		loadDriver(dbdriver);
		Connection con =getConnection();
		String sql ="insert into member values(?, ?, ?, ?) ";
		String result ="Data Entered Sucessfully";
		
		try {
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1,member.getUname());
			ps.setString(2,member.getPassword());
			ps.setString(3,member.getEmail());
			ps.setString(4,member.getPhone());
			
			ps.executeUpdate();
		}
		catch (SQLException e) {
			
			result ="Data not Entered Sucessfully";
			e.printStackTrace();
			
			
		}
		
		return result;
			
		
	}
}
