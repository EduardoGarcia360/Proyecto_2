
public class Lista {
	

	private Nodo inicio, fin;
	
	public Lista(){
		inicio=fin=null;
	}
	
	//Metodo para saber si la lista esta vacia
	public boolean Vacia(){
		return inicio == null;
	}
	
	//Agregar dato al final
	public void AgregarFinal(String el){
		if(!Vacia()){
			fin = new Nodo(el, null, fin);
			fin.anterior.siguiente = fin;
		}else{
			inicio=fin = new Nodo(el);
		}
	}
	
	//Agregar dato al inicio
	public void AgregarInicio(String el){
		if(!Vacia()){
			inicio = new Nodo(el, inicio, null);
			inicio.siguiente.anterior = inicio;
		}else{
			inicio=fin = new Nodo(el);
		}
	}
	
	//Mostrar datos de inicio a fin
	public void MostrarInicioFin(){
		if(!Vacia()){
			String mLista="";
			Nodo recorrer=inicio;
				while(recorrer!=null){
					mLista = mLista + "["+ recorrer.dato + "]<=>";
					recorrer = recorrer.siguiente;
				}
			System.out.println("||<=>" + mLista + "||");
		}
	}
	
	//Mostrar datos de fin a inicio
	public void MostrarFinInicio(){
		if(!Vacia()){
			String mLista="";
			Nodo recorrer=fin;
				while(recorrer!=null){
					mLista = mLista + "["+ recorrer.dato + "]<=>";
					recorrer = recorrer.anterior;
				}
			System.out.println("||<=>" + mLista + "||");
		}
	}
		
		//Buscar en la lista
		public boolean Buscar(String elemento){
			Nodo temporal = inicio;
			while(temporal!=null && temporal.dato!=elemento){
				temporal = temporal.siguiente;
			}
			return temporal!=null;
			
		}

}
