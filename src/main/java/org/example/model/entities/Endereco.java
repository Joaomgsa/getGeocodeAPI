package org.example.model.entities;

public class Endereco {



    public String logradouro;
    public String bairro;
    public String cidade;
    public String numero;
    public String pais;

    public Endereco() {
    }

    public Endereco(String logradouro, String bairro, String cidade, String numero, String pais) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.pais = pais;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro="+ bairro+ ", cidade="+ cidade + ", numero="+ numero +
                ", pais=" + pais +'}';
    }
}
