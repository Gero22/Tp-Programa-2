package ImplHeaps;


public class HeapSort {
	
    public void sort(int arrA[]) {
        int tam = arrA.length; // Tamaño del arreglo.
        int posPadre = (tam / 2) - 1; // Pos del ultimo padre.

        // Para construir un monticulo.
        for(int i = posPadre; i >= 0; i--) 
            heapify(arrA, tam, i);

        // Uno por una saco el maximo elemento del arreglo del heap y
        // lo reemplazo con el ultimo elemento del arreglo.
        for (int i=tam-1; i>=0; i--) {

            //arrA[0] es la raiz del heap y el maximo elemento en el arreglo.
            int x = arrA[0];
            arrA[0] = arrA[i];
            arrA[i] = x;

            heapify(arrA, i, 0);
        }
    }

    void heapify(int arrA[], int tamHeap, int i) {
        int mayor = i; // Inicializar mayor como root.
        int posIzq  = 2*i + 1; // Posicion del hijo izquierdo.
        int posDer  = 2*i + 2; // Posicion del hijo derecho.

        // Si el hijo izquiero es mas grande que la raiz.
        if (posIzq  < tamHeap && arrA[posIzq ] > arrA[mayor])
            mayor = posIzq ;

        // Si el hijo derecho es mas grande del elemento mayor hasta el momento.
        if (posDer  < tamHeap && arrA[posDer ] > arrA[mayor])
            mayor = posDer ;

        // Si mayor no es la raiz.
        if(mayor != i) {
            int aux = arrA[i];
            arrA[i] = arrA[mayor];
            arrA[mayor] = aux;

            // Llama recursiva para el sub-arbol.
            heapify(arrA, tamHeap, mayor);
        }
    }
   

}
