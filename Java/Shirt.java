/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

public class Shirt extends Clothing {
  private String warna;
  private String jenis_lengan;

  public Shirt(int id_produk, String nama, String merek, double harga, String ukuran, String material, String jenis_kelamin, String warna, String jenis_lengan) {
      super(id_produk, nama, merek, harga, ukuran, material, jenis_kelamin);
      this.warna = warna;
      this.jenis_lengan = jenis_lengan;
  }

  public String get_Warna() {
      return warna;
  }

  public void set_Warna(String warna) {
      this.warna = warna;
  }

  public String getS_tipe_lengan() {
      return jenis_lengan;
  }

  public void setS_tipe_lengan(String jenis_lengan) {
      this.jenis_lengan = jenis_lengan;
  }
}
