import java.util.*;
public class ArbolBinario 
{
	Nodo raiz;
	
	
	void setRaiz(Nodo p) 
	{this.raiz=p;}
	
	Nodo getRaiz() 
	{return this.raiz;}
	
	void insertar (int valor)
	{
	Nodo Nuevo, P, Ant;
	Nuevo = new Nodo(valor); 
	P = raiz; 
	Ant = null;
	while (P != null) 
	{Ant = P;
	if (P.getInfo() > valor)
		P = P.getIzquierda(); 
		else P = P.getDerecha(); 
		}
		if ( Ant == null) 
		raiz = Nuevo; 
		else
		if (Ant.getInfo() > valor)
		Ant.setIzquierda(Nuevo); 
		else Ant.setDerecha(Nuevo);
		
	}
	
	void eliminar(int valor)
	{
	Nodo p = raiz;
	Nodo t = null;
	while ( p.getInfo() != valor ) 
	{ t = p;
	if ( valor > p.getInfo() )
	p = p.getDerecha();
	else
	p = p.getIzquierda();
	}
	if ( p.esHoja() )
	if ( t == null ) raiz = null; 
	else if ( p == t.getIzquierda() )
	t.setIzquierda(null); 
	else t.setDerecha(null); 
	else if (p.tieneUnHijo()) 
	if (t.getIzquierda() == p)
	t.setIzquierda(p.getUnicoHijo()); 
	else
	t.setDerecha(p.getUnicoHijo()); 
	else 
	{
	Nodo q = p.buscaMenor(p); 
	p.setInfo(q.getInfo()); 
	t = p; 
	p = p.getIzquierda(); 
	while (p != q)
	{
	t = p;
	p = p.getDerecha(); 
	}
	if (q==t.getIzquierda())
	t.setIzquierda(q.getIzquierda()); 
	else
	if (q.tieneUnHijo())
	t.setDerecha(q.getUnicoHijo()); 
	else
	t.setDerecha(null); 
	}
	}
	
	
	IteradorArbol getIteradorArbol()
	{
		return new IteradorArbol(this.raiz);
	}
	
	
	void inorden ( Nodo P)
	{
	if (P != null) 
	{ 
	inorden (P.getIzquierda());
	System.out.println(P.getInfo());
	inorden (P.getDerecha());
	}
	}
	
	boolean metodoIzquierdaYDerecha ()
	{
		boolean bandera=false;
		Stack p=new Stack();
		Nodo t=this.raiz;
		int sumaIzquierda=0;
		int sumaDerecha=0;
		do 
		{
			while(t!=null) 
			{
				if(t.getIzquierda()!=null) 
				{
					sumaIzquierda=sumaIzquierda+1;
				}
				if(t.getDerecha()!=null) 
				{
					sumaDerecha=sumaDerecha+1;
				}
				p.push(t);
				t=t.getIzquierda();
			}
			if(!p.isEmpty()) 
			{
				t=(Nodo)p.pop();
				
				t=t.getDerecha();
			}
			
			
			
		}while(t!=null||!p.isEmpty());
		System.out.println("total izquierda "+sumaIzquierda);
		System.out.println("total derecha "+sumaDerecha);
		if(sumaIzquierda>sumaDerecha) 
		{
			bandera=true;
		}
		else {bandera=false;}
		
		return bandera;
	}
	
	
	
	
	
	
	
	
}