package br.univille.dacs2022.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length = 1000)
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

}
