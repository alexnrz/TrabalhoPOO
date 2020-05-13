package Model;

class Jogador {

	private String Color;
	private String nomeJogador;
	private int numTerritoriosJog;
	private int ordemJogador;
	
	
	
	
	
	
	/* Funções referentes à cor do jogador */
	protected String getColor() {
		return Color;
	}
	
	protected void setCor(String sColor) {
		Color = sColor;
	}
	
	
	/* Funções referentes ao nome do jogador */
	protected String getnomeJogador() {
		return nomeJogador;
	}
	
	protected void setnomeJogador(String nomeJ) {
		nomeJogador = nomeJ;
	}
	
	protected int getnumTerritoriosJog() {
		return numTerritoriosJog;
	}
	
	
	protected void setnumTerritoriosJog(int num) {
		numTerritoriosJog = num;
	}
	
	protected void setordemJogador (int num)
	{
		ordemJogador =  num;
	}
	
	protected void setObjetivo (Objetivo o)
	{}
	
	protected Objetivo getObjetivo ()
	{
		return;
	}
}
