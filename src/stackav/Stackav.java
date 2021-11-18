
package stackav;

import java.util.Scanner;

public class Stackav {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op,qtd=0;
        Queue filasenha;
        filasenha = new Queue();
        
        do{
            System.out.println("Ola!");
            System.out.println("O que deseja fazer?");
            System.out.println("1- RETIRAR NOVA SENHA.");
            System.out.println("2-ATENDER PROXIMA SENHA.");
            System.out.println("0-ENCERRAR PROGRAMA");
            op = in.nextInt();
            
            switch(op){
                case 1:
                    qtd++;
                    novasenha(filasenha,qtd);
                    break;
                case 2:
                    qtd--;
                    atendimento(filasenha);
                    break;
            }
           
        } while(op != 0);
  
    }
    
    
    public static void novasenha(Queue filasenha,int numerosenha){
        
        
        if(filasenha.isFull()== false){
        System.out.println("RETIRANDO SENHA...");
        
        filasenha.enqueue(numerosenha);
        
        System.out.println("Sua senha é: " + numerosenha);
        System.out.println("(Máximo de senhas: 15)");
        
        } else {
            
            System.out.println("Fila de espera se encontra cheia.");
            System.out.println("Tente novamente mais tarde.");
            
        }
        
        
    }
    
    public static void atendimento(Queue filasenha){
        
        if(filasenha.isEmpty() == true){
            
            System.out.println("Fila de espera se encontra vazia.");
            
        } else {
            
            System.out.println("CHAMANDO PRÓXIMA SENHA.");
            System.out.println("SENHA: " + filasenha.head());
            
            filasenha.dequeue();
        }
        
    }
    
    
}
