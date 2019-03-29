-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2018 at 12:31 AM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus_tubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_agt` int(11) NOT NULL,
  `password_agt` varchar(50) NOT NULL,
  `nama_agt` varchar(30) NOT NULL,
  `jenis_kelamin_agt` set('Laki-Laki','Perempuan') NOT NULL,
  `tgl_lahir_agt` date NOT NULL,
  `alamat_agt` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_agt`, `password_agt`, `nama_agt`, `jenis_kelamin_agt`, `tgl_lahir_agt`, `alamat_agt`) VALUES
(1012, 'dwisep', 'yoga', 'Laki-Laki', '2018-05-01', 'Jl. nagka'),
(1013, 'dwiyoga', 'septana', 'Laki-Laki', '1998-01-09', 'jl. timun'),
(1015, 'budil', 'Bedilaaa', 'Perempuan', '1998-05-03', 'pringsebu'),
(1017, 'dwie', 'yogadwie', 'Laki-Laki', '1996-09-05', 'Jl. sjsjsjsj');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `isbn` int(11) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `thn_terbit` int(11) NOT NULL,
  `kategori` varchar(15) NOT NULL,
  `stok_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`isbn`, `judul`, `thn_terbit`, `kategori`, `stok_buku`) VALUES
(12, 'asdasdas', 232, 'sada', 10),
(222, 'jjj', 222, 'asas', 5);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` int(11) NOT NULL,
  `nama_petugas` varchar(50) NOT NULL,
  `pass_petugas` varchar(50) NOT NULL,
  `tipe_petugas` int(11) NOT NULL COMMENT '1=Pendaftaran, 2=Peminjaman, 3=StokBuku'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `nama_petugas`, `pass_petugas`, `tipe_petugas`) VALUES
(2001, 'Yoga', 'dwiseptana', 1),
(2002, 'Dwi', 'septana', 2),
(2003, 'Septana', 'dwiyoga', 3);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_pp`
--

CREATE TABLE `transaksi_pp` (
  `kode_pinjam` int(11) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `id_agt` int(11) DEFAULT NULL,
  `isbn` int(11) DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `jumlah_buku` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_pp`
--

INSERT INTO `transaksi_pp` (`kode_pinjam`, `tgl_pinjam`, `id_agt`, `isbn`, `tgl_kembali`, `jumlah_buku`) VALUES
(1012, '0000-00-00', 0, 222, '0000-00-00', 0),
(1042, '0000-00-00', 0, 12, '0000-00-00', 0),
(10420, '2018-05-11', 1012, 12, '2018-05-25', 2),
(10444, '2018-05-12', 1012, 12, '2018-05-19', 2),
(11361, '2018-05-15', 1012, 12, '2018-05-24', 1),
(12657, '2018-05-10', 0, 12, '2018-05-16', 1),
(12676, '0000-00-00', 1012, 12, '0000-00-00', 0),
(13710, '2018-05-08', 1012, 12, '2018-05-24', 1),
(13793, '2018-05-12', 1012, 12, '2018-05-19', 2),
(14190, '0000-00-00', 0, 12, '0000-00-00', 0),
(15399, '0000-00-00', 0, 12, '0000-00-00', 0),
(16872, '0000-00-00', 0, 12, '0000-00-00', 0),
(18375, '0000-00-00', 0, 12, '0000-00-00', 0),
(18396, '0000-00-00', 0, 12, '0000-00-00', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_agt`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`isbn`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `transaksi_pp`
--
ALTER TABLE `transaksi_pp`
  ADD PRIMARY KEY (`kode_pinjam`),
  ADD KEY `id_agt` (`id_agt`),
  ADD KEY `isbn` (`isbn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
