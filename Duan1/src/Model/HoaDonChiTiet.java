/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class HoaDonChiTiet {
    String id;
    String idhd;
    String idspct;
    Integer soLuong;
    Float giaTien;
    Float tongTienMua;
    String ghiChu;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String id, String idhd, String idspct, Integer soLuong, Float giaTien, Float tongTienMua, String ghiChu) {
        this.id = id;
        this.idhd = idhd;
        this.idspct = idspct;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tongTienMua = tongTienMua;
        this.ghiChu = ghiChu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdhd() {
        return idhd;
    }

    public void setIdhd(String idhd) {
        this.idhd = idhd;
    }

    public String getIdspct() {
        return idspct;
    }

    public void setIdspct(String idspct) {
        this.idspct = idspct;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Float giaTien) {
        this.giaTien = giaTien;
    }

    public Float getTongTienMua() {
        return tongTienMua;
    }

    public void setTongTienMua(Float tongTienMua) {
        this.tongTienMua = tongTienMua;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
