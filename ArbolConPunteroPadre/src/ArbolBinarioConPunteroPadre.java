
public class ArbolBinarioConPunteroPadre 
{

public class ArbolBinario
{
	NodoConPunteroPadre raiz;
	
	
	void setRaiz(NodoConPunteroPadre p) 
	{this.raiz=p;}
	
	void insertar (int valor)
	{
		NodoConPunteroPadre Nuevo, P, Ant;
	Nuevo = new NodoConPunteroPadre(valor); 
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
		if (Ant.getInfo() > valor) {
		Ant.setIzquierda(Nuevo); 
		Nuevo.setPadre(Ant);
		}else { 
			Ant.setDerecha(Nuevo);
			Nuevo.setPadre(Ant);
		}
		
	}
	
	void eliminar(int valor)
	{
		NodoConPunteroPadre p = raiz;
		NodoConPunteroPadre t = null;
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
	if (t.getIzquierda() == p) {
		p.getUnicoHijo().setPadre(p.getPadre());
	t.setIzquierda(p.getUnicoHijo());
	}else {
		p.getUnicoHijo().setPadre(p.getPadre());
	t.setDerecha(p.getUnicoHijo()); 
	}else 
	{
		NodoConPunteroPadre q = p.buscaMenor(p); 
	p.setInfo(q.getInfo()); 
	t = p; 
	p = p.getIzquierda(); 
	while (p != q)
	{
	t = p;
	p = p.getDerecha(); 
	}
	if (q==t.getIzquierda()) {

		q.getIzquierda().setPadre(q.getPadre());
	t.setIzquierda(q.getIzquierda()); 
	
	}else
	if (q.tieneUnHijo()) {

		q.getUnicoHijo().setPadre(q.getPadre());
	t.setDerecha(q.getUnicoHijo()); 
	}else
	t.setDerecha(null); 
	}
	}
	
	void inorden ( NodoConPunteroPadre P)
	{
	if (P != null) // caso base
	{ // caso general
	inorden (P.getIzquierda());
	System.out.println(P.getInfo());
	inorden (P.getDerecha());
	}
	}

	}
}
