package org.example.utils;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
