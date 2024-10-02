package bai8;
import java.time.LocalDate;
public class HangThucPham extends HangHoa {
	private static final double VAT_THUC_PHAM = 0.05;
	String nhaCungCap;
	LocalDate ngaySanXuat;
	LocalDate ngayHetHan;
	public HangThucPham() {
		super();
		this.nhaCungCap = "";
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = LocalDate.now();
	}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
		
	}
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			throw new IllegalArgumentException("Ngay san xuat phai nho hon ngay hien tai.");
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(this.ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			throw new IllegalArgumentException("Ngay het han phai lon hon ngay san xuat.");
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
		return (this.soLuongTon > 0 && ngayHetHan.isBefore(LocalDate.now())) ? "kho ban" : "khong danh gia";
	}
	@Override
	public double tinhTienVAT() {
		return donGia*VAT_THUC_PHAM;
	}
	@Override
	public String toString() {
		return String.format("%5s %40s %-10lf.2 %-5d %30S %-10d %-10d %20s %-10lf",
				maHang, tenHang, donGia, soLuongTon, nhaCungCap, ngaySanXuat, ngayHetHan, danhGiaMucDoBanBuon(), tinhTienVAT());
	}
}
