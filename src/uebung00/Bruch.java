package uebung00;

public class Bruch {
	
	private int nenner;
	private int zaehler;
	
	public Bruch(int zaehler, int nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
	}
	
	
	public int getNenner() {
		return this.nenner;
	}
	
	public void setNenner(int nenner) {
		
		if (nenner == 0)
			throw new IllegalArgumentException(Integer.toString(nenner));
		
		this.nenner = nenner;
	}
	
	public int getZaehler() {
		return this.zaehler;
	}
	
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
}
