
package Service;

import Connection.DBContext;
import Model.PhanLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author admin
 */
public class PhanLoaiService {
    private Connection con = DBContext.getConnection();
    
    public boolean Them(PhanLoai ms){
        String sql = "Insert into PhanLoai (TenPL,TrangThai) VALUES (?,0)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ms.getTen());
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean Sua(PhanLoai ms){
        String sql = "UPDATE PhanLoai SET  TenPL = ? WHERE ID = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ms.getTen());
            stm.setString(2, ms.getId());
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean An(PhanLoai ms){
         String sql = "DELETE FROM PhanLoai Where ID = ?";
         try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ms.getId());
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
         
    }
}
