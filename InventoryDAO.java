import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InventoryDAO {
	public boolean insertInventory(Inventory i){
   
		try {
			//	Statement st=con.createStatement();
			Connection con= DBUtil.getConnection();
				String sql="insert into inventory values(itemid,itemname,price,stocklevel)";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1,e.getItemid());
				pst.setString(2,e.getItemname());
				pst.setDouble(3,e.getPrice());
				pst.setInt(4,e.getStocklevel());
				
				int count=pst.executeUpdate();
				
				if (count==1)
					return true;
				else
					return false;
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
	}
	public boolean deleteItem(int Itemid){return false;}
	public boolean updateInventory(int Itemid,double price){return false;}
	public Emp readInventory(int Itemid){return null;}
}
