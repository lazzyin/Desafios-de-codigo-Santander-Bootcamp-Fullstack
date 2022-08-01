/**
 * Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
package Desafios intermediarios java;
*/

import java.io.IOException;
import java.util.Scanner;

public class  idades {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double cont = 0;
       double soma = 0;
        double n = leitor.nextDouble();
        
        
        while (n >= 1){
            if (n >= 0) {
                soma+=n ;
                cont++;
            }
            n = leitor.nextInt();
        }
        double media =  soma/cont        ;
        System.out.println(String.format("%.2f", media    ));
    }
}

