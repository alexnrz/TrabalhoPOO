package Model;
import java.util.Scanner;


public class InicializaComponentes {

	static int numeroDeTerritorios = 51; // N�mero de pa�ses //	
	static int numContinentes = 6;
	
	static Continente[] Continentes;
	static Territorio[] listaTerritorios;
	private Exercito[] Exercitos;
	private Objetivo[] Objetivos;
	private Cartas C = new Cartas();
	private Jogador[] listaJogadores;
	

	
	// Inicializa os territ�rios e suas fronteiras //
	private Territorio[] inicializaTerritorios() {
		// Matriz onde o primeiro �ndice na primeira coluna 0 representa o pais, e o restante das colunas as suas fronteiras  //
		String [][] paisesFronteiras = new String[numeroDeTerritorios+1][numeroDeTerritorios+1]; 
		
		String []Paises = new String[numeroDeTerritorios+1];
		Paises[0] ="";
		
		// America do Sul //
		Paises[1] = "Brasil";
		Paises[2] = "Argentina";
		Paises[3] = "Peru";
		Paises[4] = "Venezuela";
		
		// America do Norte //
		Paises[5] = "Mexico";
		Paises[6] = "Alasca";
		Paises[7] = "Groenlandia";
		Paises[8] = "Calgary";
		Paises[9] = "California";
		Paises[10] = "Nova York";
		Paises[11] = "Quebec";
		Paises[12] = "Texas";
		Paises[13] = "Vancouver";
		
		// Asia //
		Paises[14] = "Arabia Saudita";
		Paises[15] = "Bangladesh";
		Paises[16] = "Cazaquist�o";
		Paises[17] = "China";
		Paises[18] = "Cor�ia do Norte";
		Paises[19] = "Cor�ia do Sul";
		Paises[20] = "Estonia";
		Paises[21] = "India";
		Paises[22] = "Ira";
		Paises[23] = "Iraque";
		Paises[24] = "Japao";
		Paises[25] = "Jordania";
		Paises[26] = "Letonia";
		Paises[27] = "Mongolia";
		Paises[28] = "Paquistao";
		Paises[29] = "Russia";
		Paises[30] = "Siberia";
		Paises[31] = "Siria";
		Paises[32] = "Tailandia";
		Paises[33] = "Turquia";
		
		// Africa //
		Paises[34] = "Africa do Sul";
		Paises[35] = "Angola";
		Paises[36] = "Argelia";
		Paises[37] = "Egito";
		Paises[38] = "Nigeria";
		Paises[39] = "Somalia";
		
		// Europa //
		Paises[40] = "Espanha";
		Paises[41] = "Franca";
		Paises[42] = "Italia";
		Paises[43] = "Polonia";
		Paises[44] = "Reino Unido";
		Paises[45] = "Romenia";
		Paises[46] = "Suecia";
		Paises[47] = "Ucrania";
		
		// Oceania //
		Paises[48] = "Australia";
		Paises[49] = "Indonesia";
		Paises[50] = "Nova Zelandia";
		Paises[51] = "Perth";
		
		// Lista com todo os territ�rios //
		listaTerritorios = new Territorio[numeroDeTerritorios]; 
		
		for ( int i=0; i < numeroDeTerritorios;i++) {
			listaTerritorios[i] = new Territorio();
		}
		
		
		
		for (int i=1; i <= numeroDeTerritorios;i++) {
			paisesFronteiras[i][0] = Paises[i];
		}
		
		/********* Am�rica do Sul ********/
		// Brasil [1][4] //
		paisesFronteiras[1][2] = Paises[2];		// 	Argentina	//
		paisesFronteiras[1][3] = Paises[3]; 	// 	Peru 		//
		paisesFronteiras[1][4] = Paises[4];		// 	Venezuela	//
		paisesFronteiras[1][38] = Paises[38];	// Nigeria		//
		// Argentina  [2][2] //
		paisesFronteiras[2][1] = Paises[1];		// 	Brasil	//
		paisesFronteiras[2][3] = Paises[3];		// 	Peru	//	
		// Peru [3][3] //
		paisesFronteiras[3][1] = Paises[1];		// 	Brasil	//
		paisesFronteiras[3][2] = Paises[2]; 	// 	Argentina	//
		paisesFronteiras[3][4] = Paises[4];		// 	Venezuela	//		
		// Venezuela [4][3] //
		paisesFronteiras[4][1] = Paises[1];		// 	Brasil	//
		paisesFronteiras[4][3] = Paises[3];		// 	Peru	//
		paisesFronteiras[4][5] = Paises[5];		// 	Mexico	//
		
		
		/********* Am�rica do Norte ******/
		// M�xico [5][3] --  4, 9 e 12//
		paisesFronteiras[5][4] = Paises[4];		// 	Venezuela	//
		paisesFronteiras[5][9] = Paises[9];		// 	Calif�rnia	//
		paisesFronteiras[5][12] = Paises[12];	// 	Texas	//
		// Alasca [6][3]  -- 8, 13 e 30// 
		paisesFronteiras[6][8] = Paises[8];		// 	Calgary	//
		paisesFronteiras[6][13] = Paises[13];	// 	Vancouver	//
		paisesFronteiras[6][30] = Paises[30];	// 	Sib�ria	//
		// Groel�ndia [7][3] -- 8, 11 e 44//
		paisesFronteiras[7][8] = Paises[8];		// 	Calgary	//
		paisesFronteiras[7][11] = Paises[11];	// 	Qu�bec	//
		paisesFronteiras[7][44] = Paises[44];	// 	Reino Unido	//
		// Calgary [8][3] - 6, 7 e 13//
		paisesFronteiras[8][6] = Paises[6];		// 	Alasca	//
		paisesFronteiras[8][7] = Paises[7];		// 	Groel�ndia	//
		paisesFronteiras[8][13] = Paises[13];	// 	Vancouver	//
		// Calif�rnia [9][3] -- 5, 12 e 13//
		paisesFronteiras[8][5] = Paises[5];		// 	M�xico	//
		paisesFronteiras[8][12] = Paises[12];	// 	Texas	//
		paisesFronteiras[8][13] = Paises[13];	// 	Vancouver	//
		// Nova York [10][2] -- 11 e 12//
		paisesFronteiras[10][11] = Paises[11];	// 	Qu�bec	//
		paisesFronteiras[10][12] = Paises[12];	// 	Texas	//
		// Qu�bec [11][4] -- 7, 10, 12 e 13//
		paisesFronteiras[11][7] = Paises[7];	// 	Groel�ndia	//
		paisesFronteiras[11][10] = Paises[10];	// 	Nova York	//
		paisesFronteiras[11][12] = Paises[12];	// 	Texas	//
		paisesFronteiras[11][13] = Paises[13];	// 	Vancouver	//
		// Texas [12][5] -- 5, 9, 10, 11 e 13//
		paisesFronteiras[12][5] = Paises[5];	// 	M�xico	//
		paisesFronteiras[12][9] = Paises[9];	// 	Calif�rnia	//
		paisesFronteiras[12][10] = Paises[10];	// 	Nova York	//
		paisesFronteiras[12][11] = Paises[11];	// 	Qu�bec	//
		paisesFronteiras[12][13] = Paises[13];	// 	Vancouver	//
		// Vancouver [13][5] -- 6, 8, 9, 11 e 12//
		paisesFronteiras[13][6] = Paises[6];	// 	Alasca	//
		paisesFronteiras[13][8] = Paises[8];	// 	Calgary	//
		paisesFronteiras[13][9] = Paises[9];	// 	Calif�rnia	//
		paisesFronteiras[13][11] = Paises[11];	// 	Qu�bec	//
		paisesFronteiras[13][12] = Paises[12];	// 	Texas	//
		
		/********* Asia ******/
		// Ar�bia Saudita [14][3] -- 22, 25 e 39 //
		paisesFronteiras[14][22] = Paises[22];	// 		//
		paisesFronteiras[14][25] = Paises[25];	// 		//
		paisesFronteiras[14][39] = Paises[39];	// 		//
		// Bangladesh [15][4] -- 19, 21, 32 e 49//
		paisesFronteiras[15][19] = Paises[19];	// 		//
		paisesFronteiras[15][21] = Paises[21];	// 		//
		paisesFronteiras[15][32] = Paises[32];	// 		//
		paisesFronteiras[15][49] = Paises[49];	// 		//
		// Cazaquist�o [16][7] -- 17, 24, 26, 27, 29, 30 e 33 //
		paisesFronteiras[16][17] = Paises[17];	// 		//
		paisesFronteiras[16][24] = Paises[24];	// 		//
		paisesFronteiras[16][26] = Paises[26];	// 		//
		paisesFronteiras[16][27] = Paises[27];	// 		//
		paisesFronteiras[16][29] = Paises[29];	// 		//
		paisesFronteiras[16][30] = Paises[30];	// 		//
		paisesFronteiras[16][33] = Paises[33];	// 		//
		// China [17][7] -- 16, 18, 19, 21, 27, 28 e 33//
		paisesFronteiras[17][16] = Paises[16];	// 		//
		paisesFronteiras[17][18] = Paises[18];	// 		//
		paisesFronteiras[17][19] = Paises[19];	// 		//
		paisesFronteiras[17][21] = Paises[21];	// 		//
		paisesFronteiras[17][27] = Paises[27];	// 		//
		paisesFronteiras[17][28] = Paises[28];	// 		//
		paisesFronteiras[17][33] = Paises[33];	// 		//
		// Cor�ia do Norte [18][3] -- 17, 19 e 24//
		paisesFronteiras[18][17] = Paises[17];	// 		//
		paisesFronteiras[18][19] = Paises[19];	// 		//
		paisesFronteiras[18][24] = Paises[24];	// 		//
		// Cor�ia do Sul [19][5] --  15, 17, 18, 21 e 32//
		paisesFronteiras[19][15] = Paises[15];	// 		//
		paisesFronteiras[19][17] = Paises[17];	// 		//
		paisesFronteiras[19][18] = Paises[18];	// 		//
		paisesFronteiras[19][21] = Paises[21];	// 		//
		paisesFronteiras[19][32] = Paises[32];	// 		//
		// Est�nia [20][3] -- 26, 29 e 46//
		paisesFronteiras[20][26] = Paises[26];	// 		//
		paisesFronteiras[20][29] = Paises[29];	// 		//
		paisesFronteiras[20][46] = Paises[46];	// 		//
		// �ndia [21][5] -- 15, 17, 19, 28 e 49//
		paisesFronteiras[21][15] = Paises[15];	// 		//
		paisesFronteiras[21][17] = Paises[17];	// 		//
		paisesFronteiras[21][19] = Paises[19];	// 		//
		paisesFronteiras[21][28] = Paises[28];	// 		//
		paisesFronteiras[21][49] = Paises[49];	// 		//
		// Ir� [22][3] -- 23, 28 e 31//
		paisesFronteiras[22][23] = Paises[23];	// 		//
		paisesFronteiras[22][28] = Paises[28];	// 		//
		paisesFronteiras[22][31] = Paises[31];	// 		//
		// Iraque [23][4] -- 14, 22, 25 e 31//
		paisesFronteiras[23][14] = Paises[14];	// 		//
		paisesFronteiras[23][22] = Paises[22];	// 		//
		paisesFronteiras[23][25] = Paises[25];	// 		//
		paisesFronteiras[23][31] = Paises[31];	// 		//
		// Jap�o [24][3] -- 16, 18 e 27//
		paisesFronteiras[24][16] = Paises[16];	// 		//
		paisesFronteiras[24][18] = Paises[18];	// 		//
		paisesFronteiras[24][27] = Paises[27];	// 		//
		// Jord�nia [25][4] -- 14, 23, 30 e 37//
		paisesFronteiras[25][14] = Paises[14];	// 		//
		paisesFronteiras[25][23] = Paises[23];	// 		//
		paisesFronteiras[25][30] = Paises[30];	// 		//
		paisesFronteiras[25][37] = Paises[37];	// 		//
		// Let�nia [26][7] -- 16, 20, 29, 33, 43, 46 e 47//
		paisesFronteiras[26][16] = Paises[16];	// 		//
		paisesFronteiras[26][20] = Paises[20];	// 		//
		paisesFronteiras[26][29] = Paises[29];	// 		//
		paisesFronteiras[26][33] = Paises[33];	// 		//
		paisesFronteiras[26][43] = Paises[43];	// 		//
		paisesFronteiras[26][46] = Paises[46];	// 		//
		paisesFronteiras[26][47] = Paises[47];	// 		//
		// Mong�lia [27][3] -- 16 17 24//
		paisesFronteiras[27][16] = Paises[16];	// 		//
		paisesFronteiras[27][17] = Paises[17];	// 		//
		paisesFronteiras[27][24] = Paises[24];	// 		//
		// Paquist�o [28][5] -- 17, 21, 22, 31 e 33//
		paisesFronteiras[28][17] = Paises[17];	// 		//
		paisesFronteiras[28][21] = Paises[21];	// 		//
		paisesFronteiras[28][22] = Paises[22];	// 		//
		paisesFronteiras[28][31] = Paises[31];	// 		//
		paisesFronteiras[28][33] = Paises[33];	// 		//
		// Russia [29][4] -- 16, 20, 26 e 30//
		paisesFronteiras[29][16] = Paises[16];	// 		//
		paisesFronteiras[29][20] = Paises[20];	// 		//
		paisesFronteiras[29][26] = Paises[26];	// 		//
		paisesFronteiras[29][30] = Paises[30];	// 		//
		// Sib�ria [30][3] -- 6, 16 e 29//
		paisesFronteiras[30][6] = Paises[6];	// 		//
		paisesFronteiras[30][16] = Paises[16];	// 		//
		paisesFronteiras[30][29] = Paises[29];	// 		//
		// Siria [31][5] -- 22, 23, 25, 28 e 33//
		paisesFronteiras[31][22] = Paises[22];	// 		//
		paisesFronteiras[31][23] = Paises[23];	// 		//
		paisesFronteiras[31][25] = Paises[25];	// 		//
		paisesFronteiras[31][28] = Paises[28];	// 		//
		paisesFronteiras[31][33] = Paises[33];	// 		//
		// Tail�ndia [32][2] -- 15 e 19//
		paisesFronteiras[32][15] = Paises[15];	// 		//
		paisesFronteiras[32][19] = Paises[19];	// 		//
		// Turquia [33][5] 16, 17, 26, 28 e 31//
		paisesFronteiras[33][16] = Paises[16];	// 		//
		paisesFronteiras[33][17] = Paises[17];	// 		//
		paisesFronteiras[33][26] = Paises[26];	// 		//
		paisesFronteiras[33][28] = Paises[28];	// 		//
		paisesFronteiras[33][31] = Paises[31];	// 		//
		
		/********* Africa ******/
		// Africa do Sul [34][2] -- 35 e 39//
		paisesFronteiras[34][35] = Paises[35];	// 	Angola	//
		paisesFronteiras[34][39] = Paises[39];	// Som�lia	//
		// Angola [35][3] -- 34, 36 e 39 //
		paisesFronteiras[35][34] = Paises[34];	// 	Africa do Sul	//
		paisesFronteiras[35][36] = Paises[36];	// 	Arg�lia	//
		paisesFronteiras[35][39] = Paises[39];	// 	Som�lia	//
		// Arg�lia [36][4] -- 37, 38, 40 e 42//
		paisesFronteiras[36][37] = Paises[37];	// 	Egito	//
		paisesFronteiras[36][38] = Paises[38];	// 	Nig�ria	//
		paisesFronteiras[36][40] = Paises[40];	// 	Espanha	//
		paisesFronteiras[36][42] = Paises[42];	// 	It�lia	//
		// Egito [37][5] -- 36, 38, 39 , 25 e 45//
		paisesFronteiras[37][25] = Paises[25];	// 	Jord�nia	//
		paisesFronteiras[37][36] = Paises[36];	// 	Arg�lia	//
		paisesFronteiras[37][38] = Paises[38];	// 	Nig�ria	//
		paisesFronteiras[37][39] = Paises[39];	// 	Som�lia	//
		paisesFronteiras[37][45] = Paises[45];	// 	Rom�nia	//
		// Nig�ria [38][5] -- 35, 36, 37, 39 e 1//
		paisesFronteiras[38][1] = Paises[1];	// 	Brasil	//
		paisesFronteiras[38][35] = Paises[35];	// 	Angola	//
		paisesFronteiras[38][36] = Paises[36];	// 	Arg�lia	//
		paisesFronteiras[38][37] = Paises[37];	// 	Egito	//
		paisesFronteiras[38][39] = Paises[39];	// 	Som�lia	//
		// Som�lia [39][5] -- 34, 35, 37, 38 e 14//
		paisesFronteiras[39][14] = Paises[14];	// 	Ar�bia Saudita	//
		paisesFronteiras[39][34] = Paises[34];	// 	Africa do Sul	//
		paisesFronteiras[39][35] = Paises[35];	// 	Angola	//
		paisesFronteiras[39][37] = Paises[37];	// 	Egito	//
		paisesFronteiras[39][38] = Paises[38];	// 	Nig�ria	//

		/********* Europa ******/
		// Espanha [40][2] -- 41 e 36//
		paisesFronteiras[40][36] = Paises[36];	// 	Arg�lia	//
		paisesFronteiras[40][41] = Paises[41];	// 	Fran�a	//
		// Fran�a [41][4] -- 40, 42, 44 e 46//
		paisesFronteiras[41][40] = Paises[40];	// 	Espanha	//
		paisesFronteiras[41][42] = Paises[42];	// 	It�lia	//
		paisesFronteiras[41][44] = Paises[44];	// 	Reino Unido	//
		paisesFronteiras[41][46] = Paises[46];	// 	Su�cia	//
		// It�lia [42][5] -- 41, 43, 45, 46 e 36 //
		paisesFronteiras[42][36] = Paises[36];	// 	Arg�lia	//
		paisesFronteiras[42][41] = Paises[41];	// 	Fran�a	//
		paisesFronteiras[42][43] = Paises[43];	// 	Pol�nia	//
		paisesFronteiras[42][45] = Paises[45];	// 	Rom�nia	//
		paisesFronteiras[42][46] = Paises[46];	// 	Su�cia	//
		// Pol�nia [43][4] -- 42, 45, 47 e 26//
		paisesFronteiras[43][26] = Paises[26];	// 	Let�nia	//
		paisesFronteiras[43][42] = Paises[42];	// 	It�lia	//
		paisesFronteiras[43][45] = Paises[45];	// 	Rom�nia	//
		paisesFronteiras[43][47] = Paises[47];	// 	Ucr�nia	//
		// Reino Unido [44][2] -- 41 e 7//
		paisesFronteiras[44][7] = Paises[7];	// 	Groel�ndia	//
		paisesFronteiras[44][41] = Paises[41];	// 	Fran�a	//
		// Rom�nia [45][4] -- 47, 43, 42 e 37//
		paisesFronteiras[45][37] = Paises[37];	// 	Egito	//
		paisesFronteiras[45][42] = Paises[42];	// 	It�lia	//
		paisesFronteiras[45][43] = Paises[43];	// 	Pol�nia	//
		paisesFronteiras[45][47] = Paises[47];	// 	Ucr�nia	//
		// Su�cia [46][4] -- 41, 42, 26 e 20//
		paisesFronteiras[46][20] = Paises[20];	// 	Est�nia	//
		paisesFronteiras[46][26] = Paises[26];	// 	Let�nia	//
		paisesFronteiras[46][41] = Paises[41];	// 	Fran�a	//
		paisesFronteiras[46][42] = Paises[42];	// 	It�lia	//
		// Ucr�nia [47][4] -- 26 44 43 e 33//
		paisesFronteiras[47][26] = Paises[26];	// 	Let�nia	//
		paisesFronteiras[47][33] = Paises[33];	// 	Turquia	//
		paisesFronteiras[47][43] = Paises[43];	// 	Pol�nia	//
		paisesFronteiras[47][44] = Paises[44];	// 	Reino Unido	//
		
		/********* Oceania ******/
		// Austr�lia [48][3] -- 49, 50 e 51//
		paisesFronteiras[48][49] = Paises[49];	// 	Indon�sia	//
		paisesFronteiras[48][50] = Paises[50];	// 	Nova Zel�ndia	//
		paisesFronteiras[48][51] = Paises[51];	// 	Perth	//
		// Indon�sia [49][4] -- 15, 21, 48 e 50//
		paisesFronteiras[49][15] = Paises[15];	// 	Bangladesh	//
		paisesFronteiras[49][21] = Paises[21];	// 	�ndia	//
		paisesFronteiras[49][48] = Paises[48];	// 	Austr�lia	//
		paisesFronteiras[49][50] = Paises[50];	// 	Nova Zel�ndia	//
		// Nova Zel�ndia [50][2] -- 48 e 49//
		paisesFronteiras[50][48] = Paises[48];	// 	Austr�lia	//
		paisesFronteiras[50][49] = Paises[49];	// 	Indon�sia	//
		// Perth [51][1] -- 48//
		paisesFronteiras[51][48] = Paises[48];	// 	Austr�lia	//
		
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
		Territorio[] americaNorte = new Territorio[9];		 
		for( i=0 ; i < 9;i++) {
			americaNorte[i]=new Territorio();
		}
		americaNorte[0]=listaTerritorios[4];
		americaNorte[1]=listaTerritorios[5];
		americaNorte[2]=listaTerritorios[6];
		americaNorte[3]=listaTerritorios[7];
		americaNorte[4]=listaTerritorios[8];
		americaNorte[5]=listaTerritorios[9];
		americaNorte[6]=listaTerritorios[10];
		americaNorte[7]=listaTerritorios[11];
		americaNorte[8]=listaTerritorios[12];
		
		listaContinentes[1].setNomeContinente("America do Norte");
		listaContinentes[1].setNumTerritorios(9);
		listaContinentes[1].setTerritoriosContinente(americaNorte);
		
		
		/* Asia */
		Territorio[] asia = new Territorio[20];		 
		for( i=0 ; i < 20;i++) {
			americaNorte[i]=new Territorio();
		}
		asia[0]=listaTerritorios[13];
		asia[1]=listaTerritorios[14];
		asia[2]=listaTerritorios[15];
		asia[3]=listaTerritorios[16];
		asia[4]=listaTerritorios[17];
		asia[5]=listaTerritorios[18];
		asia[6]=listaTerritorios[19];
		asia[7]=listaTerritorios[20];
		asia[8]=listaTerritorios[21];
		asia[9]=listaTerritorios[22];
		asia[10]=listaTerritorios[23];
		asia[11]=listaTerritorios[24];
		asia[12]=listaTerritorios[25];
		asia[13]=listaTerritorios[26];
		asia[14]=listaTerritorios[27];
		asia[15]=listaTerritorios[28];
		asia[16]=listaTerritorios[29];
		asia[17]=listaTerritorios[30];
		asia[18]=listaTerritorios[31];
		asia[19]=listaTerritorios[32];
		
		listaContinentes[1].setNomeContinente("Asia");
		listaContinentes[1].setNumTerritorios(20);
		listaContinentes[1].setTerritoriosContinente(asia);		
		
		/* Africa */
		Territorio[] africa = new Territorio[6];		 
		for( i=0 ; i < 6;i++) {
			americaNorte[i]=new Territorio();
		}
		africa[0]=listaTerritorios[33];
		africa[1]=listaTerritorios[34];
		africa[2]=listaTerritorios[35];
		africa[3]=listaTerritorios[36];
		africa[4]=listaTerritorios[37];
		africa[5]=listaTerritorios[38];
		
		listaContinentes[1].setNomeContinente("Africa");
		listaContinentes[1].setNumTerritorios(6);
		listaContinentes[1].setTerritoriosContinente(africa);		
		
		/* Europa */
		Territorio[] europa = new Territorio[8];		 
		for( i=0 ; i < 8;i++) {
			americaNorte[i]=new Territorio();
		}
		europa[0]=listaTerritorios[39];
		europa[1]=listaTerritorios[40];
		europa[2]=listaTerritorios[41];
		europa[3]=listaTerritorios[42];
		europa[4]=listaTerritorios[43];
		europa[5]=listaTerritorios[44];
		europa[6]=listaTerritorios[45];
		europa[7]=listaTerritorios[46];
		
		listaContinentes[1].setNomeContinente("Europa");
		listaContinentes[1].setNumTerritorios(8);
		listaContinentes[1].setTerritoriosContinente(europa);		
		
		/* Oceania */
		Territorio[] oceania = new Territorio[4];		 
		for( i=0 ; i < 4;i++) {
			americaSul[i]=new Territorio();
		}
		oceania[0]=listaTerritorios[47];
		oceania[1]=listaTerritorios[48];
		oceania[2]=listaTerritorios[49];
		oceania[3]=listaTerritorios[50];
		listaContinentes[0].setNomeContinente("Oceania");
		listaContinentes[0].setNumTerritorios(4);
		listaContinentes[0].setTerritoriosContinente(oceania);			
		
		
		return listaContinentes;
		
	}
	
	
	// Define informa��es dos jogadores //
	private Jogador[] defineJogadores(int numJogadores) {
		Jogador[] lstJogadores = new Jogador[numJogadores];
		Exercitos = new Exercito[numJogadores];
		
		for ( int i=0; i < numJogadores;i++) {
			lstJogadores[i] = new Jogador();
			Exercitos[i] = new Exercito();
		}
		
		String nomeJog;
		String corJog;
		Scanner Jog = new Scanner(System.in);
		
		
		for (int j =0; j < numJogadores; j++) {
			
			System.out.println("Digite o nome do jogador: ");
			nomeJog = Jog.next();
			
			for( int i = 0 ; i < numJogadores; i++) {
				if( lstJogadores[i].getnomeJogador() != null) {
					if (lstJogadores[i].getnomeJogador().equals(nomeJog) == true) {
						System.out.println("Nome indispon�vel, digite outro nome:");
						nomeJog = Jog.next();
						i=0;
					}
				}
			}
			
			System.out.println("Digite a cor do jogador "+nomeJog+":");
			corJog = Jog.next();			
			for( int i = 0 ; i < numJogadores; i++) { 
				if(lstJogadores[i].getColor() != null) {
					if (lstJogadores[i].getColor().equals(corJog) == true) {
						System.out.println("Cor indispon�vel, digite outra cor:");
						corJog = Jog.next();
						i=0;
					}
				}
			}
			
			lstJogadores[j].setCor(corJog);
			lstJogadores[j].setnomeJogador(nomeJog);
			Exercitos[j].setCorExercito(corJog);
			Exercitos[j].setdonoExercito(lstJogadores[j]);
			Exercitos[j].setQTDExercito(0);
		}
		
		return lstJogadores;
	}
	
	
	// Define os donos territ�rios iniciais // Utiliza inicializaTerritorios() e defineJogadores() //
	private Jogador[] defineDonoTerritorios(Jogador[] listaJogadores) {
		
		int numJogadores = listaJogadores.length;
		int i=0, j=0;		
		int qtdTerritoriosPorJogador = numeroDeTerritorios/numJogadores;
		Territorio[] listaTerritorios = inicializaTerritorios();
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
	private void defineDonoObjetivos(Jogador[] listaJogadores) {
		Objetivo Objtemp = new Objetivo();
		
/*� Conquistar na totalidade a EUROPA, a OCEANIA e mais um terceiro. OK
� Conquistar na totalidade a ASIA e a AM�RICA DO SUL. OK
� Conquistar na totalidade a EUROPA, a AM�RICA DO SUL e mais um terceiro. OK
� Conquistar na totalidade a ASIA e a �FRICA. OK
� Conquistar na totalidade a AM�RICA DO NORTE e a �FRICA. OK
� Conquistar 24 TERRIT�RIOS � sua escolha. OK
� Conquistar na totalidade a AM�RICA DO NORTE e a OCEANIA. OK
� Destruir totalmente OS EX�RCITOS AZUIS. OK
� Destruir totalmente OS EX�RCITOS AMARELOS. OK
� Destruir totalmente OS EX�RCITOS VERMELHOS. OK
� Destruir totalmente OS EX�RCITOS PRETOS. OK
� Destruir totalmente OS EX�RCITOS BRANCO. OK
� Destruir totalmente OS EX�RCITOS VERDES. OK */
		
		// Cria uma lista de objetivos padr�o //
		Objetivos = new Objetivo[13];		
		for ( int i=0; i < Objetivos.length;i++) {
			Objetivos[i]= new Objetivo();
		}
		Objetivos[0].setContinentes(null); 		// Continentes necess�rios para ganhar					//
		Objetivos[0].setDonoObjetivo(null); 	// Dono do Objetivo que ser� escolhido aleatoriamente 	//
		Objetivos[0].setExercitos("Vermelho"); 	// Ex�rcito que precisa ser destr�do para ganhar 		//
		Objetivos[0].setTerritorios(1); 		// Quantidade de territ�rios necess�rios para ganhar	//
		 
		String[] eaS = new String [3];
		eaS[0] = "europa";
		eaS[1] = "americaSul";
		eaS[2] = null;
		Objetivos[1].setContinentes(eaS); 				
		Objetivos[1].setDonoObjetivo(null); 	
		Objetivos[1].setExercitos(null); 	
		Objetivos[1].setTerritorios(0); 

		Objetivos[2].setContinentes(null); 				
		Objetivos[2].setDonoObjetivo(null); 	
		Objetivos[2].setExercitos("Verde"); 	
		Objetivos[2].setTerritorios(1);
		
		Objetivos[3].setContinentes(null); 				
		Objetivos[3].setDonoObjetivo(null); 	
		Objetivos[3].setExercitos("Azul"); 	
		Objetivos[3].setTerritorios(1);
		
		Objetivos[4].setContinentes(null); 				
		Objetivos[4].setDonoObjetivo(null); 	
		Objetivos[4].setExercitos("Preto"); 	
		Objetivos[4].setTerritorios(1);		
		
		Objetivos[5].setContinentes(null); 				
		Objetivos[5].setDonoObjetivo(null); 	
		Objetivos[5].setExercitos("Branco"); 	
		Objetivos[5].setTerritorios(1);
		
		Objetivos[6].setContinentes(null); 				
		Objetivos[6].setDonoObjetivo(null); 	
		Objetivos[6].setExercitos("Amarelo"); 	
		Objetivos[6].setTerritorios(1);

		Objetivos[7].setContinentes(null); 				
		Objetivos[7].setDonoObjetivo(null); 	
		Objetivos[7].setExercitos(null); 	
		Objetivos[7].setTerritorios(24);
		
		String[] aNo = new String [2];
		aNo[0] = "americaNorte";
		aNo[1] = "oceania";
		Objetivos[8].setContinentes(aNo); 				
		Objetivos[8].setDonoObjetivo(null); 	
		Objetivos[8].setExercitos(null); 	
		Objetivos[8].setTerritorios(0);
		
		String[] aNa = new String [2];
		aNa[0] = "americaNorte";
		aNa[1] = "africa";
		Objetivos[9].setContinentes(aNa); 				
		Objetivos[9].setDonoObjetivo(null); 	
		Objetivos[9].setExercitos(null); 	
		Objetivos[9].setTerritorios(0);
		
		String[] aa = new String [2];
		aa[0] = "africa";
		aa[1] = "asia";
		Objetivos[10].setContinentes(aa); 				
		Objetivos[10].setDonoObjetivo(null); 	
		Objetivos[10].setExercitos(null); 	
		Objetivos[10].setTerritorios(0);
		
		String[] aSa = new String [2];
		aSa[0] = "americaSul";
		aSa[1] = "asia";
		Objetivos[11].setContinentes(aSa); 				
		Objetivos[11].setDonoObjetivo(null); 	
		Objetivos[11].setExercitos(null); 	
		Objetivos[11].setTerritorios(0);
		
		String[] eo = new String [3];
		eo[0] = "europa";
		eo[1] = "oceania";
		eo[2] = null;
		Objetivos[12].setContinentes(eo); 				
		Objetivos[12].setDonoObjetivo(null); 	
		Objetivos[12].setExercitos(null); 	
		Objetivos[12].setTerritorios(0);
		
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
		
		
	}
	
	
	
	// Fun��es para usar externamente //
	
	public void inicializaTudo() {
		Scanner J = new Scanner(System.in);
		int qtdJog=0;
		System.out.println("Digite o n�mero de jogadores: ");
		qtdJog = J.nextInt();
		
		
		while(qtdJog < 0  || qtdJog>6) {
			System.out.println("Quantidade de jogadores indispon�vel!");
			System.out.println("Digite o n�mero de jogadores: ");
			qtdJog = J.nextInt();
		}
		Jogador[] listaCompleta =defineJogadores(qtdJog);
		listaCompleta = defineDonoTerritorios(listaCompleta);
		Continentes = defineContinentes(listaTerritorios);
		defineDonoObjetivos(listaCompleta);
		listaJogadores = listaCompleta;
		
		
	}
	
	
	
	public Jogador[] getListaJogadores() {
		return listaJogadores;
	}
	public void setListaJogadores(Jogador[] lstJogadores) {
		listaJogadores = lstJogadores;
	}
	
	public Territorio[] getListaTerritorios() {
		return listaTerritorios;
	}
	public void setListaTerritorios(Territorio[] lstTerritorio) {
		listaTerritorios = lstTerritorio;
	}
	
	public Exercito[] getListaExercitos() {
		return Exercitos;
	}
	public void setListaExercitos(Exercito[] Ex) {
		Exercitos = Ex;
	}
	
	public Continente[] getListaContinentes() {
		return Continentes;
	}
	public void setListaContinentes(Continente[] Cont) {
		Continentes = Cont;
	}
	


	
}