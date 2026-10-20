package per6;

public class KurirTetap extends Kurir implements AksesSistem , PresensiDigital{
    private double gajiPokok;
    private double bonusPerPaket;

    public KurirTetap(String idKurir, String nama, int jumlahPaketTerkirim, double gajiPokok,double bonusPerPaket){
        super(idKurir,nama,jumlahPaketTerkirim);
        this.gajiPokok=gajiPokok;
        this.bonusPerPaket=bonusPerPaket;
    }
    @Override 
    public double hitungGaji(){
        return this.gajiPokok + (this.jumlahPaketTerkirim * this.bonusPerPaket);
    }
    @Override
    public void login(String Username,String Password) {
        System.out.println("[SYS-LOGIN] Kurir Tetap " + nama + " berhasil masuk ke Dashboard Internal.");
    }

    @Override
    public void logout() {
        System.out.println("[SYS-LOGOUT] Kurir Tetap " + nama + " keluar dari sistem.");
    }
    @Override 
    public void rekamkehadiran(){
        System.out.println("[PRESENSI] Kurir Tetap " + nama + " telah melakukan presensi.");
    }

    @Override
    public void cetaklaporankehadiran(){
        System.out.println("[REKAP] Laporan kehadiran Kurir Tetap " + nama + " dicetak.");
    }
}
