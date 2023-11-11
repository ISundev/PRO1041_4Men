
package Model;


public class SanPhamChiTiet {
    String id;
    String idsp;
    String idcl;
    String idpl;
    String idth;
    String idxx;
    String idms;
    Float khoiLuong;
    String anh;
    Integer soLuong;
    String moTa;
    String kichThuoc;
    Float gia;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(String id, String idsp, String idcl, String idpl, String idth, String idxx, String idms, Float khoiLuong, String anh, Integer soLuong, String moTa, String kichThuoc, Float gia) {
        this.id = id;
        this.idsp = idsp;
        this.idcl = idcl;
        this.idpl = idpl;
        this.idth = idth;
        this.idxx = idxx;
        this.idms = idms;
        this.khoiLuong = khoiLuong;
        this.anh = anh;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.kichThuoc = kichThuoc;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getIdcl() {
        return idcl;
    }

    public void setIdcl(String idcl) {
        this.idcl = idcl;
    }

    public String getIdpl() {
        return idpl;
    }

    public void setIdpl(String idpl) {
        this.idpl = idpl;
    }

    public String getIdth() {
        return idth;
    }

    public void setIdth(String idth) {
        this.idth = idth;
    }

    public String getIdxx() {
        return idxx;
    }

    public void setIdxx(String idxx) {
        this.idxx = idxx;
    }

    public String getIdms() {
        return idms;
    }

    public void setIdms(String idms) {
        this.idms = idms;
    }

    public Float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(Float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }
    
}
