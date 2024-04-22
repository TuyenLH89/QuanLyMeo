package BKTMEO;

import java.util.Scanner;

public abstract class Meo {
//    ID +get -set
//    Tên mèo +get +set
//    Tuổi +get +set
//    Giới tính +get +set
//    Tiếng kêu (Interface) +get +set
    private int iD, tuoi;
    private String tenMeo, tiengKeu, giongMeo;
    private boolean gioiTinh;
    public Meo(int iD, int tuoi, String tenMeo, String giongMeo, String tiengKeu, boolean gioiTinh) {
        this.iD = iD;
        this.tuoi = tuoi;
        this.tenMeo = tenMeo;
        this.giongMeo = giongMeo;
        this.tiengKeu = tiengKeu;
        this.gioiTinh = gioiTinh;
    }

    public Meo(int tuoi, String tenMeo, boolean gioiTinh) {
        this.tuoi = tuoi;
        this.tenMeo = tenMeo;
        this.gioiTinh = gioiTinh;
    }

    public Meo(String tiengKeu, String giongMeo) {
        this.tiengKeu = tiengKeu;
        this.giongMeo = giongMeo;
    }

    public Meo() {
    }
    protected void nhapID(){
        try {
            System.out.print("Nhập vào ID mèo: ");
            iD = new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println("Nhập sai định dạng...Hãy nhập lại");
            nhapID();
        }
    }
    protected void nhapTen(){
        System.out.print("Nhập tên mèo: ");
        tenMeo = new Scanner(System.in).nextLine();
    }
    protected void nhapTuoi(){
        try {
            System.out.print("Nhập tuổi mèo: ");
            tuoi = new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println("Nhập sai định dạng...Hãy nhập lại");
            nhapTuoi();
        }
    }
    protected void nhapGiongMeo(){
        System.out.print("Nhập giống mèo: ");
        giongMeo = new Scanner(System.in).nextLine();
    }
    protected void nhapTiengKeu(){
        System.out.print("Nhập tiếng mèo kêu: ");
        tiengKeu = new Scanner(System.in).nextLine();
    }
    protected void nhapGioiTinh(){
        System.out.print("Nhập giới tính(true-false): ");
        gioiTinh = Boolean.parseBoolean(new Scanner(System.in).nextLine());
    }
    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }

    public int getiD() {
        return iD;
    }

    private void setiD() {

    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTenMeo() {
        return tenMeo;
    }

    public void setTenMeo(String tenMeo) {
        this.tenMeo = tenMeo;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
