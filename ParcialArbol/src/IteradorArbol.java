import java.util.Stack;
public class IteradorArbol 
{
	private Nodo siguiente;
	private Stack pila = new Stack();

    public IteradorArbol(Nodo raiz) 
    {	
    	this.siguiente = raiz;
    
        if(siguiente == null) 
            return;        
    }
    
    public Nodo actual() 
    {
    	return this.siguiente;
    }
    
    
    public Nodo siguiente()
    {
    	Nodo ab=null;
    	if(siguiente!=null) 
    	{
    		pila.push(siguiente);
    		siguiente=siguiente.getIzquierda();
    	}
    	if(!pila.isEmpty()) {
    	siguiente=(Nodo)pila.pop();
    	ab=siguiente;
    	this.siguiente=this.siguiente.getDerecha();
    	}
    	return ab;
    }
    
    boolean tieneSiguiente() 
    {
    	if(this.pila.isEmpty()&&this.siguiente==null) 
    	{
    		return false;
    	}else 
    	{
    		return true;
    	}
    	
    }
    
    

}