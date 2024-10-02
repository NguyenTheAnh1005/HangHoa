package bai8;

public abstract class HangHoa {
		String maHang;
		String tenHang;
		double donGia;
		int soLuongTon;
		
		public HangHoa() {
			this("","xxx",0.0,0);
		}
		
		public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
			setMaHang(maHang);
			setTenHang(tenHang);
			setDonGia(donGia);
			setSoLuongTon(soLuongTon);		
		}
		public String getMaHang() {
			return maHang;
		}
		public void setMaHang(String maHang) {
			if (this.maHang != null)
				throw new IllegalArgumentException("Khong duoc sua.");
			if (maHang != null)
				this.maHang = maHang;
		}
		public String getTenHang() {
			return tenHang;
		}
		public void setTenHang(String tenHang) {
			if (tenHang!= null)
				this.tenHang = tenHang;
		}
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) {
			if (donGia >= 0)
				this.donGia = donGia;
			else
				throw new IllegalArgumentException("Don gia >=0.");
		}
		public int getSoLuongTon() {
			return soLuongTon;
		}
		public void setSoLuongTon(int soLuongTon) {
			if (donGia >= 0)
				this.soLuongTon = soLuongTon;
			else
				throw new IllegalArgumentException("So luong ton >=0.");
		}
		
		public abstract String danhGiaMucDoBanBuon();
		
		public abstract double tinhTienVAT();

		@Override
		public abstract String toString();
}
