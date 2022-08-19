/**
 * 
 */
package br.com.rcidrao.pilha;

/**
 * @author Rômulo
 *
 */
public class Pilha {
	
	public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;

        this.pilha = new Object[1000];

    }

    public boolean pilhaVazia() {
        //Empty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //Size
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //Top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //Pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // Push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String args[]) {
        Pilha r = new Pilha();
        r.empilhar(1);
        r.empilhar(3);
        r.empilhar(5);
        r.empilhar(7);
        r.empilhar(32);
                while (r.pilhaVazia() == false) {
            System.out.println(r.desempilhar());
        }
    }
}


//Complexidades assintóticas de tempo e espaço
//espaço: o(5)
//método push - tempo: o(1)
//método pop - tempo: o(1)
