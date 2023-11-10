/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Connection.DBContext;
import Model.SanPham;
import Model.TaiKhoan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class SanPhamService {
    Connection cn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    public List<SanPham> getAll(){
        List<SanPham> lsp = new ArrayList<>();
        try {
            cn = DBContext.getConnection();
            String sql = "Select * from TaiKhoan where TrangThai = 0";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                
                lsp.add(sp);
            }  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
                pstm.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lsp;
    }
    
    
    public Integer addTK(TaiKhoan tk){
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "Insert into TaiKhoan(TenDangNhap,MatKhau,VaiTro,TrangThai) values(?,?,?,0)";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, tk.getTenDangNhap());
            pstm.setString(2, tk.getMatKhau());
            pstm.setString(3, tk.getVaiTro());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
                pstm.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return row;
    }
    public Integer updateTK(TaiKhoan tk){
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "Update TaiKhoan set TenDangNhap = ?,MatKhau=?,VaiTro =? where ID = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, tk.getTenDangNhap());
            pstm.setString(2, tk.getMatKhau());
            pstm.setString(3, tk.getVaiTro());
            pstm.setString(4, tk.getId());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
                pstm.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return row;
    }
    public Integer deleteTK(String id){
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "Update TaiKhoan set TrangThai = 1 where ID = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
                pstm.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return row;
    }
    public TaiKhoan findByID(String id){
        TaiKhoan tk = null;
        try {
            cn = DBContext.getConnection();
            String sql = "Select * from TaiKhoan where ID = ? and TrangThai = 0";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            while(rs.next()){
                tk.setId(id);
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setTenDangNhap(rs.getString("TenDangNhap"));
                tk.setVaiTro(rs.getString("VaiTro"));
                tk.setTrangThai(rs.getByte("TrangThai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
                pstm.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return tk;
    }
}
