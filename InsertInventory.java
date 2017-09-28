import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInventory {

public static void main(String[] args) {
		
		
		//Establish Connection
		Connection con=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl1";
		String uname="scott";
		String pwd="tiger";
		try {
			con=DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create a Statement Object
		try {
			Statement st=con.createStatement();
			String sql="insert into inventory values(000001, 'Gala Apples',1.20,20)";
			
			int count=st.executeUpdate(sql);
			
			if (count==1)
				System.out.println("Record inserted");
			else
				System.out.println("Record not inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
