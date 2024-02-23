
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <vector>
#include <string>
#include "Product.cpp"
using namespace std;


class Clothing : public Product {
private:
    string ukuran;
    string material;
    string jenis_kelamin;

public:
    Clothing(int id_produk, string nama, string merek, double harga, string ukuran, string material, string jenis_kelamin)
        : Product(id_produk, nama, merek, harga), ukuran(ukuran), material(material), jenis_kelamin(jenis_kelamin) {}

    string get_Ukuran() const {
        return ukuran;
    }

    void set_Ukuran(string ukuran) {
        this->ukuran = ukuran;
    }

    string get_Material() const {
        return material;
    }

    void set_Material(string material) {
        this->material = material;
    }

    string get_jenis_kelamin() const {
        return jenis_kelamin;
    }

    void set_jenis_kelamin(string jenis_kelamin) {
        this->jenis_kelamin = jenis_kelamin;
    }
};
