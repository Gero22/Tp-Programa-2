package Main;




import api.HeapsTDAarr;

import java.util.Arrays;

import ImplHeaps.HeapSort;
import ImplHeaps.ImplHepsArr;

public class main {




public static void main ( String [] args ) throws Exception {
	System.out.println("Ejemplo Heap \n");
	// Ejemplo armado estructura heaps
	HeapsTDAarr f = new ImplHepsArr();
	f.InicializarArbol(10);
	f.AgregarElem(9);
	f.AgregarElem(30);
	f.AgregarElem(25);
	f.AgregarElem(18);
	f.AgregarElem(12);
	f.AgregarElem(13);
	f.AgregarElem(104);
	
	f.EliminarElem();
	System.out.println(f+"\n");
	System.out.println("Ejemplo HeapSort \n");
	
	// Ejemplo HeapSort
	 int arrA[] = {25,5, 8, 6, 1, 4, 7, 3, 9, 2, 0};

     System.out.println("Arreglo original: " + Arrays.toString(arrA));
     HeapSort heapSort = new HeapSort();
     heapSort.sort(arrA);

     System.out.println("Arreglo ordenando con Heap Sort: " + Arrays.toString(arrA));
		
	
	

}

}