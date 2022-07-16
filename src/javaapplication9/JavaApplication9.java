
package javaapplication9;
import java.util.Scanner;

/**
 *
 * @author zeron
 */
public class JavaApplication9 {

   
    public static void main(String[] args) {
        
        String cadena; 
        char c1, c2, operador;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        cadena = sc.nextLine();
        
        c1 = cadena.charAt(0);
        c2 = cadena.charAt(2);
        operador = cadena.charAt(1);
        
        int num1 = Character.getNumericValue(c1);
        int num2 = Character.getNumericValue(c2);
        
        if(operador == '-'){
            resultado = num1 - num2;
            System.out.println("el resultado de la operacion es: " +resultado);
        }
           
        if (operador == '+'){
            resultado = num1 + num2;
            System.out.println("el resultado de la operacion es: " +resultado);
        }
           
        if(operador == '*'){
            resultado = num1 * num2; 
            System.out.println("el resultado de la operacion es: " +resultado);
        }
            
        if(operador == '/'){
            resultado = num1 / num2;
            System.out.println("el resultado de la operacion es: " +resultado);
        }
        
    }
}                    
        
           
    