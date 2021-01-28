
public class ArbolBinario 
{
	Nodo raiz;
	
	Nodo getRaiz() 
	{return this.raiz;}
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
	Nodo p = this.raiz;
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
	
	int Mayor ( Nodo P)
	{
		int Mayor=P.getInfo();
		do
		{
			Mayor=P.getInfo();
			P=P.getDerecha();
		}
		while(P!=null);
	return Mayor;
	}
	
	int sumaPares(Nodo P)
	{
		int suma=P.getInfo();
		if(P.getDerecha()==null && P.getIzquierda()==null) 
		{
			System.out.println(P.getInfo()+"es par");
			return suma;
		}else{
		if(P.getInfo()%2==0) 
		{
			suma+=sumaPares(P.getIzquierda());
			suma+=sumaPares(P.getDerecha());
		}System.out.println(P.getInfo()+"es par");
		}
		return suma;
	}
	
	
	
	boolean estaVacio() 
	{
		boolean bandera=true;
		if(raiz==null) 
		{bandera=false;}
		return bandera;
	}
	
	IteradorArbol getIteradorArbol()
	{
		return new IteradorArbol(this.raiz);
	}
	
	
	

}

