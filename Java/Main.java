/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi daftar produk
        List<Product> products = new ArrayList<>();

        // Inisialisasi variabel menu
        int menu = 0;

        // Loop menu utama
        while (menu != 999) {
            // Tampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Produk");
            System.out.println("2. Tampilkan Data Produk");
            System.out.println("999. Keluar");
            System.out.print("Pilih Menu: ");
            
            // Input pilihan menu dari pengguna
            menu = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character

            // Switch statement untuk memproses pilihan menu
            switch (menu) {
                case 1:
                    // Panggil metode untuk menambahkan produk
                    addProduct(scanner, products);
                    break;
                case 2:
                    // Panggil metode untuk menampilkan produk
                    showProducts(products);
                    break;
                case 999:
                    // Keluar dari program
                    System.out.println("Program selesai");
                    scanner.close(); // Tutup Scanner
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Tidak ada menu yang dipilih.");
            }
        }
    }

    // Metode untuk menambahkan produk ke dalam daftar
    private static void addProduct(Scanner scanner, List<Product> products) {
        // Input informasi produk dari pengguna
        System.out.print("ID Produk: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nama Produk: ");
        String nama = scanner.nextLine();

        System.out.print("Merek Produk: ");
        String merek = scanner.nextLine();

        System.out.print("Harga Produk: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Ukuran: ");
        String ukuran = scanner.nextLine();
    
        System.out.print("Material: ");
        String material = scanner.nextLine();
    
        System.out.print("Jenis Kelamin: ");
        String jenis_kelamin = scanner.nextLine();
    
        System.out.print("Warna: ");
        String warna = scanner.nextLine();

        System.out.print("Tipe Lengan: ");
        String jeni_lengan = scanner.nextLine();
    
        // Tambahkan produk baru ke dalam daftar
        products.add(new Shirt(id, nama, merek, harga, ukuran, material, jenis_kelamin, warna, jeni_lengan));
        System.out.println("Data berhasil ditambahkan.");
    }

    // Metode untuk menampilkan informasi produk
    private static void showProducts(List<Product> products) {
        System.out.println("Daftar Produk:");
        // Iterasi melalui daftar produk dan tampilkan informasinya
        for (Product product : products) {
            Shirt shirt = (Shirt) product;
            System.out.printf("\n* ID: %s\n  - Nama: %s\n  - Merek: %s\n  - Harga: %.2f\n  - Ukuran: %s\n  - Material: %s\n  - Jenis Kelamin: %s\n  - Warna: %s\n  - Tipe Lengan: %s\n", shirt.get_ID_produk(), shirt.get_Nama(), shirt.get_Merek(), shirt.get_Harga(), shirt.get_Ukuran(), shirt.get_Material(), shirt.get_jenis_kelamin(), shirt.get_Warna(), shirt.getS_tipe_lengan());
            System.out.println("\n" + "-".repeat(100)); 
        }
    }
}
