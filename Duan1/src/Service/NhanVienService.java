/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connection.DBContext;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class NhanVienService {
    private Connection conn = DBContext.getConnection();


    public boolean them(NhanVien nv) {
        String sql = "INSERT INTO NhanVien (MaNV,HoTen,GioiTinh,NgaySinh,DiaChi,SDT,Email,TrangThai) VALUES (?,?,?,?,?,?,?,0)";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);            
            stm.setString(1, nv.getMaNV());
            stm.setString(2, nv.getTenNV());
            stm.setString(3, nv.getGioiTinh());
            stm.setDate(4, new java.sql.Date(nv.getNgaySinh().getTime()));
            stm.setString(5, nv.getDiaChi());       
            stm.setString(6, nv.getSdt());
            stm.setString(7, nv.getEmail());
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();

            return false;
        }
    }


    public boolean sua(NhanVien nv) {
        String sql = "UPDATE NHANVIEN SET HoTen = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, SDT = ?,Email = ?,TrangThai = 1 Where MaNV = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);             
            stm.setString(1, nv.getTenNV());
            stm.setString(2, nv.getGioiTinh());
            stm.setDate(3, new java.sql.Date(nv.getNgaySinh().getTime()));
            stm.setString(4, nv.getDiaChi());       
            stm.setString(5, nv.getSdt());
            stm.setString(6, nv.getEmail());
            stm.setString(7, nv.getMaNV());
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();

            return false;
        }
        }


    public boolean xoa(NhanVien nv) {
        String sql = "DELETE FROM NhanVien Where MaNV = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);            
            stm.setString(1, nv.getMaNV());
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();

            return false;
        }
        }
        
}
