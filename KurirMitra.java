package per6;

public class KurirMitra extends Kurir implements PresensiDigital{
    private double upahPerPaket;

    public KurirMitra(String idKurir, String nama, int jumlahPaketTerkirim, double upahPerPaket){
        super(idKurir, nama, jumlahPaketTerkirim);
        this.upahPerPaket=upahPerPaket;
    }
    @Override 
    public double hitungGaji(){
        return this.jumlahPaketTerkirim * this.upahPerPaket;
    }

    @Override 
    public void rekamkehadiran(){
        System.out.println("]PRESENSI MOBILE] Kurir Mitra "+ nama + "presensi via GPS Mobile App");
    }

    @Override
    public void cetaklaporankehadiran(){
        System.out.println("[REKAP] Log aktivitas pengiriman harian" + nama + "Tersimpan");
    }

    @Override 
    public void tampilkanprofil(){
        System.out.println("==[KURIR MITRA]==");
        super.tampilkanprofil();
       System.out.println("Upah/Paket : Rp " + String.format("%,.2f", upahPerPaket));
        System.out.println("TOTAL GAJI : Rp " + String.format("%,.2f", hitungGaji()));
    }
    
}
