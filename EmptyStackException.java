

/**
 * Clase EmptyStackException utilizada por clases que implementen la interface Stack.
 * @author 
 *
 */
public class EmptyStackException extends Exception{
	/**
	 * Constructor
	 * @param msg Mensaje del error.
	 */
	public EmptyStackException(String msg) {
		super(msg);
	}
}
