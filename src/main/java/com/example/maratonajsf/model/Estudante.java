package com.example.maratonajsf.model;

import com.example.maratonajsf.model.enums.Turno;

public class Estudante {

    private String nome = "Lucas";
    private String sobreNome = "Rocha";
    private double nota1;
    private double nota2;
    private double nota3 = 10;
    private Turno turno = Turno.MATUTINO;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno tunro) {
        this.turno = tunro;
    }
}
