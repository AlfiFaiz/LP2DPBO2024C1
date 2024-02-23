
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Product {
private:
    int id_produk;
    string nama;
    string merek;
    double harga;

public:
    Product(int id_produk, string nama, string merek, double harga)
        : id_produk(id_produk), nama(nama), merek(merek), harga(harga) {}

    int get_ID_produk() const {
        return id_produk;
    }

    void set_ID_produk(int id_produk) {
        this->id_produk = id_produk;
    }

    string get_Nama() const {
        return nama;
    }

    void set_Nama(string nama) {
        this->nama = nama;
    }

    string get_Merek() const {
        return merek;
    }

    void set_Merek(string merek) {
        this->merek = merek;
    }

    double get_Harga() const {
        return harga;
    }

    void set_Harga(double harga) {
        this->harga = harga;
    }
};
