#Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
#soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from clothing import Clothing

class Shirt(Clothing):
    def __init__(self, id_produk, nama, merek, harga, ukuran, material, jenis_kelamin, warna, jenis_lengan):
        super().__init__(id_produk, nama, merek, harga, ukuran, material, jenis_kelamin)
        self.warna = warna
        self.jenis_lengan = jenis_lengan

    def get_Warna(self):
        return self.warna

    def set_Warna(self, warna):
        self.warna = warna

    def get_S_tipe_lengan(self):
        return self.jenis_lengan

    def set_S_tipe_lengan(self, jenis_lengan):
        self.jenis_lengan = jenis_lengan
