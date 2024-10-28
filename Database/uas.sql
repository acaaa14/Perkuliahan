CREATE TABLE Login (
    login_id INT PRIMARY KEY AUTO_INCREMENT,
    pelanggan_id INT,
    username VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    role ENUM('pelanggan', 'admin') DEFAULT 'pelanggan',
    tanggal_dibuat TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (pelanggan_id) REFERENCES Pelanggan(pelanggan_id)
);
CREATE TABLE Pelanggan (
    pelanggan_id INT PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telepon VARCHAR(15),
    alamat TEXT,
    tanggal_dibuat TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE Produk (
    produk_id INT PRIMARY KEY AUTO_INCREMENT,
    nama_produk VARCHAR(100) NOT NULL,
    deskripsi TEXT,
    harga DECIMAL(10, 2) NOT NULL,
    stok INT DEFAULT 0,
    kategori VARCHAR(50),
    tanggal_dibuat TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE Konsultasi (
    konsultasi_id INT PRIMARY KEY AUTO_INCREMENT,
    pelanggan_id INT,
    tanggal_konsultasi TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    keluhan TEXT,
    rekomendasi TEXT,
    dokter VARCHAR(100),
    FOREIGN KEY (pelanggan_id) REFERENCES Pelanggan(pelanggan_id)
);
CREATE TABLE Treatment (
    treatment_id INT PRIMARY KEY AUTO_INCREMENT,
    konsultasi_id INT,
    nama_treatment VARCHAR(100) NOT NULL,
    deskripsi TEXT,
    harga DECIMAL(10, 2) NOT NULL,
    tanggal_treatment TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (konsultasi_id) REFERENCES Konsultasi(konsultasi_id)
);
CREATE TABLE Pesanan (
    pesanan_id INT PRIMARY KEY AUTO_INCREMENT,
    pelanggan_id INT,
    tanggal_pesanan TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_harga DECIMAL(10, 2),
    jenis_pesanan ENUM('online', 'toko_fisik') NOT NULL,
    FOREIGN KEY (pelanggan_id) REFERENCES Pelanggan(pelanggan_id)
);
CREATE TABLE Detail_Pesanan (
    detail_pesanan_id INT PRIMARY KEY AUTO_INCREMENT,
    pesanan_id INT,
    produk_id INT,
    kuantitas INT NOT NULL,
    harga DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (pesanan_id) REFERENCES Pesanan(pesanan_id),
    FOREIGN KEY (produk_id) REFERENCES Produk(produk_id)
);
CREATE TABLE Pembayaran (
    pembayaran_id INT PRIMARY KEY AUTO_INCREMENT,
    pesanan_id INT,
    tanggal_pembayaran TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    jumlah DECIMAL(10, 2),
    metode_pembayaran ENUM('kartu_kredit', 'transfer_bank', 'tunai', 'dompet_digital') NOT NULL,
    FOREIGN KEY (pesanan_id) REFERENCES Pesanan(pesanan_id)
);
CREATE TABLE Pesanan_Online (
    pesanan_online_id INT PRIMARY KEY AUTO_INCREMENT,
    pesanan_id INT,
    alamat_pengiriman TEXT,
    status ENUM('menunggu', 'dikirim', 'diterima', 'dibatalkan'),
    tanggal_pengiriman DATE,
    FOREIGN KEY (pesanan_id) REFERENCES Pesanan(pesanan_id)
);
CREATE TABLE Pesanan_Toko_Fisik (
    pesanan_toko_fisik_id INT PRIMARY KEY AUTO_INCREMENT,
    pesanan_id INT,
    lokasi_toko VARCHAR(100),
    nama_kasir VARCHAR(100),
    FOREIGN KEY (pesanan_id) REFERENCES Pesanan(pesanan_id)
);
