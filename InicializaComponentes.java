package Model;

// Padr�o Singleton //
class InicializaComponentes {

	static int numeroDeTerritorios = 9; // N�mero de pa�ses //	
	static int numContinentes = 2;	
	
	
	private static InicializaComponentes ctrl = null;
	
	private InicializaComponentes() {}
	
	public static InicializaComponentes getInicializaComponentes() {
		if (ctrl == null) {
			ctrl = new InicializaComponentes();
		}
		
		return ctrl;
	}
	
	
	
	// M�todos da Classe //
	
	// Inicializa os territ�rios e suas fronteiras //
	private Territorio[] inicializaTerritorios(Territorio[] listaTerritorios) {
		// Matriz onde o primeiro �ndice na primeira coluna 0 representa o pais, e o restante das colunas as suas fronteiras  //
		String [][] paisesFronteiras = new String[numeroDeTerritorios+1][numeroDeTerritorios+1]; 
		
		String []Paises = new String[numeroDeTerritorios+1];
		Paises[0] ="";
		
		Paises[1] = "Brasil";
		Paises[2] = "Argentina";
		Paises[3] = "Peru";
		Paises[4] = "Venezuela";
		
		Paises[5] = "Mexico";
		Paises[6] = "EUA";
		Paises[7] = "Canada";
		Paises[8] = "Alasca";
		Paises[9] = "Groenlandia";
		
		
		
		
		// Lista com todo os territ�rios //
		listaTerritorios = new Territorio[numeroDeTerritorios]; 
		
		for ( int i=0; i < numeroDeTerritorios;i++) {
			listaTerritorios[i] = new Territorio();
		}
		
		
		
		for (int i=1; i <= numeroDeTerritorios;i++) {
			paisesFronteiras[i][0] = Paises[i];
		}
		
		/********* Am�rica do Sul ********/
		// Brasil [1][1] //
		paisesFronteiras[1][1] = null;			//	Brasil		// 
		paisesFronteiras[1][2] = Paises[2];		// 	Argentina	//
		paisesFronteiras[1][3] = Paises[3]; 	// 	Peru 		//
		paisesFronteiras[1][4] = null;			// 	Venezuela	//		
		// Argentina  [2][2] //
		paisesFronteiras[2][1] = Paises[1];
		paisesFronteiras[2][3] = Paises[3];		
		// Peru [3][3] //
		paisesFronteiras[3][1] = Paises[1];
		paisesFronteiras[3][2] = Paises[2]; 
		paisesFronteiras[3][4] = Paises[4];		
		// Venezuela [4][4] //
		paisesFronteiras[4][1] = Paises[1];
		paisesFronteiras[4][3] = Paises[3];	
		
		
		/********* Am�rica do Norte ******/
		// M�xico [5][5] //
		paisesFronteiras[5][5] = null;			//	M�xico		// 
		paisesFronteiras[5][6] = Paises[6];		// 	EUA	//
		paisesFronteiras[5][7] = null; 			// 	Canad� 		//
		paisesFronteiras[5][8] = null;			// 	Alasca		//		
		paisesFronteiras[5][9] = null;			// 	Groel�ndia	//		
		// EUA  [6][6] //
		paisesFronteiras[6][5] = Paises[5];
		paisesFronteiras[6][7] = Paises[7];		
		// Canad� [7][7] //
		paisesFronteiras[7][6] = Paises[6];
		paisesFronteiras[7][8] = Paises[8]; 
		paisesFronteiras[7][9] = Paises[9];		
		// Alasca [8][8] //
		paisesFronteiras[8][7] = Paises[7];
		// Groel�ndia [9][9] //
		paisesFronteiras[9][7] = Paises[7];
		
		
		
		for ( int i = 0; i < numeroDeTerritorios; i++) {
			listaTerritorios[i].setNomeTerritorio(Paises[i+1]);
			listaTerritorios[i].setdonoTerritorio(null);
			listaTerritorios[i].setNumExercitos(0);
			listaTerritorios[i].setCorExercito(null);
			listaTerritorios[i].setFronteiras(paisesFronteiras[i+1]);			
		}		
		
		return listaTerritorios;
		
	} 		
	
