package org.training.safe_pet_backend.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.training.safe_pet_backend.domain.enumerated.Porte;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "animal")
public class Animal {
    @Id
    private String idAnimal;
    private String nome;
    @NotBlank(message = "A especie deve ser informada!")
    private String especie;
    private String raca;
    @NotNull
    private Porte porte;
    private LocalDate dataNascimento;
    @NotBlank
    private String cor;
    private List<String> vacinas;
    private Boolean castrado;
    private Boolean adotado;
    @NotBlank
    private String localizacaoAbrigo;
    @NotNull
    private String cpfVoluntario;
    private String cpfTutor;

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<String> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<String> vacinas) {
        this.vacinas = vacinas;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Boolean getAdotado() {
        return adotado;
    }

    public void setAdotado(Boolean adotado) {
        this.adotado = adotado;
    }

    public String getLocalizacaoAbrigo() {
        return localizacaoAbrigo;
    }

    public void setLocalizacaoAbrigo(String localizacaoAbrigo) {
        this.localizacaoAbrigo = localizacaoAbrigo;
    }

    public String getCpfVoluntario() {
        return cpfVoluntario;
    }

    public void setCpfVoluntario(String cpfVoluntario) {
        this.cpfVoluntario = cpfVoluntario;
    }

    public String getCpfTutor() {
        return cpfTutor;
    }

    public void setCpfTutor(String cpfTutor) {
        this.cpfTutor = cpfTutor;
    }
}
