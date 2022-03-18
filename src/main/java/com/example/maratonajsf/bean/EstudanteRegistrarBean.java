package com.example.maratonajsf.bean;

import com.example.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    private String[] nomesArray = {"devDOjo", "eh", "foda"};
    private List<String> nomesList = Arrays.asList("Lucas", "Jeronimo", "Rocha");
    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku", "Naruto", "Ichigo"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Goku", "O Mais forte");
        nomesMap.put("One Piece", "o mais longo");
        nomesMap.put("Naruto", "O mais lenga lenga");
    }

    public void executar(){
        System.out.println("teste executar");
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }
}
