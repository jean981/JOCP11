package com.certification.variables;

public class variablesApp {
    public static void main(String[] args) {

        variableAppModel variavel = new variableAppModel();
        variavel.setId(10);
        variavel.setNome("Paulo");
        variavel.setDoc("Nota");

        System.out.println("Variaveis carregadas com sucesso!");
        System.out.println(variavel.toString());
    }
}
