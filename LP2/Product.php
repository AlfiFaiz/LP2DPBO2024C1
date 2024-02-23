<?php
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

class Product {
    private $id_produk;
    private $nama;
    private $merek;
    private $harga;

    public function __construct($id_produk, $nama, $merek, $harga) {
        $this->id_produk = $id_produk;
        $this->nama = $nama;
        $this->merek = $merek;
        $this->harga = $harga;
    }

    public function get_ID_produk() {
        return $this->id_produk;
    }

    public function set_ID_produk($id_produk) {
        $this->id_produk = $id_produk;
    }

    public function get_Nama() {
        return $this->nama;
    }

    public function set_Nama($nama) {
        $this->nama = $nama;
    }

    public function get_Merek() {
        return $this->merek;
    }

    public function set_Merek($merek) {
        $this->merek = $merek;
    }

    public function get_Harga() {
        return $this->harga;
    }

    public function set_Harga($harga) {
        $this->harga = $harga;
    }
}

?>
