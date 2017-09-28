import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {

	public static void main(String[] args) {

		
		
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
				
				
				try {
					Statement st=con.createStatement();
					String sql="CREATE TABLE INVENTORY12 " +
			                   "(ITEMID NUMBER (6) PRIMARY KEY, " +
			                   " ITEMNAME VARCHAR(15), " + 
			                   " PRICE NUMBER(5,2), " + 
			                   " STOCKLEVEL NUMBER(3))"; 
											
					int count=st.executeUpdate(sql);
					
					if (count==1)
						System.out.println("Item created");
					else
						System.out.println("Item not created");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
		
		
		
		
	}

}
