package org.training.safe_pet_backend.entities.questionnaire;

import org.training.safe_pet_backend.entities.enumerated.Porte;

public class QuestionarioResposta {

    private Porte portePreferido;
    private Boolean temEspacoParaGrande;
    private String tempoForaDeCasa;
    private String temCriancas;
    private String preferenciaPelagem;

    public Porte getPortePreferido() {
        return portePreferido;
    }

    public void setPortePreferido(Porte portePreferido) {
        this.portePreferido = portePreferido;
    }

    public Boolean getTemEspacoParaGrande() {
        return temEspacoParaGrande;
    }

    public void setTemEspacoParaGrande(Boolean temEspacoParaGrande) {
        this.temEspacoParaGrande = temEspacoParaGrande;
    }

    public String getTempoForaDeCasa() {
        return tempoForaDeCasa;
    }

    public void setTempoForaDeCasa(String tempoForaDeCasa) {
        this.tempoForaDeCasa = tempoForaDeCasa;
    }

    public String getTemCriancas() {
        return temCriancas;
    }

    public void setTemCriancas(String temCriancas) {
        this.temCriancas = temCriancas;
    }

    public String getPreferenciaPelagem() {
        return preferenciaPelagem;
    }

    public void setPreferenciaPelagem(String preferenciaPelagem) {
        this.preferenciaPelagem = preferenciaPelagem;
    }
}

