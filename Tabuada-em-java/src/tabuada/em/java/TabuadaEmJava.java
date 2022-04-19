package tabuada.em.java;

import java.util.Scanner;

public class TabuadaEmJava {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	//exibe uma mensagem para o usuario
        System.out.println("Digite um valor");
        
        //o usuaio informa o valor que deseja fazer uma tabuada
        int valor = teclado.nextInt();
        
        /* o contador I vai de 1 ate 10  e toda vez que o laço 
        roda ele multiplica o I atual com o Valor que o usuario digitou */
        for(int i = 1; i <= 10; ++i ){
            System.out.println(valor + " X " +i+ " = "+valor*i);
        }
        
    }
    
}
