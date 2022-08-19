/**
 * 
 */
package br.com.rcidrao.fila;


/**
 * @author R�mulo
 *
 */

public class Fila{
	private int[] arr;      // array para armazenar elementos da fila
    private int front;      // front aponta para o elemento front na fila
    private int rear;       // traseira aponta para o �ltimo elemento da fila
    private int capacity;   // capacidade m�xima da queue
    private int count;      // tamanho atual da queue
 
    Fila (int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
 
    // Fun��o utilit�ria para desenfileirar o elemento frontal
    public int dequeue()
    {
        // verifica o underflow da fila
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
 
        int x = arr[front];
 
        System.out.println("Removendo " + x);
 
        front = (front + 1) % capacity;
        count--;
 
        return x;
    }
 
    // Fun��o utilit�ria para adicionar um item � fila
    public void enqueue(int item)
    {
        // verifica se h� estouro de fila
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }
 
        System.out.println("Inserindo " + item);
 
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
 
    // Fun��o utilit�ria para retornar o elemento da frente da fila
    public int front()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }
 
    // Fun��o utilit�ria para retornar o tamanho da fila
    public int size() {
        return count;
    }
 
    // Fun��o utilit�ria para verificar se a fila est� vazia ou n�o
    public boolean isEmpty() {
        return (size() == 0);
    }
 
    // Fun��o utilit�ria para verificar se a fila est� cheia ou n�o
    public boolean isFull() {
        return (size() == capacity);
    }


    public static void main (String[] args)
    {
        // cria uma fila de capacidade 5
        Fila r = new Fila(5);
 
        r.enqueue(1);
        r.enqueue(2);
        r.enqueue(3);
 
        System.out.println("The front element is " + r.front());
        r.dequeue();
        System.out.println("The front element is " + r.front());
 
        System.out.println("The size is " + r.size());
 
        r.dequeue();
        r.dequeue();
 
        if (r.isEmpty()) {
            System.out.println("A fila est� vazia");
        }
        else {
            System.out.println("A fila n�o est� vazia");
        }
    }
}

//Complexidades assint�ticas de tempo e espa�o
//espa�o: o(5)
//m�todo enqueue - tempo: o(1)
//m�todo dequeue - tempo: o(1)
//m�todo rear - tempo: o(5)
//m�todo front - tempo: o(1)