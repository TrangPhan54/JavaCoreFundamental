package problem1;

import java.time.LocalDate;

public class HangThucPham extends HangHoa{
    private String ngayCungCap;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    private final double VAT = 1.05;


    public HangThucPham(String maHang, String tenHang, double donGia, double soLuongTon, String ngayCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.ngayCungCap = ngayCungCap;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgayCungCap() {
        return ngayCungCap;
    }

    public void setNgayCungCap(String ngayCungCap) {
        this.ngayCungCap = ngayCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    @Override
    public String review (){
        if (super.getSoLuongTon() > 0 && LocalDate.now().isAfter(getNgayHetHan())){
            return "Kho ban";
        }
        else {
            return "Khong danh gia";
        }
    }
}
