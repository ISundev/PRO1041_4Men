
package Service;

import Connection.DBContext;
import Model.XuatXu;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class XuatXuService {
    private Connection con = DBContext.getConnection();
    
    public boolean them (XuatXu th){
        String sql = "Insert into XuatXu (TenXX,TrangThai) Values (?,0)";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);  
            stm.setString(1, th.getTen());
            stm.executeUpdate();
            return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean sua (XuatXu th){
        String sql = "UPDATE XuatXu set TenXX = ? Where ID = ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);  
            stm.setString(1, th.getTen());
            stm.setString(2, th.getId());
            stm.executeUpdate();
            return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean an (XuatXu th){
        String sql = "DELETE FROM XuatXu Where ID = ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);  
            stm.setString(1, th.getId());
            stm.executeUpdate();
            return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
