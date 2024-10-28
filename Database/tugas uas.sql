show databases;
show tables;
create database penjualan_akun;
use penjualan_akun;
show engines;

create table akun(
kodeakun varchar(100) not null,
platform enum ('canva', 'netflix', 'spotify', 'disney', 'wetv', 'wattpad', 'loklok'),
harga int unsigned not null default 0,
status_akun enum ('tersedia', 'tidak tersedia') not null,
stok_akun_tersedia int not null default 0,
masa_aktif enum ('1 bulan', '3 bulan', '1 tahun') not null,
primary key (kodeakun)

) engine = InnoDB;

drop table akun;

create table pelanggan(
kodepelanggan varchar (50),
nama varchar (30) not null,
email varchar (40) not null,
nomor_telepon int unsigned not null default 0,
primary key (kodepelanggan)
) engine = InnoDB; 
drop table pelanggan;
 
create table transaksi ( 
id_transaksi int auto_increment primary key,
kodeakun varchar(100) not null,
kodepelanggan varchar (50),
nama varchar (30) not null,
platform enum ('canva', 'netflix', 'spotify', 'disney', 'wetv', 'wattpad', 'loklok'),
harga int unsigned not null default 0,
masa_aktif enum ('1 bulan', '3 bulan', '1 tahun') not null,
nomor_telepon varchar (80) not null default 0,
email varchar (40) not null,
Waktutransaksi timestamp default current_timestamp on update current_timestamp
);
drop table transaksi; 

insert into akun (kodeakun, platform, harga, status_akun,stok_akun_tersedia,masa_aktif)
values ('01', 'canva', '15000', 'tersedia','2', '1 bulan'),
('02', 'canva', '17000', 'tersedia','8', '3 bulan'),
('03', 'canva', '20000', 'tersedia','3', '1 tahun'),
('11', 'netflix', '25000', 'tidak tersedia', '0', '1 bulan'),
('12', 'netflix', '30000', 'tersedia','4', '3 bulan'),
('13', 'netflix', '100000', 'tersedia','4', '1 tahun'),
('21', 'spotify', '15000', 'tidak tersedia','0', '1 bulan'),
('22', 'spotify', '18000', 'tersedia','4', '3 bulan'),
('23', 'spotify', '22000', 'tersedia', '2','1 tahun'),
('31', 'disney', '19000', 'tidak tersedia','0', '1 bulan'),
('32', 'disney', '22000', 'tersedia','2', '3 bulan'),
('33', 'disney', '30000', 'tersedia','2', '1 tahun'),
('41', 'wetv', '15000', 'tersedia', '3','1 bulan'),
('42', 'wetv', '17000', 'tersedia', '3','3 bulan'),
('43', 'wetv', '22000', 'tersedia', '3','1 tahun'),
('51', 'wattpad', '10000', 'tersedia','3', '1 bulan'),
('52', 'wattpad', '12000', 'tersedia', '3','3 bulan'),
('53', 'wattpad', '15000', 'tersedia', '3','1 tahun'),
('61', 'loklok', '11000', 'tersedia', '3','1 bulan'),
('62', 'loklok', '13000', 'tersedia', '3', '3 bulan'),
('63', 'loklok', '17000', 'tersedia', '3','1 tahun');

insert into pelanggan(kodepelanggan, nama, email, nomor_telepon)
values 
('001', 'aca', 'aca@gmail.com', '0856925390'),
('002', 'rosita', 'rosita@gmail.com', '0856925370'),
('003', 'sita', 'sita@gmail.com', '085692580');

insert into transaksi(id_transaksi, kodeakun, kodepelanggan, nama, platform, harga, masa_aktif, nomor_telepon, email)
values
('010', '01', '001', 'aca', 'canva', '15000', '1 bulan', '08569253900', 'aca@gmail.com');


alter table transaksi add  constraint fk_Pelanggan foreign key (kodepelanggan ) references pelanggan (kodepelanggan);
alter table transaksi add  constraint fk_akun foreign key (kodeakun) references akun (kodeakun);

DELIMITER //

CREATE TRIGGER update_stok_akun 
AFTER INSERT ON transaksi 
FOR EACH ROW 
BEGIN
    UPDATE akun
    SET stok_akun_tersedia = 4
    WHERE kodeakun = '02';
END //

DELIMITER ;

show triggers;
SELECT * FROM akun WHERE kodeakun IN ('02');



describe pelanggan;
describe akun; 

select * from pelanggan;
select * from akun;
select * from transaksi;

UPDATE akun
    SET stok_akun_tersedia = 4
    WHERE kodeakun = '02';
    
drop table transaksi;

DELIMITER //
drop procedure update_stok_akun;
create procedure update_stok_akun()
BEGIN
    UPDATE akun
    SET stok_akun_tersedia = 3
    WHERE kodeakun = '13';
END //
DELIMITER ;

call update_stok_akun();
select * from akun;

SELECT 
    t.id_transaksi,
    t.kodeakun,
    a.platform,
    a.harga,
    a.status_akun,
    a.stok_akun_tersedia,
    p.kodepelanggan,
    p.nama,
    p.email,
    t.Waktutransaksi
FROM 
    transaksi t
JOIN 
    akun a ON t.kodeakun = a.kodeakun
JOIN 
    pelanggan p ON t.kodepelanggan = p.kodepelanggan;

