package BKTMEO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeoConTroller {
    //danh sách chứa đầy đủ thuộc tính của mèo
    public static List<MeoModel> meoModelList = new ArrayList<>();
    //danh sách chứa giống mèo và tiếng kêu của mỗi giống mèo
    public static List<MeoModel> meoList = new ArrayList<>();
    //khởi tạo các loại mèo đã nuôi sẵn
    static {
        MeoModel meoAnhLongDai = new MeoModel(111,2,"Mèo ALD", "Mèo Anh Lông Dài","Tôi là mèo anh lông dài",true);
        MeoModel meoAnhLongNgan = new MeoModel(222,3,"Mèo ALN", "Mèo Anh Lông Ngắn","Tôi là mèo anh lông ngắn",false);
        MeoModel meoBaTu = new MeoModel(333,4,"Mèo BT","Mèo Ba Tư","Tôi là mèo ba tư", true);
        MeoModel meoNga = new MeoModel(444,1,"Mèo N","Mèo Nga","Tôi là mèo nga",false);
        meoModelList.add(meoAnhLongDai);
        meoModelList.add(meoAnhLongNgan);
        meoModelList.add(meoBaTu);
        meoModelList.add(meoNga);
        meoList.add(new MeoModel("Mèo Anh Lông Dài","Tôi là mèo anh lông dài"));
        meoList.add(new MeoModel("Mèo Anh Lông Ngắn","Tôi là mèo anh lông ngắn"));
        meoList.add(new MeoModel("Mèo Ba Tư","Tôi là mèo ba tư"));
        meoList.add(new MeoModel("Mèo Nga","Tôi là mèo nga"));
    }

    public static void themMeo(){
        //tạo một đối tượng mèo mới
        MeoModel model = new MeoModel();
        //hiển thị danh sách các giống mèo đang nuôi
        System.out.println("Các giống mèo đã có:");
        for (int i = 0; i < meoList.size(); i++) {
            System.out.println((i+1)+". "+meoList.get(i).getGiongMeo());
        }
        //xét xem giống mèo thêm vào đã tồn tại chưa
        model.nhapGiongMeo();
        boolean check = false;
        for (MeoModel value : meoList) {
            if (value.getGiongMeo().equals(model.getGiongMeo())) {
                model.setTiengKeu(value.getTiengKeu());
                check = true;
                break;
            }
        }
        //tồn tại rồi thì thêm các thuộc tính còn lại
        if (check){
            MeoConTroller.checkNhapID(model);
            model.nhapTuoi();
            model.nhapTen();
            model.nhapGioiTinh();
            meoModelList.add(model);
            System.out.println("Đã thêm mèo thành công");
        }else {
            //chưa thì thêm mới hết thuộc tính
            System.out.println("Bạn đang thêm giống mèo mới. Hãy nhập các thông tin bên dưới");
            MeoConTroller.checkNhapID(model);
            model.nhapTen();
            model.nhapTuoi();
            model.nhapTiengKeu();
            model.nhapGioiTinh();
            meoModelList.add(model);
            meoList.add(new MeoModel(model.getGiongMeo(), model.getTiengKeu()));
            System.out.println("Đã thêm mèo thành công");
        }
    }
    public static void checkNhapID(MeoModel model){
        boolean checkID;
        do {
            checkID = false;
            model.nhapID();
            for (MeoModel meoModel : meoModelList) {
                if (meoModel.getiD() == model.getiD()) {
                    System.out.println("ID: " + model.getiD() + " đã tồn tại. Hãy nhập lại");
                    checkID = true;
                    break;
                }
            }
        }while (checkID);
    }
    public static void xoaMeoTheoID(int iD){
        boolean check = false;
        for (int i = 0; i < meoModelList.size(); i++) {
            if (meoModelList.get(i).getiD() == iD){
                meoModelList.remove(i);
                check = true;
            }
        }
        if (check) {
            System.out.println("Đã xóa mèo thành công");
            return;
        }
        System.out.println("ID: "+iD+" không tồn tại");
    }
    public static void hienThiToanBoMeo(){
        for (MeoModel meoModel : meoModelList) {
            meoModel.hienThiThongTin();
        }
    }
    public static void hienThiMeoTheoID(int iD){
        boolean check = true;
        for (MeoModel m: meoModelList) {
            if (m.getiD() == iD){
                m.hienThiThongTin();
                check = false;
            }
        }
        if (check){
            System.out.println("Không có ID: "+iD);
        }
    }
    public static void thayDoiTiengKeu(int iD){
        boolean check = true;
        for (MeoModel m: meoModelList) {
            if (m.getiD() == iD){
                System.out.print("Nhập tiếng kêu mới: ");
                String s = new Scanner(System.in).nextLine();
                m.setTiengKeu(s);
                System.out.println("Đã thay đổi tiếng mèo thành công");
                check = false;
            }
        }
        if (check){
            System.out.println("Không có ID: "+iD);
        }
    }
}
