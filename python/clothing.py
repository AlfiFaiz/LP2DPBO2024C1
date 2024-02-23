#Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
#soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from product import Product

class Clothing(Product):
    def __init__(self, id_produk, nama, merek, harga, ukuran, material, jenis_kelamin):
        super().__init__(id_produk, nama, merek, harga)
        self.ukuran = ukuran
        self.material = material
        self.jenis_kelamin = jenis_kelamin

    def get_Ukuran(self):
        return self.ukuran

    def set_Ukuran(self, ukuran):
        self.ukuran = ukuran

    def get_Material(self):
        return self.material

    def set_Material(self, material):
        self.material = material

    def get_jenis_kelamin(self):
        return self.jenis_kelamin

    def set_jenis_kelamin(self, jenis_kelamin):
        self.jenis_kelamin = jenis_kelamin
