
package Service;

import Connection.DBContext;
import Model.ThuongHieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ThuongHieuService {
    private Connection con = DBContext.getConnection();
    
    public boolean them (ThuongHieu th){
        String sql = "Insert into ThuongHieu (TenTH,TrangThai) Values (?,0)";
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
    
    public boolean sua (ThuongHieu th){
        String sql = "UPDATE ThuongHieu set TenTH = ? Where ID = ?";
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
    
    public boolean an (ThuongHieu th){
        String sql = "DELETE FROM ThuongHieu Where ID = ?";
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
