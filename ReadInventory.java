import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadInventory {

public static void main(String[] args) {
		
		
		//Establish Connection
		Connection con=null;
		String url="jdbc:oracle:thin:@localhost:1522:orcl";
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
			System.out.println("Enter itemid to be updated");
			int itemid=scan.nextInt();
			
			String sql="SELECT * FROM INVENTORY WHERE ITEMid ="+itemid;
			System.out.println(sql);
			ResultSet rs=st.executeQuery(sql);
			boolean flag=false;
			while (rs.next())
			{
				flag=true;
				System.out.println("ItemID="+rs.getInt("itemid"));
				System.out.println("Item name="+rs.getString("itemname"));
				System.out.println("Price="+rs.getDouble("price"));
				System.out.println("Stock level="+rs.getInt("stocklevel"));
			}
			
			if (!flag)
			System.out.println("Record not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
