
package exer4;

import java.util.Scanner;


public class Exer4 {

   
    public static void main(String[] args) {
     Scanner leia;
     leia= new Scanner(System.in);
     
     float numero;
     float resultado;
     
        System.out.println("Digite um número");
        numero = Float.parseFloat(leia.nextLine());
        
        resultado = numero * numero; 
        System.out.println(resultado);
        
        
        
        
        
    }
    
}
