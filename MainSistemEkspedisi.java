package per6;

import java.util.ArrayList;
import java.util.List;

public class MainSistemEkspedisi {
    public static void main(String[] args) {
     
        System.out.println(">>> REKAP BIAYA OPERASIONAL ARMADA <<<");
        
        List<Armada> daftarArmada = new ArrayList<>();
        daftarArmada.add(new MotorExpress("L 1234 ABC", "Honda Supra", 50.0, true));
        daftarArmada.add(new MobilBox("B 9988 XYZ", "Isuzu Elf", 2000.0, 6));
        daftarArmada.add(new Dronepengirim("DRN-001X", "DJI Matrice", 5.0, 120));

        double totalOperasional = 0;

        for (Armada armada : daftarArmada) {
            armada.tampilkanInfoArmada();
            totalOperasional += armada.hitungBiayaOperasional();
            System.out.println("------------------------");
        }
        
        System.out.printf("TOTAL OPERASIONAL ARMADA/HARI: Rp %,.2f\n", totalOperasional);
        System.out.println("\n=========================================================\n");

        System.out.println(">>> DAFTAR GAJI & KAPABILITAS KURIR <<<");

        List<Kurir> daftarKurir = new ArrayList<>();
        daftarKurir.add(new KurirTetap("K-001", "Rudi Hermawan", 120, 3500000, 5000));
        daftarKurir.add(new KurirMitra("M-501", "Bambang Perkasa", 85, 12000));

        for (Kurir kurir : daftarKurir) {
            kurir.tampilkanprofil();
            
            if(kurir instanceof KurirTetap) {
                System.out.printf("TOTAL GAJI : Rp %,.2f\n", kurir.hitungGaji());
            }

            System.out.println("\n[UJI HAK AKSES & DYNAMIC CASTING]");
            
            if (kurir instanceof AksesSistem) {
                ((AksesSistem) kurir).login("admin_rudi", "pass123");
            } else {
                System.out.println("Info: Kurir " + kurir.getNama() + " TIDAK MEMILIKI akses login dashboard.");
            }

            if (kurir instanceof PresensiDigital) {
                ((PresensiDigital) kurir).rekamkehadiran();
            }

            System.out.println("------------------------");
        }
    }
}