create database cake_pop;
use cake_pop;

CREATE TABLE Pelanggan (
    pelanggan_id INT PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telepon VARCHAR(15),
    alamat TEXT
);

CREATE TABLE Produk (
    produk_id INT PRIMARY KEY AUTO_INCREMENT,
    pelanggan_id INT,
    nama_produk ENUM('birthday cake', 'brownis', 'puding', 'brownis cheese cake', 'coklat cake', 'cookies' ) NOT NULL,
    harga DECIMAL(10, 2) NOT NULL,
    stok INT DEFAULT 0,
    tanggal_exp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (pelanggan_id) REFERENCES Pelanggan(pelanggan_id)
);

CREATE TABLE Pesanan (
    pesanan_id INT PRIMARY KEY AUTO_INCREMENT,
    pelanggan_id INT,  
    produk_id INT,     
    tanggal_pesanan TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_harga DECIMAL(10, 2),
    jenis_pesanan ENUM('online', 'toko_fisik') NOT NULL,
    FOREIGN KEY (pelanggan_id) REFERENCES Pelanggan(pelanggan_id),
    FOREIGN KEY (produk_id) REFERENCES Produk(produk_id)
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

CREATE TABLE Pembayaran (
    pembayaran_id INT PRIMARY KEY AUTO_INCREMENT,
    pesanan_id INT,
    nama_produk VARCHAR(100) NOT NULL,
    harga DECIMAL(10, 2) NOT NULL,
    tanggal_pembayaran TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    jumlah DECIMAL(10, 2),
    metode_pembayaran ENUM('kartu_kredit', 'transfer_bank', 'tunai') NOT NULL,
    FOREIGN KEY (pesanan_id) REFERENCES Pesanan(pesanan_id)
);

insert into Produk(produk_id, nama_produk, harga, stok, tanggal_exp)
values ( 010,'cookies', '25000', '5', '2023-2-11');

INSERT INTO Pelanggan (nama, email, telepon, alamat)
VALUES ('Aca', 'aca@gmail.com', '0856925398', 'Tangerang');

INSERT INTO Pesanan (pesanan_id, pelanggan_id, produk_id, total_harga, jenis_pesanan)
VALUES (001, 1,010, 25000, 'online');

insert into Pesanan_Online( pesanan_id, alamat_pengiriman,status,tanggal_pengiriman)
values( '101', 'tangerang', 'dikirim','2023-1-3');

insert into Pesanan_Toko_Fisik( pesanan_id, lokasi_toko, nama_kasir)
values('001', 'jakarta barat', 'solomon');

insert into Pembayaran( pesanan_id, nama_produk, harga, jumlah, metode_pembayaran)
values('101', 'cookies', '25000', '1', 'transfer_bank');

drop table Produk;
DROP table pembayaran;
drop table Produk;
drop table Pelanggan;
drop table Pesanan;
drop table Pesanan_Online;
drop table Pesanan_Toko_Fisik;

select * from pembayaran;
select * from Produk;
select * from Pesanan;
select * from Pesanan_Online;
select * from Pesanan_Toko_Fisik;
