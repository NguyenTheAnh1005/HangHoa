package bai8;

public interface QuanLyBanHang {
	boolean themHangHoa(HangHoa hangHoa);
	HangHoa[] layThongTinToanBoHangHoa();
	HangHoa[] layThongTinTungLoaiHangHoa(String loaiHang);
	HangHoa timKiem(String maHang);
	void SapXepDSTheoTenTangDan();
}
