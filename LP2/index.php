<?php
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

require_once 'Shirt.php';

// Inisialisasi daftar produk
$products = [];

// Menambahkan data produk secara dinamis
$products[] = new Shirt(1, "Kemeja Polos", "H&B", 29.99, "M", "Katun", "Pria", "Biru", "Panjang");
$products[] = new Shirt(2, "Baju Polo ", "Uniqko", 49.99, "L", "Sutra", "Wanita", "Merah", "Pendek");
$products[] = new Shirt(3, "Baju Polo ", "4Second", 39.99, "XL", "Katun", "Pria", "Hijau", "Panjang");

// Tampilkan data produk dalam bentuk tabel
echo "MENAMPILKAN DATA";
echo "<table border='1'>
        <tr>
            <th>ID</th>
            <th>Nama</th>
            <th>Merek</th>
            <th>Harga</th>
            <th>Ukuran</th>
            <th>Material</th>
            <th>Jenis Kelamin</th>
            <th>Warna</th>
            <th>Tipe Lengan</th>
        </tr>";

foreach ($products as $product) {
    $shirt = $product;
    echo "<tr>
            <td>{$shirt->get_ID_produk()}</td>
            <td>{$shirt->get_Nama()}</td>
            <td>{$shirt->get_Merek()}</td>
            <td>{$shirt->get_Harga()}</td>
            <td>{$shirt->get_Ukuran()}</td>
            <td>{$shirt->get_Material()}</td>
            <td>{$shirt->get_jenis_kelamin()}</td>
            <td>{$shirt->get_Warna()}</td>
            <td>{$shirt->getS_tipe_lengan()}</td>
        </tr>";
}

echo "</table>";

?>
