package ImplHeaps;

import api.heapsTDA;

class Nodo {
	 int info;
	 heapsTDA hijoIzq;
	 heapsTDA hijoDer;
	 }



public class ImplHeps implements heapsTDA {
	
	Nodo raiz;
	
	
	 public void InicializarArbol() {
	 raiz = null;
}
	
	public int Raiz() {
		
		return raiz.info;
	}

	
	public heapsTDA HijoIzq() {
		
		return raiz.hijoIzq;
	}

	
	public heapsTDA HijoDer() {
		
		return raiz.hijoDer;

	}
	public boolean ArbolVacio() {
		
		return raiz == null;
	} 
	
	public void AgregarElem(int x) {
		if (raiz == null) { // Caso arbol vaco
		 raiz = new Nodo();
		 raiz.info = x;
		 raiz.hijoIzq = new ImplHeps();
		 raiz.hijoIzq.InicializarArbol();
		 raiz.hijoDer = new ImplHeps();
		 raiz.hijoDer.InicializarArbol();
		 
		 }
		 else if (raiz.info > x) { // Caso arbol izquierdo
		 raiz.hijoIzq.AgregarElem(x);
		 }
		 else if (raiz.info < x) {
				 						// Caso arbol derecho
		 raiz.hijoDer.AgregarElem(x);
		 }
		 }
	
	private int mayor(heapsTDA a) {
	 if (a.HijoDer().ArbolVacio()) {
	 return a.Raiz(); // Llegamos
	 } else {
	 return mayor(a.HijoDer()); // No llegamos todava
	 }
	 
	 }
	 private int menor(heapsTDA a) {
	 if (a.HijoIzq().ArbolVacio()) {
	 return a.Raiz(); // Llegamos
	 } else {
	 return menor(a.HijoIzq()); // No llegamos todava
	 }
	 }
	 public String to_string_helper(int idx){
	      String str = new String();
	      if (raiz == null) {
	    	  return str;
	      }
	     str += "(" + idx + ")" + raiz.info;
	     str += raiz.hijoIzq.to_string_helper(2*idx);
	     str += raiz.hijoDer.to_string_helper(2*idx+1);
	     return str;

	}	 
	 public String toString() {
		 	
	 return to_string_helper(1);

			
			}
	 
	

	
	public void EliminarElem(int x) {
	 
	
			
		

	}
}


