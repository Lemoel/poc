package com.example.poc.listaencadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class No<T> {

    private T value;
    private No<T> next;

    public No(T value) {
        this.value = value;
        this.next = null;
    }

    public No(T value, No<T> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + value +
                ", proximo=" + next +
                '}';
    }
}
