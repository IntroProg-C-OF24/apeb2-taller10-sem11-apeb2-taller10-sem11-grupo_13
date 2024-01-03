package taller10;
import java.util.Scanner;
public class NotasEstudiantes01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limEst= 5, limNotas=3;
        String nomAband[]=new String [limEst], mayorNotaNombre, menorNotaNombre;
        double matNotas[][]=new double [limEst][limNotas], mayorNota, menorNota, promedioCurso=0;
        double arrProm[]= new double [limEst];
        for (int i = 0; i < limEst; i++){ 
            System.out.println("Ingrese el nombre del estudiante: ");
            nomAband[i]=scanner.next();
            for (int j = 0; j < limNotas; j++) 
                matNotas[i][j]=(double)(Math.random() * (9 - 0 + 1) + 0);
        }
        for (int i = 0; i < limEst; i++){
            arrProm[i]=(matNotas[i][0]*0.35)+(matNotas[i][1]*0.35)+(matNotas[i][2]*0.30);
            promedioCurso=promedioCurso+arrProm[i];
        }
        promedioCurso=promedioCurso/limEst;
        System.out.println("Lista de estudiantes y sus notas");
        System.out.println("NOMBRES |  ACD  |  APE |   AA  | PROMEDIO");
        for (int i = 0; i < limEst; i++){
            System.out.print(nomAband[i]+"\t");
            for (int j = 0; j < limNotas; j++) 
                System.out.printf("| %.2f \t", matNotas[i][j]);
            System.out.printf("| %.2f \t",arrProm[i]);
            System.out.println("");
        }
        mayorNotaNombre = nomAband[0];
        mayorNota = arrProm[0];
        menorNotaNombre = nomAband[0];
        menorNota = arrProm[0];
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i] > mayorNota){
                mayorNota = arrProm[i];
                mayorNotaNombre = nomAband[i];
            }
            else 
                if (arrProm[i] < menorNota){ 
                    menorNota = arrProm[i];
                    menorNotaNombre = nomAband[i];
                }
        }
        System.out.printf("%s %.2f\n","Promedio del paralelo [C]: ",promedioCurso);
        System.out.println("Estudiantes con una nota por encima del promedio: ");
        for (int i = 0; i < limEst; i++)
            if (arrProm[i]>=promedioCurso)
                System.out.printf("%s: %.2f\n",nomAband[i],arrProm[i]);
        System.out.println("Estudiantes con una nota por debajo del promedio: ");
        for (int i = 0; i < limEst; i++)
            if (arrProm[i]<promedioCurso)
                System.out.printf("%s: %.2f\n",nomAband[i],arrProm[i]);
        System.out.printf("%s%s %s%.2f\n","El estudiante con la mayor nota es ",mayorNotaNombre,"con una nota de ",mayorNota);
        System.out.printf("%s%s %s%.2f\n","El estudiante con la menor nota es ",menorNotaNombre,"con una nota de ",menorNota);
    }
}

/*
Lista de estudiantes y sus notas
NOMBRES |  ACD  |  APE |   AA  | PROMEDIO
Marcos	| 9.65 	| 5.29 	| 3.99 	| 6.43 	
Henry	| 1.78 	| 7.33 	| 7.98 	| 5.58 	
Fran	| 0.25 	| 4.47 	| 6.60 	| 3.63 	
Daniel	| 6.82 	| 2.77 	| 7.33 	| 5.55 	
Julian	| 1.24 	| 8.14 	| 9.77 	| 6.21 	
Promedio del paralelo [C]:  5.48
Estudiantes con una nota por encima del promedio: 
Marcos: 6.43
Henry: 5.58
Daniel: 5.55
Julian: 6.21
Estudiantes con una nota por debajo del promedio: 
Fran: 3.63
El estudiante con la mayor nota es Marcos con una nota de 6.43
El estudiante con la menor nota es Fran con una nota de 3.63*/
