/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 2 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

public class Clothing extends Product {
  private String ukuran;
  private String material;
  private String jenis_kelamin;

  public Clothing(int id_produk, String nama, String merek, double harga, String ukuran, String material, String jenis_kelamin) {
      super(id_produk, nama, merek, harga);
      this.ukuran = ukuran;
      this.material = material;
      this.jenis_kelamin = jenis_kelamin;
  }

  public String get_Ukuran() {
      return ukuran;
  }

  public void set_Ukuran(String ukuran) {
      this.ukuran = ukuran;
  }

  public String get_Material() {
      return material;
  }

  public void set_Material(String material) {
      this.material = material;
  }

  public String get_jenis_kelamin() {
      return jenis_kelamin;
  }

  public void set_jenis_kelamin(String jenis_kelamin) {
      this.jenis_kelamin = jenis_kelamin;
  }
}
