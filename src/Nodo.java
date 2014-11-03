
public class Nodo {
	
	public String dato;
	Nodo siguiente, anterior;
	
	public Nodo(String el, Nodo s, Nodo a){
		dato = el;
		siguiente = s;
		anterior = a;
	}
	
	public Nodo(String el){
		this(el,null,null);
	}

}
