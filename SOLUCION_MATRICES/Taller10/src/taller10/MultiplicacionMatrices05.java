package taller10;
import java.util.Scanner;
public class MultiplicacionMatrices05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = 0, numero;
        System.out.println("Ingrese la dimension de las matrices: ");
        dimension=scanner.nextInt();
        int matriz[][]=new int [dimension][dimension];
        System.out.println("Matriz 1:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (int) (Math.random() * 19 - 9);
                System.out.printf("%d  |\t",matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                numero = (int) (Math.random() * 19 - 9);
                System.out.printf("%d  |\t",numero);
                matriz[i][j] = matriz[i][j] * numero;
            }
            System.out.println(" ");
        }
        System.out.println("Multiplicacion de Matrices: ");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.printf("%d  |\t",matriz[i][j]);
            }
            System.out.println(" ");
        }
    } 
}
/*
Matriz 1:
3  |	0  |	4  |	7  |	8  |	 
5  |	-7  |	0  |	-4  |	-5  |	 
-2  |	-7  |	8  |	-8  |	-2  |	 
4  |	0  |	7  |	7  |	2  |	 
2  |	-2  |	-8  |	-3  |	2  |	 
Matriz 2:
9  |	6  |	-5  |	-2  |	-6  |	 
1  |	9  |	3  |	1  |	-1  |	 
4  |	-2  |	-5  |	3  |	9  |	 
0  |	5  |	-2  |	-3  |	5  |	 
-4  |	-8  |	7  |	7  |	9  |	 
Multiplicacion de Matrices: 
27  |	0  |	-20  |	-14  |	-48  |	 
5  |	-63  |	0  |	-4  |	5  |	 
-8  |	14  |	-40  |	-24  |	-18  |	 
0  |	0  |	-14  |	-21  |	10  |	 
-8  |	16  |	-56  |	-21  |	18  |	 
*/