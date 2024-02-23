
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <vector>
#include <string>
#include "Shirt.cpp"

using namespace std;

void addProduct(vector<Product>& products);
void showProducts(const vector<Product>& products);

int main() {
    vector<Product> products;

    int menu = 0;

    while (menu != 999) {
        cout << "Menu:" << endl;
        cout << "1. Tambah Data Produuk" << endl;
        cout << "2. Tampilkan Data Produk" << endl;
        cout << "999. Keluar" << endl;
        cout << "Pilih Menu: ";

        cin >> menu;
        cin.ignore(); 

        switch (menu) {
            case 1:
                addProduct(products);
                break;
            case 2:
                showProducts(products);
                break;
            case 999:
                cout << "Program selesai" << endl;
                break;
            default:
                cout << "Tidak ada menu yang dipilih." << endl;
        }
    }

    return 0;
}

void addProduct(vector<Product>& products) {
    int id;
    string nama, merek, ukuran, material, jenis_kelamin, warna, jenis_lengan;
    double harga;

    cout << "ID Produk: ";
    cin >> id;
    cin.ignore();

    cout << "Nama Produk: ";
    getline(cin, nama);

    cout << "Merek Produk: ";
    getline(cin, merek);

    cout << "Harga Produk: ";
    cin >> harga;
    cin.ignore();

    cout << "Ukuran: ";
    getline(cin, ukuran);

    cout << "Material: ";
    getline(cin, material);

    cout << "Jenis Kelamin: ";
    getline(cin, jenis_kelamin);

    cout << "Warna: ";
    getline(cin, warna);

    cout << "Tipe Lengan: ";
    getline(cin, jenis_lengan);

    products.push_back(Shirt(id, nama, merek, harga, ukuran, material, jenis_kelamin, warna, jenis_lengan));
    cout << "Data berhasil ditambahkan." << endl;
}

void showProducts(const vector<Product>& products) {
    cout << "Daftar Produk:" << endl;

    for (const Product& product : products) {
        const Shirt& shirt = static_cast<const Shirt&>(product);
        cout << "\n* ID: " << shirt.get_ID_produk() << "\n  - Nama: " << shirt.get_Nama() << "\n  - Merek: " << shirt.get_Merek()
                  << "\n  - Harga: " << shirt.get_Harga() << "\n  - Ukuran: " << shirt.get_Ukuran() << "\n  - Material: " << shirt.get_Material()
                  << "\n  - Jenis Kelamin: " << shirt.get_jenis_kelamin() << "\n  - Warna: " << shirt.get_Warna() << "\n  - Tipe Lengan: " << shirt.getS_tipe_lengan() << endl;

        cout << "\n" << string(100, '-') << endl;
    }
}
