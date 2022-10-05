package br.univille.dacs2022.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProcedimentoRealizado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 1000)
    private String descricao;
    private Float calor;
    
    @ManyToOne
    private Procedimento procedimento;

    public Float getCalor() {
        return calor;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCalor(Float calor) {
        this.calor = calor;
    }

}
