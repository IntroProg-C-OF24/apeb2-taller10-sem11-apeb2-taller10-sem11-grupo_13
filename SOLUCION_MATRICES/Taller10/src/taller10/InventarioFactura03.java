package taller10;
import java.util.Scanner;
public class InventarioFactura03 {
    public static void main(String[] args) {
        int limProd= 0, limDatos=2, a=0, numeroProductos;
        String [] codigoProducto= new String [28];
        String nomProd[]=new String [28];
        int codigoFac[]=new int [28], CantidadProd[]=new int [28];
        boolean mensaje=(true), encontrado;
        double precCant[][]=new double [28][28],sumatoria=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos productos desea agregar?");
        limProd=scanner.nextInt();
            for (int i = 0; i < limProd; i++){
                System.out.println("Ingrese el nombre del producto: ");
                nomProd[i]=scanner.next();
                codigoProducto[i] = String.format("%05d", (int) (Math.random() * (99999 - 0 + 1) + 0));
                System.out.println("Ingrese precio y cantidad: ");
                for (int j = 0; j < limDatos; j++){
                    precCant[i][j]=scanner.nextDouble();
                }
            }
            String respuesta = "Ver";
        do{
            if (respuesta.toUpperCase().equals("VER"))
                for (int k = 0; k < 1; k++){
                    System.out.println("Lista de productos: ");
                    System.out.println("Codigo  /  Producto /  Precio  /  Cantidad  ");
                        for (int i = 0; i < limProd; i++){
                            System.out.print(codigoProducto[i]+" / "+nomProd[i]+"\t");
                            for (int j = 0; j < limDatos; j++) 
                                System.out.printf("/%.2f \t", precCant[i][j]);
                        System.out.println("");
                        }
                }
            if (mensaje){
                System.out.println("Desea ver la lista o generar una factura? (Ver/Factura/Terminar)");
                respuesta = scanner.next();
                if (respuesta.toUpperCase().equals("FACTURA")){
                    System.out.println("Ingrese el codigo del producto:");
                    String codigo=scanner.next();
                    int i=0;
                    encontrado=(true);
                    while (encontrado){
                            if (codigo.equals(codigoProducto[i])){
                                encontrado=false;
                                if (precCant[i][1]!=0) {
                                    System.out.println("Ingrese el numero de productos:");
                                    numeroProductos=scanner.nextInt();
                                    if (numeroProductos<=precCant[i][1]){
                                        precCant[i][1]=precCant[i][1]-numeroProductos;
                                        codigoFac[a]=i;
                                        CantidadProd[a]=numeroProductos;
                                        sumatoria=sumatoria+((precCant[i][0])*numeroProductos);
                                        a++;
                                    }else
                                        System.out.println("El pedido ["+numeroProductos+"] es mayor a las existencias ["+precCant[i][1]+"].");
                                }else
                                    System.out.println("No quedan existencias");
                            }else
                                i++;
                    }
                }
                else if (respuesta.toUpperCase().equals("TERMINAR"))
                    mensaje=false;
            }
        }while (mensaje);
        System.out.println("Factura:");
        System.out.println("Codigo  /  Producto /  Precio  /  Cantidad / Total");
        for (int k = 0; k < a; k++){
            System.out.println(codigoProducto[codigoFac[k]]+"  / "+nomProd[codigoFac[k]]+"  / "+(precCant[codigoFac[k]][0])+"  / "+CantidadProd[k]+"  / "+((precCant[codigoFac[k]][0])*CantidadProd[k]));
        }
        System.out.println("Total: "+sumatoria);
        if (sumatoria>100){
            System.out.println("Descuento 20%: "+(sumatoria*0.2));
            sumatoria=sumatoria-(sumatoria*0.2);
        }else
            System.out.println("Descuento 20%: - ");
        System.out.println("Subtotal con decuento: "+sumatoria);
        System.out.println("%IVA [12%]: "+(sumatoria*0.12));
        System.out.println("Total a pagar: "+(sumatoria+(sumatoria*0.12)));
    }
}
/*
Lista de productos: 
Codigo  /  Producto /  Precio  /  Cantidad  
79701 / Azucar	/6.00 	/9.00 	
79437 / Manjar	/60.00 	/6.00 	
91287 / Tomates	/70.00 	/4.00 	
Desea ver la lista o generar una factura? (Ver/Factura/Terminar)
Factura
Ingrese el codigo del producto:
91287
Ingrese el numero de productos:
4
Desea ver la lista o generar una factura? (Ver/Factura/Terminar)
Terminar
Factura:
Codigo  /  Producto /  Precio  /  Cantidad / Total
91287  / Tomates  / 70.0  / 4  / 280.0
Total: 280.0
Descuento 20%: 56.0
Subtotal con decuento: 224.0
%IVA [12%]: 26.88
Total a pagar: 250.88
*/