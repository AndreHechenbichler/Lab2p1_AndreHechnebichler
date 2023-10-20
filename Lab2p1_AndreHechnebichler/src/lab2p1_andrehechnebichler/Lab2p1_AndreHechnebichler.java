/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_andrehechnebichler;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Lab2p1_AndreHechnebichler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int optionn;
        System.out.println("Inserte 1 para Dibujando triángulos");
        System.out.println("Inserte 2 para Área de figuras");
        System.out.println("Inserte 3 para Evaluando números");
        System.out.println("Inserte 4 para salir");
        optionn=leer.nextInt();
        while(optionn>0&&optionn<4&&optionn!=4){
            if(optionn==1){
                System.out.println("Ingrese los 3 lados del triangulo");
                System.out.println("Lado a");
                int num1=leer.nextInt();
                System.out.println("Lado b");
                int num2=leer.nextInt();
                System.out.println("Lado c");
                int num3=leer.nextInt();
                int mayor=num1;
                    if(mayor<num2){
                        mayor=num2;
                    }
                    if(mayor<num3){
                        mayor=num3;
                    }    
                if(num1<=0||num2<=0||num3<=0){
                    System.out.println("No ingrese numeros negativos");
                }
                else
                    if(num1+num2<mayor||num2+num3<mayor||num1+num3<mayor){
                        System.out.println("Las longitudes ingresadas no forman un triángulo.");
                }
                else
                    System.out.println("Las longitudes ingresadas forman un triángulo.");
            }
            if(optionn==2){
                System.out.println("Elija su figura para calcular area");
                System.out.println("1 para rectangulo");
                System.out.println("2 para triangulo");
                System.out.println("3 para circulo");
                int forma=leer.nextInt();
                if(forma==1){
                    System.out.println("base del rectangulo");
                    int base=leer.nextInt();
                    System.out.println("altura del rectangulo");
                    int altura=leer.nextInt();
                    double area=base*altura;
                    System.out.println("su area es de "+area+ "cm");
                }
                if(forma==2){
                    System.out.println("base del triangulo");
                    int base=leer.nextInt();
                    System.out.println("altura del triangulo");
                    int altura=leer.nextInt();
                    double area=0.5*base*altura;
                    System.out.println("su area es de "+area+ "cm");
                }
                if(forma==3){
                    System.out.println("radio del circulo");
                    int radio=leer.nextInt();
                    double area=radio*radio*3.1416;
                    System.out.println("su area es de "+area+ "cm");
                }
                if(forma>3){
                    System.out.println("esa no es una opcion");
                }
            }
            if(optionn==3){
                System.out.println("Ingrese su numero");
                int numero=leer.nextInt();
                if(numero%2==0){
                    System.out.println("su numero es par");
                }
                if(numero%2!=0){
                System.out.println("su numero es impar");
                }
                int divisor=1;
                int resuelto;
                int cont_prim=0;
                while(divisor<=numero){
                    resuelto=numero%divisor;
                    divisor=divisor+1;
                    if(resuelto==0){
                        cont_prim=cont_prim+1;
                    }
                }
                System.out.println(""+cont_prim);
                if(cont_prim==2){
                        System.out.println("su numero es primo");
                    }
                    else{
                        System.out.println("su numero no es primo");
                }
            }
            if(optionn==4){
                System.out.println("adios");
            }
            System.out.println("Inserte 1 para Dibujando triángulos");
            System.out.println("Inserte 2 para Área de figuras");
            System.out.println("Inserte 3 para Evaluando números");
            System.out.println("Inserte 4 para salir");
            optionn=leer.nextInt();
        }
    }
}