	// Inicializa os Continentes //
	private Continente[] defineContinentes(Territorio[] listaTerritorios) {
		int i=0;
		Continente[] listaContinentes = new Continente[numContinentes];
		
		for( i=0; i < numContinentes;i++) {
			listaContinentes[i] = new Continente();
		}
		
		/* Am�rica do Sul */
		Territorio[] americaSul = new Territorio[4];		 
		for( i=0 ; i < 4;i++) {
			americaSul[i]=new Territorio();
		}
		americaSul[0]=listaTerritorios[0];
		americaSul[1]=listaTerritorios[1];
		americaSul[2]=listaTerritorios[2];
		americaSul[3]=listaTerritorios[3];
		listaContinentes[0].setNomeContinente("America do Sul");
		listaContinentes[0].setNumTerritorios(4);
		listaContinentes[0].setTerritoriosContinente(americaSul);
		
		
		/* Am�rica do Norte */
		Territorio[] americaNorte = new Territorio[5];		 
		for( i=0 ; i < 5;i++) {
			americaNorte[i]=new Territorio();
		}
		americaNorte[0]=listaTerritorios[4];
		americaNorte[1]=listaTerritorios[5];
		americaNorte[2]=listaTerritorios[6];
		americaNorte[3]=listaTerritorios[7];
		americaNorte[4]=listaTerritorios[8];
		
		listaContinentes[1].setNomeContinente("America do Norte");
		listaContinentes[1].setNumTerritorios(5);
		listaContinentes[1].setTerritoriosContinente(americaNorte);
				
		
		
		return listaContinentes;
		
	}
	
	
	// Define informa��es dos jogadores //
	private Jogador[] defineJogadores(String [] StrJogadores, String[] CorJogadores) {
		Jogador[] lstJogadores = new Jogador[StrJogadores.length];
		
		for ( int i=0; i < StrJogadores.length;i++) {
			lstJogadores[i] = new Jogador();
		}
		
		for ( int i = 0; i < CorJogadores.length;i++) {
			
		}

		
		for (int j =0; j < StrJogadores.length; j++) {
			
			//System.out.println("Digite o nome do jogador: ");
			//nomeJog = Jog.next();
			
			for( int i = 0 ; i < StrJogadores.length; i++) {
				if( lstJogadores[i].getnomeJogador() != null) {
					if (lstJogadores[i].getnomeJogador().equals(StrJogadores[j]) == true) {
						System.out.println("Nome repetidos, insira outros nomes!");
						return null;
					}
				}
			}
			
			//System.out.println("Digite a cor do jogador "+nomeJog+":");
			//corJog = Jog.next();			
			for( int i = 0 ; i < StrJogadores.length; i++) { 
				if(lstJogadores[i].getColor() != null) {
					if (lstJogadores[i].getColor().equals(CorJogadores[j]) == true) {
						System.out.println("Cor repetida, inisra outras cores!");
						return null;
					}
				}
			}
			
			lstJogadores[j].setCor(CorJogadores[j]);
			lstJogadores[j].setnomeJogador(StrJogadores[j]);
		}
		
		return lstJogadores;
	}
	
	private Exercito[] defineExercitos(Jogador[] listaJogadores) {
		
		Exercito Ex[] = new Exercito[listaJogadores.length];
		
		for (int i=0; i< listaJogadores.length;i++) {
			Ex[i] = new Exercito();
			Ex[i].setCorExercito(listaJogadores[0].getColor());
			Ex[i].setdonoExercito(listaJogadores[0]);
			Ex[i].setQTDExercito(0);
		}

		return Ex;
	}
	
	
	// Define os donos territ�rios iniciais // Utiliza inicializaTerritorios() e defineJogadores() //
	private Jogador[] defineDonoTerritorios(Jogador[] listaJogadores, Territorio[] listaTerritorios, Exercito[] Exercitos, Cartas C) {
		C = new Cartas();
		int numJogadores = listaJogadores.length;
		int i=0, j=0;		
		int qtdTerritoriosPorJogador = numeroDeTerritorios/numJogadores;
		Territorio UmTerritorio;
		Jogador[] listaJogOrdenada = new Jogador[numJogadores];		
		Dado d = new Dado();

		// Defini��o da ordem dos Jogadores //
		System.out.println("Ordem dos Jogadores");
		d.setOrdemJogador(listaJogadores);
		
		// Apresenta��o da ordem dos Jogadores //
		for ( i = 0; i < numJogadores; i++) {			
			System.out.println("Jogador: " + listaJogadores[i].getnomeJogador()+" "+
								listaJogadores[i].getOrdemJogador()+"� a jogar");
			listaJogOrdenada[listaJogadores[i].getOrdemJogador()-1] = listaJogadores[i];			
		}		
		
		// Retirada de cartas territ�rio em ordem //
		for ( i = 0; i < qtdTerritoriosPorJogador; i ++) {
			for( j = 0; j < listaJogadores.length;j++) {
				// Verifica se o territ�rio pode ser daquele jogador, se sim, adiciona aquele jogador como dono do territ�rio (setDono)(setCor) e coloca 1 exercito //
				UmTerritorio = C.retiraCartaTerritorio(listaTerritorios,listaJogOrdenada,listaJogOrdenada[j].getnomeJogador());
				// Coloca o territ�rio em posse do jogador //
				listaJogOrdenada[j].setUmTerritorio(UmTerritorio);
				// Adiciona 1 ao n�mero de territ�rios do jogador //
				listaJogOrdenada[j].setnumTerritoriosJog(listaJogOrdenada[j].getnumTerritoriosJog()+1);
				
				// Adiciona 1 unidade ao Ex�rcito da cor do jogador //
				for (int t=0; t < numJogadores;t++) {
					if (Exercitos[t].getCorExercito()==listaJogOrdenada[j].getColor()) {
						Exercitos[t].setQTDExercito(Exercitos[t].getQTDExercito()+1);
						t=numJogadores;
					}
				}
				
				listaJogOrdenada[j].setNumExercitos(listaJogOrdenada[j].getNumExercitos()+1);
				
				System.out.println(" O Jogador "+listaJogOrdenada[j].getnomeJogador()+" recebe a carta territorio "+UmTerritorio.getNomeTerritorio());

			}
		}		
		
		listaJogadores = listaJogOrdenada;
		
		return listaJogadores;
		
	}
	
