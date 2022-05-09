package aulaDDD;

public class Gato extends Animal {

	private int nPatas = 3;
	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public Gato(String e, String c, String h) {
		super(e, c, h);
	}
	
	public void fazerBarulho() {
		System.out.println("Miau!");
	}
	
}
