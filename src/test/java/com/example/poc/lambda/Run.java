package com.example.poc.lambda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Run {

    //SAM - Single Abstract Method
    //Qualquer interface que tenha apenas um método abstrato.

    @Test
    public void testeLambda() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });

        new Thread(() -> System.out.println("Hello"));

    }

}
