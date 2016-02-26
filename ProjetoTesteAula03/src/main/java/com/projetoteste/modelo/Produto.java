/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetoteste.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author marcel.borges
 */
@Entity(name = "PRODUTO")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @NotNull
    @Column(name = "NOME")
    private String nome;
    
    @NotNull
    @Column(name = "VALOR", precision = 2)
    private float valor;
    
    public Produto() {
    }

    public Produto(long id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
