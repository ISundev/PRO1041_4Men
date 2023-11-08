
USE ASMJAVA3
GO
Drop database DuAn1_4Men
go
Create database DuAn1_4Men
go
Use DuAn1_4Men
go

Create table TaiKhoan(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenDangNhap varchar(30),
	MatKhau varchar(15),
	VaiTro nvarchar(20),
	TrangThai BIT
)
Insert into TaiKhoan(TenDangNhap,MatKhau,VaiTro,TrangThai) values('NV0001','1',N'Nhân Viên',0)
select * from TaiKhoan
Create table NhanVien(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDTaiKhoan uniqueidentifier,
	MaNV varchar(30),
	HoTen nvarchar(40),
	GioiTinh nvarchar(10),
	NgaySinh date,
	DiaChi nvarchar(60),
	SDT varchar(15),
	Email varchar(30),
	TrangThai BIT
	FOREIGN KEY(IDTaiKhoan) REFERENCES TaiKhoan(ID)
)
Insert into NhanVien(IDTaiKhoan,MaNV,HoTen,GioiTinh,NgaySinh,DiaChi,SDT,Email,TrangThai) 
values('DEFCA3BB-BE3B-40BC-956E-471E7B88E554','NV0001',N'Lương Tuấn Đạt',N'Nam','2004-11-14',
N'Huyện Thanh Sơn tỉnh Phú Thọ','0974567728','Datltph32151@gmail.com',0)
select * from NhanVien
Create table KhachHang(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	MaKH varchar(30),
	HoTen nvarchar(40),
	NgaySinh date,
	DiaChi nvarchar(60),
	SDT varchar(15),
	Email varchar(30)
)
Insert into KhachHang(MaKH,HoTen,NgaySinh,DiaChi,SDT,Email) 
values('KH0001',N'Lương Tuấn Đạt','2004-11-14',N'Huyện Thanh Sơn tỉnh Phú Thọ','0974567728','Datltph32151@gmail.com')
select * from KhachHang
Create table GiamGia(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDML uniqueidentifier,
	MaGG varchar(30),
	Ten nvarchar(40),
	GiaTri float,
	NgayBatDau date,
	NgayHetHan date,
	GhiChu nvarchar(60),
	TrangThai BIT,
	FOREIGN KEY(IDML) REFERENCES LoaiGG(ID)
)
Insert into GiamGia(IDML,MaGG,Ten,GiaTri,NgayBatDau,NgayHetHan,GhiChu,TrangThai) values
('D648EAAA-74CA-4411-98F1-D426EB98FE66','GG0001',N'Quốc tế phụ nữ',100000,GETDATE(),GETDATE()+10,N'Mừng ngày quốc tế phụ nữ 20/10 tặng giảm giá',0)
Insert into GiamGia(IDML,MaGG,Ten,GiaTri,NgayBatDau,NgayHetHan,GhiChu,TrangThai) values
('C8BC688F-4011-46A5-A1EE-19CA20177090','GG0002',N'Nhà giáo Việt Nam',10,GETDATE(),GETDATE()+10,N'Mừng ngày nhà giáo Việt Nam 20/11 tặng giảm giá',0)
select * from GiamGia
Create table LoaiGG(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenLoai nvarchar(40)
)
insert into LoaiGG(TenLoai) values (N'Giảm giá theo số tiền')
insert into LoaiGG(TenLoai) values (N'Giảm giá theo %')
select * from LoaiGG



Create table PhuongThucThanhToan(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenPTTT nvarchar(30)
)
Create table HoaDon(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDGG uniqueidentifier,
	IDNV uniqueidentifier,
	IDKH uniqueidentifier,
	IDPTTT uniqueidentifier,
	MaHD varchar(30),
	TongTienGiam float,
	ThoiGianTao date,
	ThoiGianThanhToan date,
	TongThanhToan float,
	TrangThai BIT,
	FOREIGN KEY(IDGG) REFERENCES GiamGia(ID),
	FOREIGN KEY(IDNV) REFERENCES NhanVien(ID),
	FOREIGN KEY(IDKH) REFERENCES KhachHang(ID),
	FOREIGN KEY(IDPTTT) REFERENCES PhuongThucThanhToan(ID)
)





Create table SanPham(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	MaSP varchar(15),
	TenSP nvarchar(30),
	TrangThai BIT
)
Create table ThuongHieu(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenTH nvarchar(30)
)
Create table XuatXu(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenXX nvarchar(30)
)
Create table MauSac(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenMS nvarchar(30)
)
Create table ChatLieu(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenCL nvarchar(30)
)
Create table PhanLoai(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	TenPL nvarchar(30)
)
Create table SanPhamChiTiet(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDSP uniqueidentifier,
	IDCL uniqueidentifier,
	IDPL uniqueidentifier,
	IDTH uniqueidentifier,
	IDXX uniqueidentifier,
	IDMS uniqueidentifier,
	KhoiLuong float,
	Anh varchar(300),
	SoLuong int,
	MoTa nvarchar(100),
	KichThuoc varchar(15),
	Gia float,
	FOREIGN KEY(IDSP) REFERENCES SanPham(ID),
	FOREIGN KEY(IDCL) REFERENCES ChatLieu(ID),
	FOREIGN KEY(IDPL) REFERENCES PhanLoai(ID),
	FOREIGN KEY(IDTH) REFERENCES ThuongHieu(ID),
	FOREIGN KEY(IDXX) REFERENCES XuatXu(ID),
	FOREIGN KEY(IDMS) REFERENCES MauSac(ID),
)
Create table HoaDonChiTiet(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDHD uniqueidentifier,
	IDSPCT uniqueidentifier,
	SoLuongSP int,
	GiaTien float,
	TongTienMua float,
	GhiChu nvarchar(60),
	FOREIGN KEY(IDHD) REFERENCES HoaDon(ID),
	FOREIGN KEY(IDSPCT) REFERENCES SanPhamChiTiet(ID)
)
Create table DoiHang(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDHD uniqueidentifier,
	IDKH uniqueidentifier,
	IDNV uniqueidentifier,
	MaDH varchar(15),
	ThoiGianDoi date,
	TrangThai BIT,
	FOREIGN KEY(IDHD) REFERENCES HoaDon(ID),
	FOREIGN KEY(IDKH) REFERENCES KhachHang(ID),
	FOREIGN KEY(IDNV) REFERENCES NhanVien(ID)
)
Create table DoiHangChiTiet(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDDH uniqueidentifier,
	IDHDCT uniqueidentifier,
	IDSPCT uniqueidentifier,
	SoLuongDoi int,
	GiaDoi float,
	FOREIGN KEY(IDDH) REFERENCES DoiHang(ID),
	FOREIGN KEY(IDHDCT) REFERENCES HoaDonChiTiet(ID),
	FOREIGN KEY(IDSPCT) REFERENCES SanPhamChiTiet(ID)
)
Create table PhieuDoi(
	ID uniqueidentifier not null DEFAULT (newid()) primary key,
	IDDH uniqueidentifier,
	MaPD varchar(15),
	TenPD nvarchar,
	ThoiGianDoi date,
	SoLuong int,
	SoTien float,
	GhiChu nvarchar(60),
	FOREIGN KEY(IDDH) REFERENCES DoiHang(ID)
)