package per6;

public abstract class Kurir {
    protected String idKurir;
    protected String nama;
    protected int jumlahPaketTerkirim;

    public Kurir(String idKurir, String nama, int jumlahPaketTerkirim){
        this.idKurir=idKurir;
        this.nama=nama;
        this.jumlahPaketTerkirim=jumlahPaketTerkirim;
    }
    public abstract double hitungGaji();
    public void tampilkanprofil(){
        System.out.println("ID Kurir : "+ idKurir);
        System.out.println("Nama : "+nama);
        System.out.println("Total Paket : "+jumlahPaketTerkirim+ "Paket");
    }
    public String getNama(){return nama;}
    public String IdKurir(){return idKurir;}
}
