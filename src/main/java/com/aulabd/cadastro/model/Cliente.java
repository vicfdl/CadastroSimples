package com.aulabd.cadastro.model;


//POJO - Plain Old Java Object
public class Cliente {

    private int id;
    private String nome, email;

    //Sobrecarga
    //Tela de Cadastro
    public Cliente(){

    }

    //Aula que vem - Atualização
    public Cliente(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    //Para inserir o registro
    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
