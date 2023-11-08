/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class DoiHang {
    String id;
    String idhd;
    String idkh;
    String idnv;
    String maDH;
    String thoiGianDoi;
    Byte trangThai;

    public DoiHang() {
    }

    public DoiHang(String id, String idhd, String idkh, String idnv, String maDH, String thoiGianDoi, Byte trangThai) {
        this.id = id;
        this.idhd = idhd;
        this.idkh = idkh;
        this.idnv = idnv;
        this.maDH = maDH;
        this.thoiGianDoi = thoiGianDoi;
        this.trangThai = trangThai;
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

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getThoiGianDoi() {
        return thoiGianDoi;
    }

    public void setThoiGianDoi(String thoiGianDoi) {
        this.thoiGianDoi = thoiGianDoi;
    }

    public Byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
