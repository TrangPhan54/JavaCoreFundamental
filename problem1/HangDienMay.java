package problem1;

public class HangDienMay extends HangHoa {
    private double thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, double donGia, double soLuongTon, double thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public String review (){
        if (super.getSoLuongTon() < 3){
            return "ban duoc";
        }
        else {
            return "Khong danh gia";
        }
    }

}
