
package stackav;

public class LDENode {
       
    private Integer info;
    private LDENode prox;
    private LDENode ante;
   
    public LDENode (Integer value) {
        this.info = value;
    }
    
    public void setInfo (Integer value) {
        this.info = value;
    }
    
    public Integer getInfo() {
        return this.info;
    }
    
    public void setProx (LDENode novoProx) {
        this.prox = novoProx;
    }
    
    public LDENode getProx () {
        return this.prox;
        
    }
    
    public void setAnte (LDENode novoAnte) {
        this.prox = novoAnte;
    }
    
    public LDENode getAnte () {
        return this.ante;
        
    }
}
