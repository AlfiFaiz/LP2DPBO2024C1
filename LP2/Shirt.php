<?php

/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

require_once 'Clothing.php';

class Shirt extends Clothing {
    private $warna;
    private $jenis_lengan;

    public function __construct($id_produk, $nama, $merek, $harga, $ukuran, $material, $jenis_kelamin, $warna, $jenis_lengan) {
        parent::__construct($id_produk, $nama, $merek, $harga, $ukuran, $material, $jenis_kelamin);
        $this->warna = $warna;
        $this->jenis_lengan = $jenis_lengan;
    }

    public function get_Warna() {
        return $this->warna;
    }

    public function set_Warna($warna) {
        $this->warna = $warna;
    }

    public function getS_tipe_lengan() {
        return $this->jenis_lengan;
    }

    public function setS_tipe_lengan($jenis_lengan) {
        $this->jenis_lengan = $jenis_lengan;
    }
}

?>
