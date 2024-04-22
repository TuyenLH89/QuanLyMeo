package BKTMEO;

public class MeoModel extends Meo implements TiengMeoKeu{
    public MeoModel(int iD, int tuoi, String tenMeo, String giongMeo, String tiengKeu, boolean gioiTinh) {
        super(iD, tuoi, tenMeo, giongMeo, tiengKeu, gioiTinh);
    }

    public MeoModel(int tuoi, String tenMeo, boolean gioiTinh) {
        super(tuoi, tenMeo, gioiTinh);
    }

    public MeoModel(String giongMeo, String tiengKeu) {
        super(tiengKeu, giongMeo);
    }

    public MeoModel() {
    }
    public void hienThiThongTin(){
        if (isGioiTinh()){
            System.out.println("ID: "+getiD()+", tên mèo: "+getTenMeo()+", tuổi:"+getTuoi()+", giống mèo: "+getGiongMeo()+", tiếng kêu: "+getTiengKeu()+", giới tính: Đực");
            return;
        }
        System.out.println("ID: "+getiD()+", tên mèo: "+getTenMeo()+", tuổi:"+getTuoi()+", giống mèo: "+getGiongMeo()+", tiếng kêu: "+getTiengKeu()+", giới tính: Cái");
    }
    @Override
    public String tiengmeoKeu() {
        return getTiengKeu();
    }
}
