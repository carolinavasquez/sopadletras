package sopadletras;

import java.util.Scanner;

public class sopadletras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("❣•●○●BUSCAR LETRAS❣•●○●");
		System.out.println();
		Scanner read = new Scanner(System.in); 

		char letra[][]=new char[10][10];//arreglos bidimensionales
		letra  [0][0]='a';
		letra  [1][0]='n';
		letra  [2][0]='a';
		letra  [3][0]='i';
		letra  [4][0]='v';
		letra  [5][0]='s';
		letra  [6][0]='e';
		letra  [7][0]='b';
		letra  [8][0]='q';
		letra  [9][0]='v';
		letra  [0][1]='q';
		letra  [1][1]='c';
		letra  [2][1]='m';
		letra  [3][1]='q';
		letra  [4][1]='ñ';
		letra  [5][1]='w';
		letra  [6][1]='z';
		letra  [7][1]='r';
		letra  [8][1]='x';
		letra  [9][1]='p';
		letra  [0][2]='n';
		letra  [1][2]='q';
		letra  [2][2]='a';
		letra  [3][2]='m';
		letra  [4][2]='o';
		letra  [5][2]='r';
		letra  [6][2]='a';
		letra  [7][2]='z';
		letra  [8][2]='t';
		letra  [9][2]='e';
		letra  [0][3]='c';
		letra  [1][3]='a';
        letra  [2][3]='t';
        letra  [3][3]='o';
        letra  [4][3]='w';
        letra  [5][3]='b';
        letra  [6][3]='z';
        letra  [7][3]='w';
        letra  [8][3]='m';
        letra  [9][3]='q';
        letra  [0][4]='r';
        letra  [1][4]='a';
        letra  [2][4]='b';
        letra  [3][4]='c';
        letra  [4][4]='d';
        letra  [5][4]='a';
        letra  [6][4]='c';
        letra  [7][4]='a';
        letra  [8][4]='s';
        letra  [9][4]='i';
        letra  [0][5]='a';
        letra  [1][5]='z';
        letra  [2][5]='g';
        letra  [3][5]='w';
        letra  [4][5]='c';
        letra  [5][5]='b';
        letra  [6][5]='n';
        letra  [7][5]='m';
        letra  [8][5]='a';
        letra  [9][5]='r';
		letra  [0][6]='t';
		letra  [1][6]='e';
		letra  [2][6]='h';
		letra  [3][6]='l';
		letra  [4][6]='w';
		letra  [5][6]='z';
		letra  [6][6]='z';
		letra  [7][6]='a';
		letra  [8][6]='b';
		letra  [9][6]='c';
		letra  [0][7]='d';
		letra  [1][7]='e';
		letra  [2][7]='o';
		letra  [3][7]='r';
		letra  [4][7]='o';
		letra  [5][7]='c';
		letra  [6][7]='e';
		letra  [7][7]='y';
		letra  [8][7]='s';
		letra  [9][7]='w';
		letra  [0][8]='i';
		letra  [1][8]='e';
		letra  [2][8]='a';
		letra  [3][8]='t';
		letra  [4][8]='e';
		letra  [5][8]='l';
		letra  [6][8]='h';
		letra  [7][8]='d';
		letra  [8][8]='f';
		letra  [9][8]='x';
		letra  [0][9]='w';
		letra  [1][9]='w';
		letra  [2][9]='u';
		letra  [3][9]='t';
		letra  [4][9]='e';
		letra  [5][9]='t';
		letra  [6][9]='q';
		letra  [7][9]='w';
		letra  [8][9]='a';
		letra  [9][9]='z';
		
		for(int j=0; j<10;j++)//repetidor es un ciclo en un ciclo
		{
			for(int i=0; i<10;i++)
			{
				System.out.print("-"+letra [i][j]+"");
				
			}
			System.out.println();
		}
		
		
        String acierto;
        Scanner carolina = new Scanner(System.in);
        
        int num = 3;
        int buscandopalabras = 0;
        System.out.println("۰•● ❤ ●•۰tienes 4 intentos  para adivinar۰•● ❤ ●•۰");
        while ( num> 0 && buscandopalabras< 4)
        {
           
           System.out.println("inicie la Busqueda de Palabras: ");//imprime las palabras 
           acierto = carolina.next();
           acierto=acierto.toUpperCase();
        
            if (acierto.equals("azteca") 
             || acierto.equals("amor") // palabras ocultas
             ||acierto.equals("ana")
             || acierto.equals("tel"))
            {
            	buscandopalabras++;
            }
            else
            {
                num--;
            }                                              
        }   
        if (num == 0)
        {
            System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠lastima has perdido el juego ☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");//perdio el juego
        }
        else
        {
            System.out.println("☻☻☻☻☻☻☻☻☻felicidades has ganado☻☻☻☻☻☻☻☻☻");//gano el juego
            

			 
		return; 
	}
}


}
