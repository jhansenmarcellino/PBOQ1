package per6;

public class Dronepengirim extends  Armada {
    private int batasKetinggianMaksimal;
public Dronepengirim(String noPlat, String merk, double kapasitasKG, int batasKetinggianMaksimal) {
        super(noPlat, merk, kapasitasKG);
        this.batasKetinggianMaksimal = batasKetinggianMaksimal;
    }

    @Override
    public double hitungBiayaOperasional() {
        // Rumus: (kapasitasKg * 10.000) + 50.000 (biaya asuransi udara)
        return (this.kapasitasKG * 10000) + 50000;
    }

    @Override
    public void tampilkanInfoArmada() {
        System.out.println("[DRONE PENGIRIM]");
        super.tampilkanInfoArmada();
        System.out.println("Batas Ketinggian: " + batasKetinggianMaksimal + " Meter");
        System.out.printf("Biaya/Hari: Rp %.2f\n", hitungBiayaOperasional());
    }
}
