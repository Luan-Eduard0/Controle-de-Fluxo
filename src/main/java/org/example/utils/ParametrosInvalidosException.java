package org.example.utils;

public class ParametrosInvalidosException extends Exception {
    //exception
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
