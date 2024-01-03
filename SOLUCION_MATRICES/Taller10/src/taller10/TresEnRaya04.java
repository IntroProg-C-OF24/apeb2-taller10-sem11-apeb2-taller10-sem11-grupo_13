package taller10;
import java.util.Scanner;
public class TresEnRaya04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turno=1, tiros=0, fila, columna;
        String tablero[][]=new String [3][3];
        boolean juegoTerminado=true;
        for (int i = 0; i < tablero.length; i++) 
            for (int j = 0; j < tablero.length; j++) 
                tablero[i][j]= " ";
        while ((tiros<=tablero.length*tablero.length)&&(juegoTerminado)){
            for (int i = 0; i < tablero.length; i++){
                for (int j = 0; j < tablero.length; j++){
                    System.out.printf("%s | \t",tablero[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println("Turno del jugador " + turno + ". Indique la fila (1-3): ");
            fila=scanner.nextInt();
            fila=fila-1;
            System.out.println("Indique la columna [1-3): ");
            columna=scanner.nextInt();
            columna=columna-1;
            if (tablero[fila][columna]==" "){
                if (turno==1)
                    tablero[fila][columna]="X";
                else
                    tablero[fila][columna]="O";
                for (int i = 0; i < tablero.length; i++){
                    if (((tablero[i][0]!=" ")&&(tablero[i][0]==tablero[i][1])&&(tablero[i][1]==tablero[i][2]))||((tablero[0][i]!= " ")&&(tablero[0][i]==tablero[1][i])&&(tablero[1][i]==tablero[2][i]))){
                        System.out.println("El jugador " + turno + " ha ganado");
                        juegoTerminado=false;
                    }
                }
                if (((tablero[0][0]!=" ")&&(tablero[0][0]==tablero[1][1])&&(tablero[1][1]==tablero[2][2]))||((tablero[0][2]!=" ")&&(tablero[0][2]==tablero[1][1])&&(tablero[1][1]==tablero[2][0]))){
                        System.out.println("El jugador " + turno + " ha ganado");
                        juegoTerminado=false;
                }
                if (turno==1){
                    tablero[fila][columna]="X";
                    turno=2;
                }else{
                    tablero[fila][columna]="O";
                    turno=1;
                tiros=tiros+1;
                }
            }else
                System.out.println("Repetir el turno y seleccione una posición que esté libre.");
            if ((tiros==9)&&(!juegoTerminado)){
                System.out.println("¡Es un empate!");  
                juegoTerminado=false;
            }
        }
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero.length; j++){
                System.out.printf("%s | \t",tablero[i][j]);
            }
            System.out.println(" ");
        }
    }
}
/*
El jugador 2 ha ganado
O | 	X | 	X | 	 
  | 	O | 	X | 	 
  | 	  | 	O | 	
*/