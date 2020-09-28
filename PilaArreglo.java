

/**
 * Clase PilaArreglo.
 * @author 
 *
 * @param <E> Tipo generico.
 */
public class PilaArreglo<E> implements Stack<E>{

	protected int tamano;
	protected E[] datos;
	private int espacio;
	
	/**
	 * Construye una pila con un arreglo de 15 elementos.
	 */
	public PilaArreglo(){
		tamano=0;
		datos=(E[]) new Object[15];
		espacio=20;
	}
	
	@Override
	public int size(){
		return tamano;	
	}
	
	@Override
	public boolean isEmpty() {
		return tamano==0;
	}
	
	@Override
	public E top()throws EmptyStackException{
		E item=null;
		if (tamano==0) {
			throw new EmptyStackException("Pila vacia");
		}
		else {
			item=datos[tamano-1];
		}
		return item;
	}
	
	@Override
	public void push(E item) {
		if (tamano==this.espacio) {
			Redimensionar();
		}		
			datos[tamano]=item;
			tamano++;				
	}
	
	@Override
	public E pop() throws EmptyStackException {
		E aux=null;
		if (tamano==0) {
			throw new EmptyStackException("Pila Vacia");
		}
		else {
			aux=datos[tamano-1];
			datos[tamano-1]=null;
			tamano--;
		}
		return aux;
	}
	
	/**
	 * Redimensiona el arreglo con el doble de espacios.
	 */
	public void Redimensionar(){
		E[] aux=(E[]) new Object[espacio*2];
		for (int i=0; i<espacio;i++) {
			aux[i]=datos[i];	
		}
		datos=aux;		
		espacio=espacio*2;
	}
}
