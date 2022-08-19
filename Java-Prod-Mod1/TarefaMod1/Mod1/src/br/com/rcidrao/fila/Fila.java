/**
 * 
 */
package br.com.rcidrao.fila;


/**
 * @author Rômulo
 *
 */

public class Fila{
	private int[] arr;      // array para armazenar elementos da fila
    private int front;      // front aponta para o elemento front na fila
    private int rear;       // traseira aponta para o último elemento da fila
    private int capacity;   // capacidade máxima da queue
    private int count;      // tamanho atual da queue
 
    Fila (int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
 
    // Função utilitária para desenfileirar o elemento frontal
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
 
    // Função utilitária para adicionar um item à fila
    public void enqueue(int item)
    {
        // verifica se há estouro de fila
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
 
    // Função utilitária para retornar o elemento da frente da fila
    public int front()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }
 
    // Função utilitária para retornar o tamanho da fila
    public int size() {
        return count;
    }
 
    // Função utilitária para verificar se a fila está vazia ou não
    public boolean isEmpty() {
        return (size() == 0);
    }
 
    // Função utilitária para verificar se a fila está cheia ou não
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
            System.out.println("A fila está vazia");
        }
        else {
            System.out.println("A fila não está vazia");
        }
    }
}

//Complexidades assintóticas de tempo e espaço
//espaço: o(5)
//método enqueue - tempo: o(1)
//método dequeue - tempo: o(1)
//método rear - tempo: o(5)
//método front - tempo: o(1)