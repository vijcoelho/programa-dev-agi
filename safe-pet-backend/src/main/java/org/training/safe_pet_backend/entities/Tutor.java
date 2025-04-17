package org.training.safe_pet_backend.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "tutor")
public class Tutor {
    @Id
    private String id;
    @NotBlank
    private String nome;
    @NotNull
    @Indexed(unique = true)
    private String cpf;
    @NotNull
    private LocalDate dataNascimento;
    @NotBlank
    private String localizacao;
    private Boolean respondeu;
    private List<Animal> animais;

    public Tutor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getRespondeu() {
        return respondeu;
    }

    public void setRespondeu(Boolean respondeu) {
        this.respondeu = respondeu;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}
