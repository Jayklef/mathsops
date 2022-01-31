package com.jayklef.mathops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MathopsApplication {

    public static void main(String[] args) {
        double a = 50;
        double pow = Math.pow(12, 4);
        int maxim = Math.max(12, 145);
        double result = Math.sqrt(a);

        System.out.println(pow);
        System.out.println(maxim);
        System.out.println(result);
    }
}

