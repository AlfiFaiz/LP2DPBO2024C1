#Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
#soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

class Product:
    def __init__(self, id_produk, nama, merek, harga):
        self.id_produk = id_produk
        self.nama = nama
        self.merek = merek
        self.harga = harga

    def get_ID_produk(self):
        return self.id_produk

    def set_ID_produk(self, id_produk):
        self.id_produk = id_produk

    def get_Nama(self):
        return self.nama

    def set_Nama(self, nama):
        self.nama = nama

    def get_Merek(self):
        return self.merek

    def set_Merek(self, merek):
        self.merek = merek

    def get_Harga(self):
        return self.harga

    def set_Harga(self, harga):
        self.harga = harga
