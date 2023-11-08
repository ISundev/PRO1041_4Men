/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class DoiHangChiTiet {
    String id;
    String iddh;
    String idhdct;
    String idspct;
    String soLuongDoi;
    Float giaDoi;

    public DoiHangChiTiet() {
    }

    public DoiHangChiTiet(String id, String iddh, String idhdct, String idspct, String soLuongDoi, Float giaDoi) {
        this.id = id;
        this.iddh = iddh;
        this.idhdct = idhdct;
        this.idspct = idspct;
        this.soLuongDoi = soLuongDoi;
        this.giaDoi = giaDoi;
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

    public String getIdhdct() {
        return idhdct;
    }

    public void setIdhdct(String idhdct) {
        this.idhdct = idhdct;
    }

    public String getIdspct() {
        return idspct;
    }

    public void setIdspct(String idspct) {
        this.idspct = idspct;
    }

    public String getSoLuongDoi() {
        return soLuongDoi;
    }

    public void setSoLuongDoi(String soLuongDoi) {
        this.soLuongDoi = soLuongDoi;
    }

    public Float getGiaDoi() {
        return giaDoi;
    }

    public void setGiaDoi(Float giaDoi) {
        this.giaDoi = giaDoi;
    }
    
    
}
