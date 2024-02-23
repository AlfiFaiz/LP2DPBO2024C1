#Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
#soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import kelas Shirt dari modul shirt
from shirt import Shirt

# menambahkan produk baru ke dalam daftar produk
def add_product(products):
    # Input data produk dari pengguna
    id_produk = int(input("ID Produk: "))
    nama = input("Nama Produk: ")
    merek = input("Merek Produk: ")
    harga = float(input("Harga Produk: "))
    ukuran = input("Ukuran: ")
    material = input("Material: ")
    jenis_kelamin = input("Jenis Kelamin: ")
    warna = input("Warna: ")
    jenis_lengan = input("Tipe Lengan: ")

    # Membuat objek Shirt dan menambahkannya ke daftar produk
    products.append(Shirt(id_produk, nama, merek, harga, ukuran, material, jenis_kelamin, warna, jenis_lengan))
    print("Data berhasil ditambahkan.")

# menampilkan daftar produk
def show_products(products):
    print("Daftar Produk:")
    for product in products:
        # Menampilkan informasi produk menggunakan getter dari kelas Shirt
        print("\n* ID:", product.get_ID_produk())
        print("  - Nama:", product.get_Nama())
        print("  - Merek:", product.get_Merek())
        print("  - Harga:", product.get_Harga())
        print("  - Ukuran:", product.get_Ukuran())
        print("  - Material:", product.get_Material())
        print("  - Jenis Kelamin:", product.get_jenis_kelamin())
        print("  - Warna:", product.get_Warna())
        print("  - Tipe Lengan:", product.get_S_tipe_lengan())
        print("\n" + "-" * 100)

#  mengatur alur program
def main():
    # Inisialisasi daftar produk
    products = []
    menu = 0

    # perulangan utama program
    while menu != 999:
        # Menampilkan menu kepada pengguna
        print("Menu:")
        print("1. Tambah Data Produk")
        print("2. Tampilkan Data Produk")
        print("999. Keluar")
        menu = int(input("Pilih Menu: "))

        # Memproses pilihan menu pengguna
        if menu == 1:
            add_product(products)
        elif menu == 2:
            show_products(products)
        elif menu == 999:
            print("Program selesai")
        else:
            print("Tidak ada menu yang dipilih.")

if __name__ == "__main__":
    main()
