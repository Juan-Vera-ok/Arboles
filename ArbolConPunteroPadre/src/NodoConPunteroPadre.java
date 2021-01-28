
class NodoConPunteroPadre {
	
	int info;
	NodoConPunteroPadre izquierda, derecha,padre;
	
	NodoConPunteroPadre (int valor)
	{ info = valor;
	izquierda = null;
	derecha = null; 
	padre=null;}
	
	NodoConPunteroPadre getPadre() {
		return padre;
	}

	void setPadre(NodoConPunteroPadre padre) {
		this.padre = padre;
	}

	void setInfo(int valor)
	{ info = valor; }
	
	void setIzquierda(NodoConPunteroPadre dir)
	{ izquierda = dir; }
	
	void setDerecha(NodoConPunteroPadre dir)
	{ derecha = dir; }
	
	int getInfo()
	{ return info; }
	
	NodoConPunteroPadre getIzquierda()
	{ return izquierda; }
	
	NodoConPunteroPadre getDerecha()
	{ return derecha; }
	
	boolean esHoja() 
	{
	return (derecha == null && izquierda == null);
	}
	
	NodoConPunteroPadre getUnicoHijo()
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
	
	
	NodoConPunteroPadre buscaMenor(NodoConPunteroPadre p) 
	{
		NodoConPunteroPadre aux = p.getIzquierda();  
	while ( aux.getDerecha() != null)
	aux = aux.getDerecha();  
	return aux;
	}
	
	

}


