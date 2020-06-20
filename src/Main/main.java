package Main;

import ImplHeaps.ImplHeps;
import api.ColaConPrioridadTDA;
import api.heapsTDA;


public class main {




public static void main ( String [] args ) {
	
	 heapsTDA a = new ImplHeps();
	a.InicializarArbol();
	a.AgregarElem(20);
	a.AgregarElem(10);
	a.AgregarElem(5);
	a.AgregarElem(6);
	a.AgregarElem(7);
	a.AgregarElem(12);
	a.AgregarElem(13);
	
	
System.out.println(a);
}

}