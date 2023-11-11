
package Service;
import Connection.DBContext;
import Model.ChatLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChatLieuService {
    private Connection con = DBContext.getConnection();
    
    public boolean Them(ChatLieu ms){
        String sql = "Insert into ChatLieu (TenCL,TrangThai) VALUES (?,0)";
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
    
    public boolean Sua(ChatLieu ms){
        String sql = "UPDATE ChatLieu SET  TenCL = ? WHERE ID = ?";
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
    
    public boolean An(ChatLieu ms){
         String sql = "DELETE FROM ChatLieu Where ID = ?";
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
