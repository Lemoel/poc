package com.example.poc.listaencadeada;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ListaEncadeadaTest {

	@Test
	void contextLoads() {}

	@Test
	void lista(){
		ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
		listaEncadeada.add(1);
		listaEncadeada.add(2);
		System.out.println(listaEncadeada);
		System.out.println(listaEncadeada.getTamanho());
	}

}