	// Cria uma lista de Objetivos de acordo com o n�mero de jogadores e define seus donos //
	// Implementar o caso de ter menos de 6 jogadores (menos objetivos) //
	private Objetivo[] defineDonoObjetivos(Jogador[] listaJogadores, Objetivo[] Objetivos, Cartas C) {
		Objetivo Objtemp = new Objetivo();
		C = new Cartas();
		// Cria uma lista de objetivos padr�o //
		Objetivos = new Objetivo[6];		
		for ( int i=0; i < Objetivos.length;i++) {
			Objetivos[i]= new Objetivo();
		}
		Objetivos[0].setContinentes(null); 		// Continentes necess�rios para ganhar					//
		Objetivos[0].setDonoObjetivo(null); 	// Dono do Objetivo que ser� escolhido aleatoriamente 	//
		Objetivos[0].setExercitos("Vermelho"); 	// Ex�rcito que precisa ser destr�do para ganhar 		//
		Objetivos[0].setTerritorios(0); 		// Quantidade de territ�rios necess�rios para ganhar	//
				
		Objetivos[1].setContinentes(null); 				
		Objetivos[1].setDonoObjetivo(null); 	
		Objetivos[1].setExercitos(null); 	
		Objetivos[1].setTerritorios(25); 

		Objetivos[2].setContinentes(null); 				
		Objetivos[2].setDonoObjetivo(null); 	
		Objetivos[2].setExercitos("Verde"); 	
		Objetivos[2].setTerritorios(10);
		
		Objetivos[3].setContinentes(null); 				
		Objetivos[3].setDonoObjetivo(null); 	
		Objetivos[3].setExercitos("Azul"); 	
		Objetivos[3].setTerritorios(15);
		
		Objetivos[4].setContinentes(null); 				
		Objetivos[4].setDonoObjetivo(null); 	
		Objetivos[4].setExercitos("Preto"); 	
		Objetivos[4].setTerritorios(5);		
		
		Objetivos[5].setContinentes(null); 				
		Objetivos[5].setDonoObjetivo(null); 	
		Objetivos[5].setExercitos("Branco"); 	
		Objetivos[5].setTerritorios(9);
		///				///				///
		
		// Escolhe um objetivo aleat�rio para os jogadores //
		for(int i=0; i < listaJogadores.length;i++ ) {
			Objtemp = C.retiraCartaObjetivo(Objetivos, listaJogadores, listaJogadores[i].getnomeJogador() );
			listaJogadores[i].setObjetivo(Objtemp);
			System.out.println("Objetivos do Jogador: "+listaJogadores[i].getnomeJogador());
			System.out.println("Exercitos a serem destru�dos para ganhar: "+listaJogadores[i].getObjetivo().getExercitos());
			System.out.println("Continentes necess�rios para ganhar: "+listaJogadores[i].getObjetivo().getContinentes());
			System.out.println("Territorios necess�rios para ganhar: "+listaJogadores[i].getObjetivo().getTerritorios());
		}
		return Objetivos;
		
	}
	
	
	
	// Fun��es para usar externamente //
	
	public boolean inicializaTudo(Continente[] C, Territorio[] T, Jogador[] J, Objetivo[] O, Exercito[] E,Cartas Carta,
			String[] StrJogadores, String[] CorJogadores) {

		if(StrJogadores[0] == null) {
			System.out.println("Erro ao inicializar StrJogadores!");
			return false;
		}
		
		
		T = inicializaTerritorios(T);
		if(T[0].getNomeTerritorio() == null) {
			System.out.println("Erro ao inicializar os territ�rios!");
			return false;
		}
		
		C = defineContinentes(T);
		if(C[0].getNomeContinente() == null) {
			System.out.println("Erro ao inicializar os Continentes!");
			return false;
		}
		
		J = defineJogadores(StrJogadores,CorJogadores);
		if(J[0].getnomeJogador() == null) {
			System.out.println("Erro ao inicializar os Jogadores!");
			return false;
		}
		
		E = defineExercitos(J);
		
		
		J = defineDonoTerritorios(J,T,E,Carta);
		if (J[0].getListaTerritorios()[0].getNomeTerritorio() == null) {
			System.out.println("Erro ao inicializar os Donos dos territ�rios!");
			return false;
		}
		
		O = defineDonoObjetivos(J,O,Carta);
		if(O[0].getDonoObjetivo()==null) {
			return false;
		}
		System.out.println("CHEGOU^AQUI");
		return true;
		
		
	}
	
	
	



	
}
	
	
	
	
	
	
	
	
	
	
	

