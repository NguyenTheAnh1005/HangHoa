package bai8;

public class HangDienMay extends HangHoa {
	private static final double VAT_DIEN_MAY = 0.1;
	int thoiGianBaoHanh;
	double congSuat;
	
	public HangDienMay() {
		super();
		this.thoiGianBaoHanh = 0;
		this.congSuat = 0.0;
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if (thoiGianBaoHanh >= 0)
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		else
			throw new IllegalArgumentException("Thoi gian bao hanh theo thang >=0");
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		if (congSuat >=0)
			this.congSuat = congSuat;
		else
			throw new IllegalArgumentException("Cong suat (KW) >=0");
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
		return (this.soLuongTon < 3)
				? "ban duoc" : "khong danh gia";
	}
	@Override
	public double tinhTienVAT() {
		return donGia * VAT_DIEN_MAY;
	}
	@Override
	public String toString() {
		return String.format("%5s %40s %-10lf.2 %-5d %-5d %-10lf %20s %-10lf",
				maHang, tenHang, donGia, soLuongTon, thoiGianBaoHanh, congSuat, danhGiaMucDoBanBuon(), tinhTienVAT());
	}
	 
}
