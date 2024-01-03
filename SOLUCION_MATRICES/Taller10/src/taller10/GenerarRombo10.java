package taller10;
import java.util.Scanner;
public class GenerarRombo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimension de las matrices: ");
        int n=scanner.nextInt();
        System.out.println("Caracter: ");
        String figura=scanner.next();
        System.out.println("Figura: ");
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.printf(" ");
            }
            for (int k = i; k <= n; k++){
                System.out.printf(figura+" ");
            }
            System.out.println(" ");
        }
        n--;
        for (int i = n; i >= 1; i--){
            System.out.printf(" ");
            for (int k = i; k <= n; k++){
                System.out.printf(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.printf(figura+" ");
            }
            System.out.println(" ");
        }
    }
}
/*
Figura: 
     *  
    * *  
   * * *  
  * * * *  
 * * * * *  
  * * * *  
   * * *  
    * *  
     *  
*/