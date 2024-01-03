package taller10;
import java.util.Scanner;
import java.util.Scanner;
public class DiagonalSecundaria07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimension de las matrices: ");
        int dimension=scanner.nextInt();
        int mt[][] = new int[dimension][dimension];
        for (int i = 0; i < mt.length; i++){
            for (int j = 0; j < mt.length; j++){ 
                mt[i][j] = (int) (Math.random() * 19 - 9);
                System.out.print(mt[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("diagonal secundaria ");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++){ 
                double suma= i+j;
                if (suma== (dimension-1))
                    System.out.print(mt[i][j]+"   ");
                else
                    System.out.printf("    "); 
            }
            System.out.println(" ");
        }
        System.out.println("Por arriba ");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++){ 
                double suma= i+j;
                if (suma< (dimension-1)){
                    System.out.print(mt[i][j]+"   ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Por debajo ");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++){ 
                double suma= i+j;
                if (suma> (dimension-1))
                    System.out.print(mt[i][j]+"   ");
                else
                    System.out.printf("    "); 
            }
            System.out.println("");
        }
    }
}
/*
4
-5   -2   7   0   
-8   6   6   -3   
-5   -5   -3   0   
-6   -6   2   0   
 
diagonal secundaria 
            0    
        6        
    -5            
-6                
Por arriba 
-5   -2   7    
-8   6    
-5    
 
Por debajo 
                
            -3   
        -3   0   
    -6   2   0   
*/