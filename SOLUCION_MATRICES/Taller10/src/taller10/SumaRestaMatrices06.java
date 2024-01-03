package taller10;
import java.util.Scanner;
public class SumaRestaMatrices06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = 0, operacionMatriz;
        String operacion;
        System.out.println("Ingrese la dimension de las matrices: ");
        dimension=scanner.nextInt();
        int matriz1[][]=new int [dimension][dimension];
        int matriz2[][]=new int [dimension][dimension];
        System.out.println("Matriz 1:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz1[i][j] = (int) (Math.random() * 19 - 9);
                System.out.printf("%d  |\t",matriz1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz2[i][j] = (int) (Math.random() * 19 - 9);
                System.out.printf("%d  |\t",matriz2[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Que operacion desea realizar?");
        operacion= scanner.next();
        if (operacion.toUpperCase().equals("SUMA")){
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    operacionMatriz=matriz1[i][j]+matriz2[i][j];
                    System.out.printf("%d  |\t",operacionMatriz);
                }
                System.out.println(" ");
            }
        }
        if (operacion.toUpperCase().equals("RESTA")){
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    operacionMatriz=matriz1[i][j]+matriz2[i][j];
                    System.out.printf("%d  |\t",operacionMatriz);
                }
                System.out.println(" ");
            }
        }    
    } 
}
/*
Matriz 1:
5  |	-3  |	-3  |	 
4  |	3  |	-1  |	 
-6  |	-3  |	0  |	 
Matriz 2:
-6  |	-2  |	-5  |	 
-1  |	4  |	-4  |	 
0  |	1  |	9  |	 
Que operacion desea realizar?
Suma
-1  |	-5  |	-8  |	 
3  |	7  |	-5  |	 
-6  |	-2  |	9  |	 
*/