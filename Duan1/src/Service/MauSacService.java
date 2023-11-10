
package Service;

import Connection.DBContext;
import Model.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MauSacService {
    private Connection con = DBContext.getConnection();
    
    public boolean Them(MauSac ms){
        String sql = "Insert into MauSac (TenMS) VALUES (?)";
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
    
    public boolean Sua(MauSac ms){
        String sql = "UPDATE MauSac SET  TenMS = ? WHERE TenMS = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ms.getTen());
            stm.setString(2, ms.getTen());
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean An(MauSac ms){
         String sql = "DELETE FROM MauSac WHERE TenMS = ?";
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
    
}
