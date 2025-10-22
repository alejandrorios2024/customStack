//contrato--> para implementar los metodos que estan en la interfaz
public interface MyStack<T> {

    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    void clear(); //para quitar todos los elementos (limpiar)
    void Imprimir();
}
