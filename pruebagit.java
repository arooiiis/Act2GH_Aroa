import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        int CANTIDAD =20;
        
        int INICIOINTERVALO = 1;
        
        int FINALINTERVALO = 10;
        
        
        int [] elementos = new int [CANTIDAD];
        
        for (int i = 0; i < CANTIDAD; i++) {
        	
        	elementos [i] = (int)(Math.random()*(FINALINTERVALO - INICIOINTERVALO +1)) + INICIOINTERVALO;
        	
        }
        for (int i = 0; i < CANTIDAD; i++) {
        System.out.println(elementos[i]);
        }
      }
    }