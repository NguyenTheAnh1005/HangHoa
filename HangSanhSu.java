package bai8;
import java.time.LocalDate;
public class HangSanhSu extends HangHoa {
	private static final double VAT_SANH_SU = 0.1;
	String nhaSanXuat;
	LocalDate ngayNhapKho;
	
	public HangSanhSu() {
		super();
		this.nhaSanXuat = "";
		this.ngayNhapKho = LocalDate.now();
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		setNgayNhapKho(ngayNhapKho);		
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
		if (ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			throw new IllegalArgumentException("Ngay nhap kho phai truoc ngay hien tai.");
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
		return (this.soLuongTon >50 && this.ngayNhapKho.compareTo(LocalDate.now()) <= 10)
				? "ban cham" : "khong danh gia";
	}
	@Override
	public double tinhTienVAT() {
		return donGia*VAT_SANH_SU;
	}
	@Override
	public String toString() {
		return String.format("%5s %40s %-10lf.2 %-5d %30s %-10d %20s %-10lf",
				maHang, tenHang, donGia, soLuongTon, nhaSanXuat, ngayNhapKho, danhGiaMucDoBanBuon(), tinhTienVAT());
	}
}
