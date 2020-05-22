package com.playground.tarefa;

class Cidades {

    private int codigo;
    private String descricao;
    private String uf;
    private int qntdEstudantes;

    Cidades(int codigo, String descricao, String uf, int qntdEstudantes) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
        this.qntdEstudantes = qntdEstudantes;
    }

    int getCodigo() {
        return codigo;
    }

    String getDescricao() {
        return descricao;
    }

    String getUf() {
        return uf;
    }

    String exibeDados() {
        return "A cidade " + descricao + ", do estado " + uf;
    }

    int getQntdEstudantes() {
        return qntdEstudantes;
    }

    void addNovoEstudante() {
    }
}