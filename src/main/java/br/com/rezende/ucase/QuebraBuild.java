package br.com.rezende.ucase;

import br.com.rezende.lib.Dependencia;

public class QuebraBuild {

    private static final Dependencia dependencia = new Dependencia();

    public static void main(String[] args) {
        dependencia.dependencia(); // Gera Warning
        dependencia.testeComMilestone(); //Gera Warning
        dependencia.testeComData(); // Erro compilação
        dependencia.testeComVersao(); // Erro compilação
    }
}
