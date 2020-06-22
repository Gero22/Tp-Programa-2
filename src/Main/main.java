package Main;

import ImplHeaps.ImplHeps;
import api.ColaConPrioridadTDA;

import api.HeapsTDAarr;
import ImplHeaps.ImplHepsArr;

public class main {




public static void main ( String [] args ) throws Exception {
	
	
	ImplHepsArr f = new ImplHepsArr();
	f.InicializarArbol(10);
	f.AgregarElem(9);
	f.AgregarElem(30);
	f.AgregarElem(25);
	f.AgregarElem(18);
	f.AgregarElem(12);
	f.AgregarElem(13);
	f.AgregarElem(104);
	
	f.EliminarElem();
	
	
		
	
	
System.out.println(f);
}

}