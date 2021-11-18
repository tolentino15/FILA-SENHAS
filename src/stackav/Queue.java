
package stackav;

public class Queue {
    private LDENode inicio;
    private LDENode fim;
    private int limite;
    private int qtd;
    
    public Queue(){
    this.limite = 15;
    }
    
    public boolean isEmpty() {                      // VERIFICA LISTA VAZIA
        
        if (this.fim == null) {
            return true;
        } else {
            return false;
        }
    } 
    
     public boolean isFull(){
         if(qtd == limite){
        return true;
        } else {
        return false;
        }
    }
     
     public Integer head(){
         return this.inicio.getInfo();
     }
     
     public void enqueue(Integer valor){
         LDENode novo = new LDENode(valor);
         
         if(this.isEmpty() == true){
            inicio = novo; 
            fim = novo;
        } else {
            novo.setAnte(this.fim);
            this.fim.setProx(novo);
            this.fim = novo;
        }
         qtd++;
     }
     
     public Integer dequeue(){
         Integer valor;
         
         if(this.qtd != 1){
         valor = inicio.getInfo();
         this.inicio = inicio.getProx();
         qtd--;
         return valor;
         } else {
             valor = inicio.getInfo();
             this.inicio = null;
             this.fim = null;
             qtd = 0;
             return valor;
         } 
     }
     
    
}
