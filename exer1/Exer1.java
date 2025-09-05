
package exer1;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int quantidade = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isLetter(palavra.charAt(i))) {
                quantidade++;
            }
        } 
        
        System.out.println("A palavra '" + palavra + "' possui " + quantidade + " letras.");

        scanner.close();
    }
    
}
