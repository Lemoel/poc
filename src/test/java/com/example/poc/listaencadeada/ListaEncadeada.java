package com.example.poc.listaencadeada;

public class ListaEncadeada<T> {

    private No<T> first;
    private int tamanho = 0;

    public void add(T value) {
        No<T> celula = new No<>(value);
        celula.setNext(first);
        this.first = celula;
        this.tamanho++;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + first +
                '}';
    }

    public int getTamanho() {
        return tamanho;
    }
}
