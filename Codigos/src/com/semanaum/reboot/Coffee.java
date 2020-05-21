package com.semanaum.reboot;

public class Coffee {

    private boolean chaleiraLigada;

    Coffee(boolean chaleiraLigada) {
        this.chaleiraLigada = chaleiraLigada;
    }

    protected String fazerCafe(int colheresCafe, double litrosAgua) {
        if (!chaleiraLigada) {
            return "Adicionar " + colheresCafe + " colheres de café, mais "
                    + litrosAgua + "l de água e ligar chaleira.";
        } else
            return "Café já está sendo feito.";
    }
}
