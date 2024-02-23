<?php
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

require_once 'Product.php';

class Clothing extends Product {
    private $ukuran;
    private $material;
    private $jenis_kelamin;

    public function __construct($id_produk, $nama, $merek, $harga, $ukuran, $material, $jenis_kelamin) {
        parent::__construct($id_produk, $nama, $merek, $harga);
        $this->ukuran = $ukuran;
        $this->material = $material;
        $this->jenis_kelamin = $jenis_kelamin;
    }

    public function get_Ukuran() {
        return $this->ukuran;
    }

    public function set_Ukuran($ukuran) {
        $this->ukuran = $ukuran;
    }

    public function get_Material() {
        return $this->material;
    }

    public function set_Material($material) {
        $this->material = $material;
    }

    public function get_jenis_kelamin() {
        return $this->jenis_kelamin;
    }

    public function set_jenis_kelamin($jenis_kelamin) {
        $this->jenis_kelamin = $jenis_kelamin;
    }
}

?>
