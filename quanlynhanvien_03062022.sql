/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE `nhanvien` (
  `manv` varchar(20) NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `diachi` varchar(255) NOT NULL,
  `gioitinh` varchar(50) NOT NULL,
  `luong` int(11) NOT NULL,
  PRIMARY KEY (`manv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `sanpham`;
CREATE TABLE `sanpham` (
  `id_sanpham` int(11) NOT NULL AUTO_INCREMENT,
  `id_danhmuc` int(11) DEFAULT NULL,
  `tensanpham` varchar(255) DEFAULT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `gia` double DEFAULT NULL,
  `soluongton` int(11) DEFAULT NULL,
  `mashop` int(11) DEFAULT NULL,
  `id_ncc` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_sanpham`),
  UNIQUE KEY `id_sanpham` (`id_sanpham`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE `taikhoan` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `hoten` varchar(255) DEFAULT NULL,
  `diachi` varchar(255) DEFAULT NULL,
  `sdt` varchar(12) DEFAULT NULL,
  `chucnang` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `nhanvien` (`manv`, `hoten`, `diachi`, `gioitinh`, `luong`) VALUES
('NV001', 'Phạm Phong Phú Cường', '39/8 Nhất Chi Mai', 'Nam', 590000);
INSERT INTO `nhanvien` (`manv`, `hoten`, `diachi`, `gioitinh`, `luong`) VALUES
('NV002', 'Nguyen Van A', '227 Nguyễn Văn Cừ', 'Nam', 760000);
INSERT INTO `nhanvien` (`manv`, `hoten`, `diachi`, `gioitinh`, `luong`) VALUES
('NV003', 'Huỳnh Thị C', '72 Nguyễn Thị Minh Khai', 'Nữ', 2100000);
INSERT INTO `nhanvien` (`manv`, `hoten`, `diachi`, `gioitinh`, `luong`) VALUES
('NV004', 'Nguyễn Trần Thanh Tú', '33 Nguyễn Thị Thạch', 'Nữ', 435000);



INSERT INTO `taikhoan` (`username`, `password`, `hoten`, `diachi`, `sdt`, `chucnang`) VALUES
('phamcuong2751', '1234', 'abc', '213i2', '3289479', 'k32o4983294');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;