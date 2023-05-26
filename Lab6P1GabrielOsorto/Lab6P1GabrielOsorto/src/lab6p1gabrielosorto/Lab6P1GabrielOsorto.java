/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1gabrielosorto;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jahir Corrales
 */
public class Lab6P1GabrielOsorto {
 static Scanner sc=new Scanner(System.in);
     public static void main(String[] args) {
        int resp=1;
        while(resp<4){
            System.out.println("-----Menu-----");
            System.out.println("1. ¿Cuantos primos tienes?");
            System.out.println("2. Frecuencia de Letras");
            System.out.println("3.Salir");
            System.out.println("Ingrese su opcion");
            System.out.println("");
            int selec=sc.nextInt();
            switch(selec){
                case 1:
                    System.out.println("-----Cuantos primos tienes?");
                    System.out.print("Ingrese su tamaño:");
                    int tama=sc.nextInt();
                    while(tama<=1){//validacion 1
                        System.out.print("ingrese su tamaño (que sea mayor a 1):");
                        tama=sc.nextInt();
                    }//fin validacion 1
                    System.out.print("ingrese su limite inferior:");
                    int lim_infe=sc.nextInt();
                    System.out.print("ingrese su limite superior:");
                    int lim_sup=sc.nextInt();
                    while (lim_sup<=lim_infe){//validacion 2
                        System.out.println("Su limite superior tiene que ser mayor que su limite inferior");
                        System.out.print("ingrese su limite inferior:");
                        lim_infe=sc.nextInt();
                        System.out.print("Ingrese su limite superior:");
                        lim_sup=sc.nextInt();    
                    }//fin validacion 2
                    int []array=genRandArray(tama, lim_infe, lim_sup);
                    break;
                case 2:
                    System.out.println(" ala ");
                    
                    break;
                case 3:
                    System.out.println("Gracias por usar");
                    break;
                default:
                        System.out.println("opcion invalida");
            }//fin switch
        }//fin while

        
        
    }//fin  public static void
    
    public static int[] genRandArray(int tama,int limi_infe,int limi_sup){
        int[] array1= new int[tama];
        Random rand=new Random();
            for (int i=0;i<tama; i++) {//inicio for
                array1[i]=rand.nextInt(limi_sup-limi_infe)+limi_infe;  
               System.out.print(""+array1[i]);
            }//fin de for
    
        return  array1;
    
        }
    public static boolean isPrime(int contador){
        boolean lol=true;
        if((contador%contador==1)&&(contador%1==contador)){
        lol=true;
        } 
        else{
        lol=false;
            }
     return lol; 
    }
    public static int countPrimeFactors(int num){
        int contador=0;
        for (int i = 2; i <= num; i++) {
            
                if(isPrime(i) && num%i==0){
                    contador++;
                }
            
        }
     return contador;
    
}
    public static int [] getTotalPrimeCount(int[] array1){
        int[] array=new int[array1.length];
        int contbol=0;
        for (int i = 0; i <=array1.length; i++) {
         int cuenta = countPrimeFactors (array1[i]);
            array[i]=  cuenta;
        boolean retorno=isPrime(cuenta);
        if (retorno==true){
           contbol++; 
        }//fin if
        array1[i]=contbol;
        }//fin for
        
        return array1;
    }
}
