package Main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
    int opcion;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("MENU");
        
        System.out.println("1. Tabla de multiplicar.");
        System.out.println("2. Ecuacion cuadratica.");
        
        System.out.println("Ingrese el programa que desea ejecutar:");
        
        opcion = leer.nextInt();   
        
        switch(opcion){
            
            case 1:
                
                int x = 0;
            
                System.out.println("Ingrese el numero de la tabla que quiere saber:");
                x = leer.nextInt();
                
                System.out.println("La tabla de multiplicar del " + x + " es:");
                
                for(int i = 0; i <= 10; i++) {
                    
                    System.out.println(x + " x " + i + " = " + x*i);
                    
                }
                
                break;
                
            case 2:
                
                double a = 0;
                double b = 0;
                double c = 0;
                double d = 0;
                double e = 0;
                
                while(a == 0){
                    
                    System.out.println("Ingrese el primer coeficiente:");
                    a = leer.nextFloat();
                
                }

                System.out.println("Ingrese el segundo coeficiente:");
                b = leer.nextFloat();
                
                System.out.println("Ingrese el tercer coeficiente:");
                c = leer.nextFloat();
                
                if(4*a*c <= Math.pow(b,b)){
                    
                    d = -b + Math.sqrt(Math.pow(b,b) - 4*a*c)/(2*a);
                    e = -b - Math.sqrt(Math.pow(b,b) - 4*a*c)/(2*a);
                    
                    System.out.println("La primera solucion es: " + d);
                    System.out.println("La segunda solucion es: " + e);
                    
                } else {
                    
                    System.out.println("No se puede realizar la raiz negativa.");
                    
                }
                
                break;
            
            default:
                
                System.out.println("Numero invalido.");
        
        }
        
        System.gc();
        
    }
    
}