package taller10;
import java.util.Scanner;
public class InventarioTienda02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limProd= 0, limDatos=2, agregar, inicial=0;
        String nomProd[]=new String [28], nombreAct;
        boolean mensaje=(true);
        double precCant[][]=new double [28][28];
        do{
            System.out.println("Desea agregar productos o buscar producto? (Agregar/Buscar/Finalizar)");
            String respuesta = scanner.next();
            if (respuesta.toUpperCase().equals("AGREGAR")){
                System.out.println("Cuantos productos desea agregar?");
                agregar=scanner.nextInt();
                inicial=limProd;
                limProd=limProd+agregar;
                for (int i = inicial; i < limProd; i++){ 
                    System.out.println("Ingrese el nombre del producto: ");
                    nomProd[i]=scanner.next();
                    System.out.println("Ingrese precio y cantidad: ");
                    for (int j = 0; j < limDatos; j++){
                        precCant[i][j]=scanner.nextDouble();
                    }
                }
            }
            else if (respuesta.toUpperCase().equals("FINALIZAR"))
                mensaje=false;
            else if (respuesta.toUpperCase().equals("BUSCAR")){
                System.out.println("Ingrese el nombre del producto: ");
                nombreAct=scanner.next();
                for (int i = 0; i < limProd; i++){
                    if (nombreAct.toUpperCase().equals(nomProd[i].toUpperCase())) {
                        System.out.println("Desea actualizar las existencias o eliminar este producto? (Actualizar/Eliminar)");
                        respuesta = scanner.next();
                        if (respuesta.toUpperCase().equals("ACTUALIZAR"))
                            precCant[i][1]=scanner.nextDouble();
                        if (respuesta.toUpperCase().equals("ELIMINAR")){
                            for (i = i; i < limProd; i++){ 
                                nomProd[i]=nomProd[i+1];
                                for (int j = 0; j < limDatos; j++){
                                    precCant[i][j]=precCant[i+1][j]; 
                                }
                            }
                            limProd=limProd-1;
                        }
                    }
                }
            }
            if (mensaje)
                for (int k = 0; k < 1; k++){
                    System.out.println("Lista de productos: ");
                    System.out.println("Producto /  Precio  /  Cantidad  ");
                        for (int i = 0; i < limProd; i++){
                            System.out.print(nomProd[i]+"\t");
                            for (int j = 0; j < limDatos; j++) 
                                System.out.printf("/ %.2f \t", precCant[i][j]);
                        System.out.println("");
                        }
                }
        }while (mensaje);
    }
}
/*
Lista de productos: 
Producto /  Precio  /  Cantidad  
Mantequilla	/ 6.00 	/ 7.00 	
Arroz	/ 7.00 	/ 9.00 	
Desea agregar productos o buscar producto? (Agregar/Buscar/Finalizar)
Buscar
Ingrese el nombre del producto: 
Mantequilla
Desea actualizar las existencias o eliminar este producto? (Actualizar/Eliminar)
Eliminar
Lista de productos: 
Producto /  Precio  /  Cantidad  
Arroz	/ 7.00 	/ 9.00 	
Desea agregar productos o buscar producto? (Agregar/Buscar/Finalizar)
Finalizar
*/