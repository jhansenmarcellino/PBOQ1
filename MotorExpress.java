package per6;

public class MotorExpress extends Armada{
	private boolean isGanjilGenap;

	public MotorExpress(String noPlat, String merk, double KapasitasKG,boolean isGanjilGenap){
		super(noPlat, merk, KapasitasKG);
		this.isGanjilGenap=isGanjilGenap;
	}
	@Override 
	public double hitungBiayaOperasional(){
		return  this.kapasitasKG *15000;
	}

	@Override 
	public void tampilkanInfoArmada(){
	System.out.println("=[MOTOR EXPRESS	]=");
	super.tampilkanInfoArmada();
	System.out.println("Akses Genap: "+(isGanjilGenap ? "iya" : "tidak"));
	System.out.println("Biaya/Hari: Rp."+ String.format("%.2f",hitungBiayaOperasional()));
}
}