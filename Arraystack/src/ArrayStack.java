import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() { //constructor 1 este invoca al constructor 2 pasandole un 10
        this(10);
    }

    public ArrayStack(int initialCapacity){//constructor 2, inicializa el arreglo
        this.data = new Object[initialCapacity];
    }

    @Override
    public void push(T value) {
        //top vale 0
        this.data[top++] = value;
        //top vale su valor mas 1 (0+1)
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("no hay elementos en la stack");
            return null;
        }
        T value = (T) data[--top]; //se tiene que castear para que no marque error
        //estamos obteniendo el ultimo elemento de la stack
        data[top] = null;
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia no puedes obtener un elemento");
            return null;
        }
        return(T) data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
    //cuando el arreglo este lleno y queramos
    //poner mas capacidad
    public void addCapacity(){
        if (top == data.length) {//si el arreglo esta lleno vamos a aumentar la capacidad
            int newCap = data.length * 2;
            //vamos a crear un nuevo arreglo y pasarle los datos que estan actualmente al nuevo
            data = Arrays.copyOf(data, newCap); //pero tendra el doble del tamaño del original
        }
    }

    @SuppressWarnings("override")
    public void Imprimir() {
    if (isEmpty()) {
        System.out.println("la pila esta vacia");
        return;
    }

    System.out.println("elementos en la pila:");
    for (int i = top - 1; i >= 0; i--) { // del tope hacia abajo
        System.out.println(data[i]);
    }
    }   
}
