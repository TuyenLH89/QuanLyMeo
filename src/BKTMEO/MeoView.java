package BKTMEO;

import java.util.Scanner;

public class MeoView {
    public void menu(){
        System.out.println("--------------------Quản lý mèo cho mẹ----------------------------");
        System.out.println("1.Thêm mèo.");
        System.out.println("2.Xóa Mèo theo ID.");
        System.out.println("3.Hiển thị toàn bộ mèo.");
        System.out.println("4.Hiển thị mèo theo ID.");
        System.out.println("5.Thay đổi tiếng kêu theo ID.");
        System.out.println("6.Thoát chương trình.");
    }
    public void thucThi(){
        int luaChon = 0;
        do {
            menu();
            try {
                System.out.print("Nhập lựa chọn: ");
                luaChon = new Scanner(System.in).nextInt();
                if (luaChon< 0 || luaChon >6){
                    System.out.println("Không có lựa chọn này...Hãy nhập lại");
                    thucThi();
                }
            }catch (Exception e){
                System.out.println("Nhập sai định dạng...Hãy nhập lại");
                thucThi();
            }
            switch (luaChon) {
                case 1 -> MeoConTroller.themMeo();
                case 2 -> {
                    int x = nhapID();
                    MeoConTroller.xoaMeoTheoID(x);
                }
                case 3 -> MeoConTroller.hienThiToanBoMeo();
                case 4 -> {
                    int y = nhapID();
                    MeoConTroller.hienThiMeoTheoID(y);
                }
                case 5 -> {
                    int z = nhapID();
                    MeoConTroller.thayDoiTiengKeu(z);
                }
                case 6 -> System.exit(0);
            }
        }while (luaChon > 0 && luaChon < 7);
    }
    public int nhapID(){
        int n = 0;
        try {
            System.out.print("Nhập ID: ");
            n = new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println("Nhập sai định dạng...Hãy nhập lại");
            nhapID();
        }
        return n;
    }
}
