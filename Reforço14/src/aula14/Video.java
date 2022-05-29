package aula14;

public class Video implements AcoesVideo {
	private String titulo;
	private int avaliacao;
	private double views;
	private double curtidas;
	private boolean reproduzindo;
	
	

	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = nova;
	}

	public double getViews() {
		return views;
	}

	public void setViews(double views) {
		this.views = views;
	}

	public double getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(double curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.reproduzindo = true;
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		this.curtidas++;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	

}
