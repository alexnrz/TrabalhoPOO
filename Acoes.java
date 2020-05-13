package Model;

class Acoes {
	private Jogador daVez;
	
	private boolean validaAtaque(Territorio atacante, Territorio defensor)
	{
		if(daVez.getnomeJogador() == atacante.getdonoTerritorio() && daVez.getnomeJogador() != defensor.getdonoTerritorio())
		{
			if (validaFront(atacante, defensor))
			{
				if (atacante.getnumExercitos() > 1)
					return true;
			}
		}
		return false;
	}
	
	private boolean validaFront (Territorio atacante, Territorio defensor)
	{
		for (String lst :defensor.getFronteiras())
		{
			if (lst.matches(atacante.getNomeTerritorio()))
			{
				return true;
			}
		}
		return false;
	}
}
