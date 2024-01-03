package taller10;
import java.util.Scanner;
public class GenerarFigura09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimension de las matrices: ");
        int dimension=scanner.nextInt();
        System.out.println("Caracter: ");
        String figura=scanner.next();
        System.out.println("Figura: ");
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j <= i; j++){
                System.out.printf(figura+" \t");
            }
            System.out.println("");
        }
    }
}
/*
Ingrese la dimension de las matrices: 
4
Caracter: 
*
Figura: 
* 	
* 	* 	
* 	* 	* 	
* 	* 	* 	* 	
*/