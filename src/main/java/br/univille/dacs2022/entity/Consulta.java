package br.univille.dacs2022.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Temporal(value = TemporalType.DATE)
    private Date Date;
    private String Status;
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private Paciente paciente;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Consulta_Id")
    private List<ProcedimentoRealizado> listaProcedimentos = new ArrayList();

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private Medico medicoReponsavel;

    public List<ProcedimentoRealizado> getListaProcedimentos() {
        return listaProcedimentos;
    }

    public void setListaProcedimentos(List<ProcedimentoRealizado> listaProcedimentos) {
        this.listaProcedimentos = listaProcedimentos;
    }

    public String getStatus() {
        return Status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        this.Date = date;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

}
