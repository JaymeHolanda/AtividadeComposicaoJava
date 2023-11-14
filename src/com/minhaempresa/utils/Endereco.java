package com.minhaempresa.utils;

public class Endereço {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;


    // Construtor
    public Endereço (String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep){

        this.rua = rua;
        this.numero= numero;
        this.complemento= complemento;
        this.bairro= bairro;
        this.cidade= cidade;
        this.estado= estado;
        this.cep= cep;

    }

    // Retorno

    public String toString(){
        return "Endereço" + rua
    }





    public String toString() {
        return "Endereço: " + rua + ", " + numero + (complemento.isEmpty() ? "" : " " + complemento) +
                ", " + bairro + ", " + cidade + " - " + estado + ", CEP: " + cep;
    }
}

