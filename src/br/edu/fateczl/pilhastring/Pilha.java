package br.edu.fateczl.pilhastring;

public class Pilha {
	
	Node topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(String valor) {
		Node node = new Node();
		node.dado = valor;
		node.proximo = topo;
		topo = node;
	}
	
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		return topo.dado;
	}
	
	public int size() {
		int tamanho = 0;
		Node aux = topo;
		while (aux != null) {
			tamanho++;
			aux = aux.proximo;
		}
		return tamanho;
	}
}
