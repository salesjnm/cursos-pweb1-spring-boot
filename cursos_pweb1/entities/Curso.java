package com.exemplo.cursos_pweb1.entities; 

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String descricao;
    private Double cargaHoraria;
    private Double preco;
    private String nivel;
    private String url;
    private String status;

    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Instrutor instrutor;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Aula> aulas = new ArrayList<>();

    public Curso() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(Double cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Instrutor getInstrutor() { return instrutor; }
    public void setInstrutor(Instrutor instrutor) { this.instrutor = instrutor; }

    public List<Aula> getAulas() { return aulas; }
    public void setAulas(List<Aula> aulas) { this.aulas = aulas; }
}