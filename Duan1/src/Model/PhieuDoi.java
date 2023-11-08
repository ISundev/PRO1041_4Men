/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class PhieuDoi {
    String id;
    String iddh;
    String maPD;
    String tenPD;
    String thoiGianDoi;
    Integer soLuong;
    Float soTien;
    String ghiChu;

    public PhieuDoi() {
    }

    public PhieuDoi(String id, String iddh, String maPD, String tenPD, String thoiGianDoi, Integer soLuong, Float soTien, String ghiChu) {
        this.id = id;
        this.iddh = iddh;
        this.maPD = maPD;
        this.tenPD = tenPD;
        this.thoiGianDoi = thoiGianDoi;
        this.soLuong = soLuong;
        this.soTien = soTien;
        this.ghiChu = ghiChu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIddh() {
        return iddh;
    }

    public void setIddh(String iddh) {
        this.iddh = iddh;
    }

    public String getMaPD() {
        return maPD;
    }

    public void setMaPD(String maPD) {
        this.maPD = maPD;
    }

    public String getTenPD() {
        return tenPD;
    }

    public void setTenPD(String tenPD) {
        this.tenPD = tenPD;
    }

    public String getThoiGianDoi() {
        return thoiGianDoi;
    }

    public void setThoiGianDoi(String thoiGianDoi) {
        this.thoiGianDoi = thoiGianDoi;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Float getSoTien() {
        return soTien;
    }

    public void setSoTien(Float soTien) {
        this.soTien = soTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
    
}
