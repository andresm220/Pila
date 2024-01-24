public class CustomStack<T> implements ICustom<T> {
    protected Node<T> lastNode;
    protected Node<T> firstNode;

    @Override
    public void push(T value) {
        // Insertar
        if(lastNode==null){
            lastNode= new Node<T>(value);
            firstNode=lastNode;
            }else{
            Node<T> current = new Node<T> (value);
            current.setNext(firstNode);
            firstNode=current;
            }
    }

    @Override
    public T pop() {
        // Eliminar
        if (firstNode!= null){
            if(firstNode.equals(lastNode)){
               T value=lastNode.getValue();
               lastNode=null;
               firstNode=null;
                return value;
        
        
            }else{
                T valuef=firstNode.getValue();
                firstNode=firstNode.getNext();
        
                return valuef;
        
        
            }
            
    
        }else{
            return null;
        }

    }

    /*Metodo implemetado por el otro equipo Jose Ruiz, Alexander Chanchavac, Gerardo Fernandez*/
    /**
     * Obtiene el tamaño actual de la pila.
     * 
     * @return El tamaño de la pila.
     */
    public int size() {
        int count = 0;
        Node<T> current = firstNode;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    /**
     * Extrae y devuelve el elemento superior de la pila como una cadena.
     * 
     * @return El elemento superior de la pila como cadena, o null si la pila está vacía.
     */
    public String popAsString() {
        T value = pop();
        return value != null ? String.valueOf(value) : null;
    }

}




   