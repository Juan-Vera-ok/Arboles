
class Nodo {
	
	int info;
	Nodo izquierda, derecha;
	
	Nodo (int valor)
	{ info = valor;
	izquierda = null;
	derecha = null; }
	
	void setInfo(int valor)
	{ info = valor; }
	
	void setIzquierda(Nodo dir)
	{ izquierda = dir; }
	
	void setDerecha(Nodo dir)
	{ derecha = dir; }
	
	int getInfo()
	{ return info; }
	
	Nodo getIzquierda()
	{ return izquierda; }
	
	Nodo getDerecha()
	{ return derecha; }
	
	boolean esHoja() 
	{
	return (derecha == null && izquierda == null);
	}
	
	Nodo getUnicoHijo()
	{
	if ( derecha == null ) return izquierda;
	else return derecha;
	}
	
	boolean tieneUnHijo()
	{
	if (derecha == null && izquierda != null)
	return true;
	else if (derecha != null && izquierda == null)
	return true;
	else
	return false;
	}
	
	
	Nodo buscaMenor(Nodo p) 
	{
	Nodo aux = p.getIzquierda();  
	while ( aux.getDerecha() != null)
	aux = aux.getDerecha();  
	return aux;
	}
}