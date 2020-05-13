package Model;
import java.util.Random;

public class Dado {
	
	private static int getRandomD6 ()
	{
		Random num = new Random();
		return num.nextInt(6) + 1;
	}
	
	private void getOrdemJogador (Jogador[] lstJogadores)
	{
		for (Jogador lst : lstJogadores)
		{
			lst.setordemJogador(Dado.getRandomD6());
		}
		return;
	}

}
