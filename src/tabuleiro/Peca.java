package tabuleiro;

public class Peca {

	protected Posicao posicao = new Posicao();
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		tabuleiro = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
	
	
	
}
