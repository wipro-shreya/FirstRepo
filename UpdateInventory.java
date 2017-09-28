import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 

public class UpdateInventory {

public static void main(String[] args) {
		
		
		//Connecting to SQL
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
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Item ID to be updated");
			int id=scan.nextInt();
			
			System.out.println("Enter Item Name to be updated");
			String itemname=scan.nextLine();
			
			System.out.println("Enter price to be updated");
			double price=scan.nextDouble();
			
			System.out.println("Enter stocklevel to be updated");
			int stocklevel=scan.nextInt();
			
			//EXACT UPDATE COMMAND FROM SQL FOR ENTIRE TABLE
			String sql="UPDATE INVENTORY  SET PRICE=1.20, WHERE ITEMNAME = 'GALA APPLES' ";
			System.out.println(sql);
			
			int count=st.executeUpdate(sql);
			
			if (count==1)
				System.out.println("Item updated");
			else
				System.out.println("Item not updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
