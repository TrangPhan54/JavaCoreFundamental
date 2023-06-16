package problem1;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
   private String nhaSanXuat;
   private LocalDate ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, double donGia, double soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    @Override
    public String review (){
        if (super.getSoLuongTon()>50 && LocalDate.now().getDayOfMonth() - getNgayNhapKho().getDayOfMonth()>10){
            return "Ban cham";
        }
        else {
            return "Khong danh gia";
        }

    }
}
