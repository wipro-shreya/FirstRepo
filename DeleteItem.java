import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Establish Connection
				Connection con=null;
				String url="jdbc:oracle:thin:@localhost:1522:orcl";
				String uname="scott";
				String pwd="tiger";
				try {
					con=DriverManager.getConnection(url,uname,pwd);
					System.out.println("Connected");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				//Create a Statement Object
				try {
					Statement st=con.createStatement();
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter ItemID to be deleted");
					int itemid=scan.nextInt();
					String sql="DELETE FROM INVENTORY WHERE ITEMid=" + itemid;
					System.out.println(sql);
					int count=st.executeUpdate(sql);
					
					if (count==1)
						System.out.println("Record deleted");
					else
						System.out.println("Record not deleted");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		
		
		
		
		
		
	}


