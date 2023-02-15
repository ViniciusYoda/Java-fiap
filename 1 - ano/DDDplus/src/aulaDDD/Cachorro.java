package aulaDDD;

public class Cachorro extends Animal{

	private int nPatas = 4;
	
	public Cachorro(String e, String c, String h, int nPatas) {
		super(e, c, h);
		this.setnPatas(nPatas);
	}
	
	
	
	public int getnPatas() {
		return nPatas;
	}



	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}



	public void fazerBarulho() {
		System.out.println("Auau!");
	}
	
}
