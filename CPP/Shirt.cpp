
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <vector>
#include <string>
#include "Clothing.cpp"
using namespace std;

class Shirt : public Clothing {
private:
    string warna;
    string jenis_lengan;

public:
    Shirt(int id_produk, string nama, string merek, double harga, string ukuran, string material, string jenis_kelamin, string warna, string jenis_lengan)
        : Clothing(id_produk, nama, merek, harga, ukuran, material, jenis_kelamin), warna(warna), jenis_lengan(jenis_lengan) {}

    string get_Warna() const {
        return warna;
    }

    void set_Warna(string warna) {
        this->warna = warna;
    }

    string getS_tipe_lengan() const {
        return jenis_lengan;
    }

    void setS_tipe_lengan(string jenis_lengan) {
        this->jenis_lengan = jenis_lengan;
    }
};