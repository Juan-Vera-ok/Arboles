import java.util.*;
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
    
    public int actual() 
    {
    	Nodo a;
    	a=(Nodo)pila.pop();
    	pila.push(a);
    	return a.getInfo();
    }
    
    
    public int siguiente()
    {
    	if(siguiente!=null) 
    	{
    		pila.push(siguiente);
    		siguiente=siguiente.getIzquierda();
    	}
    	if(tieneSiguiente()) {
    	siguiente=(Nodo)pila.pop();
    	this.siguiente=this.siguiente.getIzquierda();
    	}
    	return siguiente.getInfo();
    }
    
    boolean tieneSiguiente() 
    {
    	if(pila.isEmpty()) 
    	{
    		return false;
    	}else 
    	{
    		return true;
    	}
    	
    }
    
    

}

