package problem1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DanhSachHangHoa {
    private Set <HangHoa> danhSachHangHoa = new HashSet<>();


    public void themHangHoa (HangHoa hangHoa){
        danhSachHangHoa.add(hangHoa);
        System.out.println("Them Hang Hoa Thanh Cong");
    }
    public void inDanhSachHangHoa (){
        System.out.println("Danh sach cac hang hoa la");
        for (HangHoa h: danhSachHangHoa){
            System.out.println(h);
        }
    }
    public void inDanhSachThucPham (){
        System.out.println("Danh sach cac thuc pham");
        for (HangHoa h: danhSachHangHoa){
            if (h instanceof HangThucPham){
                System.out.println(h);
            }
        }
    }
    public void inDanhSachDienMay (){
        System.out.println("danh sach hang dien may");
        for (HangHoa h : danhSachHangHoa){
            if (h instanceof HangDienMay){
                System.out.println(h);
            }
        }
    }
    public void inDanhSachSanhSu (){
        System.out.println("danh sach hang sanh su");
        for (HangHoa h: danhSachHangHoa){
            if (h instanceof HangSanhSu){
                System.out.println(h);
            }
        }
    }
    public HangHoa timKiem (String id){
        List <HangHoa> danhSachTamThoi = new ArrayList<>(danhSachHangHoa);
        HangHoa hangHoaTam = null;
        for (HangHoa h: danhSachTamThoi){
            if (id == h.getMaHang()){
                hangHoaTam= h;
                break;
            }
        }
        return hangHoaTam;
    }


}
