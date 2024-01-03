package taller10;
import java.util.Scanner;
public class DiagonalPrincipal08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimension de las matrices: ");
        int dimension=scanner.nextInt();
        int mt[][] = new int[dimension][dimension];
        for (int i = 0; i < mt.length; i++){
            for (int j = 0; j < mt.length; j++){ 
                mt[i][j] = (int) (int) (Math.random() * 19 - 9);
                System.out.print(mt[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("diagonal principal ");
        for (int i = 0; i < mt.length; i++){
            for (int j = 0; j < mt.length; j++){
                if (i==j)
                    System.out.print(mt[i][j]+"    ");
                else
                    System.out.printf("    ");
            }
            System.out.println("");
        }
        System.out.println("Por arriba ");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++){ 
                if (i<j)
                    System.out.print(mt[i][j]+"   ");
                else
                    System.out.printf("    "); 
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Por abajo ");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++){ 
                if (i>j)
                    System.out.print(mt[i][j]+"   ");
            }
            System.out.println(" ");
        }
    }
}
/*
-7   6   -2   -7   -3   
6   -4   6   8   2   
4   -7   -1   9   -4   
9   5   -4   4   -1   
4   -1   -1   0   0   
 
diagonal principal 
-7                    
    -4                
        -1            
            4        
                0    
Por arriba 
    6   -2   -7   -3   
        6   8   2   
            9   -4   
                -1   
                    
 
Por abajo 
 
6    
4   -7    
9   5   -4    
4   -1   -1   0    
*/