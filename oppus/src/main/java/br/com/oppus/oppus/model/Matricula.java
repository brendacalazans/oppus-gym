package br.com.oppus.oppus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMatricula;
    private String nome;
    private String email;
    private String senha;
    private String status;
    private LocalDate entrada;
    private LocalDate saida;
    private Integer codAluno;
    private String codInstituicao;
    private Integer codPlano;
    private Integer codPagamento;


    public Matricula(){

    }

    public Matricula(String nome, String email, String senha, String status){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    public Matricula(Integer idMatricula, Integer codAluno, String nome, String email, String senha, String codInstituicao, LocalDate entrada, LocalDate saida, Integer codPlano, Integer codPagamento, String status) {
        this.idMatricula = idMatricula;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.entrada = entrada;
        this.saida = saida;
        this.codAluno = codAluno;
        this.codInstituicao = codInstituicao;
        this.codPlano = codPlano;
        this.codPagamento = codPagamento;
        this.status = status;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodInstituicao() {
        return codInstituicao;
    }

    public void setCodInstituicao(String codInstituicao) {
        this.codInstituicao = codInstituicao;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

    public Integer getCodPlano() {
        return codPlano;
    }

    public void setCodPlano(Integer codPlano) {
        this.codPlano = codPlano;
    }

    public Integer getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(Integer codPagamento) {
        this.codPagamento = codPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

