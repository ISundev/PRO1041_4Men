/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class HoaDon {
    String id;
    String idgg;
    String idnv;
    String idkh;
    String idpttt;
    String maHD;
    Float tongTienGiam;
    String thoiGianTao;
    String thoiGianThanhToan;
    Float tongThanhToan;
    Byte trangThai;

    public HoaDon() {
    }

    public HoaDon(String id, String idgg, String idnv, String idkh, String idpttt, String maHD, Float tongTienGiam, String thoiGianTao, String thoiGianThanhToan, Float tongThanhToan, Byte trangThai) {
        this.id = id;
        this.idgg = idgg;
        this.idnv = idnv;
        this.idkh = idkh;
        this.idpttt = idpttt;
        this.maHD = maHD;
        this.tongTienGiam = tongTienGiam;
        this.thoiGianTao = thoiGianTao;
        this.thoiGianThanhToan = thoiGianThanhToan;
        this.tongThanhToan = tongThanhToan;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdgg() {
        return idgg;
    }

    public void setIdgg(String idgg) {
        this.idgg = idgg;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getIdpttt() {
        return idpttt;
    }

    public void setIdpttt(String idpttt) {
        this.idpttt = idpttt;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Float getTongTienGiam() {
        return tongTienGiam;
    }

    public void setTongTienGiam(Float tongTienGiam) {
        this.tongTienGiam = tongTienGiam;
    }

    public String getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(String thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public String getThoiGianThanhToan() {
        return thoiGianThanhToan;
    }

    public void setThoiGianThanhToan(String thoiGianThanhToan) {
        this.thoiGianThanhToan = thoiGianThanhToan;
    }

    public Float getTongThanhToan() {
        return tongThanhToan;
    }

    public void setTongThanhToan(Float tongThanhToan) {
        this.tongThanhToan = tongThanhToan;
    }

    public Byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
    
}
