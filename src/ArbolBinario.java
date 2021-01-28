
public class ArbolBinario 
{
	Nodo raiz;
	
	
	void setRaiz(Nodo p) 
	{this.raiz=p;}
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
	
	void inorden ( Nodo P)
	{
	if (P != null) 
	{ 
	inorden (P.getIzquierda());
	System.out.println(P.getInfo());
	inorden (P.getDerecha());
	}
	}
	
	ArbolBinario unirArboles(Nodo raizArbol2) 
	{
		ArbolBinario nuevoArbol=new ArbolBinario();
		Nodo Nuevo, P, Ant;
		Nuevo = raizArbol2; 
		P = raiz; 
		Ant = null;
		nuevoArbol.setRaiz(P);
		while (P != null) 
		{Ant = P;
		if (P.getInfo() > raizArbol2.getInfo())
			P = P.getIzquierda(); 
			else P = P.getDerecha(); 
			}
			if ( Ant == null) 
			raiz = Nuevo; 
			else
			if (Ant.getInfo() > raizArbol2.getInfo()) {
				Ant.setIzquierda(Nuevo);
				System.out.println(Nuevo.getInfo()+" se inserta a la izquierda de "+ Ant.getInfo());
			}else{
				Ant.setDerecha(Nuevo);
				System.out.println(Nuevo.getInfo()+" se inserta a la derecha de "+ Ant.getInfo());
				
				
					
			}
			return nuevoArbol;
	}
	
	
	
	
}
