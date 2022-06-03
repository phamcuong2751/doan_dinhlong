package models;

public class MTaiKhoan {

    private String username;
    private String password;
    private String hoten;
    private String diachi;
    private String sdt;
    private String chucnang;

    public MTaiKhoan() {
        this.username = "";
        this.password = "";
        this.hoten = "";
        this.diachi = "";
        this.sdt = "";
        this.chucnang = "";
    }

    public MTaiKhoan(String username, String password, String hoten, String diachi, String sdt, String chucnang) {
        this.username = username;
        this.password = password;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.chucnang = chucnang;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getChucnang() {
        return chucnang;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setChucnang(String chucnang) {
        this.chucnang = chucnang;
    }
}