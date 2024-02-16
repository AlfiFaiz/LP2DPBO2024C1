/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

public class Product {
  private int id_produk;
  private String nama;
  private String merek;
  private double harga;

  public Product(int id_produk, String nama, String merek, double harga) {
      this.id_produk = id_produk;
      this.nama = nama;
      this.merek = merek;
      this.harga = harga;
  }

  public int get_ID_produk() {
      return id_produk;
  }

  public void set_ID_produk(int id_produk) {
      this.id_produk = id_produk;
  }

  public String get_Nama() {
      return nama;
  }

  public void set_Nama(String nama) {
      this.nama = nama;
  }

  public String get_Merek() {
      return merek;
  }

  public void set_Merek(String merek) {
      this.merek = merek;
  }

  public double get_Harga() {
      return harga;
  }

  public void set_Harga(double harga) {
      this.harga = harga;
  }
}
