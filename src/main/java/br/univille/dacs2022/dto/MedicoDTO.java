package br.univille.dacs2022.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class MedicoDTO {

    private long id;
    @NotBlank(message = "É necessário o campo nome")
    @Column(length = 500)


    private String nome;
    @Min(value = 1, message = "O número deve ser maior que 1")
    @Max(value = 9999, message = "O número deve ser menor que 9999")


    private int CRM;
    private List<ProcedimentoDTO> listaProcedimentos = new ArrayList<>();
    private long procedimentoId;


    public long getProcedimentoId() {
        return procedimentoId;
    }

    public void setProcedimentoId(long procedimentoId) {
        this.procedimentoId = procedimentoId;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int cRM) {
        CRM = cRM;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProcedimentoDTO> getListaProcedimentos() {
        return listaProcedimentos;
    }

    public void setListaProcedimentos(List<ProcedimentoDTO> listaProcedimentos) {
        this.listaProcedimentos = listaProcedimentos;
    }

}