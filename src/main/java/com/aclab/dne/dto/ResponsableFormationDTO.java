package com.aclab.dne.dto;


public class ResponsableFormationDTO {

    private Long idResponsableFormation;
    private String numInterneUniv;
    private String nom;
    private String prenom;
    private boolean estVacataire;
    private String emailUniv;
    private String telephoneUniv;
    private String bureau;
    private String telephone;
    private String poste;
    private String password;
    private String username;

    public ResponsableFormationDTO() {
    }

    public ResponsableFormationDTO(Long idResponsableFormation, String numInterneUniv, String nom, String prenom, boolean estVacataire, String emailUniv, String telephoneUniv, String bureau, String telephone, String poste) {
        this.idResponsableFormation = idResponsableFormation;
        this.numInterneUniv = numInterneUniv;
        this.nom = nom;
        this.prenom = prenom;
        this.estVacataire = estVacataire;
        this.emailUniv = emailUniv;
        this.telephoneUniv = telephoneUniv;
        this.bureau = bureau;
        this.telephone = telephone;
        this.poste = poste;
    }

    public Long getIdResponsableFormation() {
        return idResponsableFormation;
    }

    public void setIdResponsableFormation(Long idResponsableFormation) {
        this.idResponsableFormation = idResponsableFormation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }

    public String getTelephoneUniv() {
        return telephoneUniv;
    }

    public void setTelephoneUniv(String telephoneUniv) {
        this.telephoneUniv = telephoneUniv;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public boolean isEstVacataire() {
        return estVacataire;
    }

    public void setEstVacataire(boolean estVacataire) {
        this.estVacataire = estVacataire;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getnumInterneUniv() {
        return numInterneUniv;
    }

    public void setnumInterneUniv(String numInterneUniv) {
        this.numInterneUniv = numInterneUniv;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ResponsableFormationDTO{" +
                "idResponsableFormation=" + idResponsableFormation +
                ", numInterneUniv=" + numInterneUniv +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", estVacataire=" + estVacataire +
                ", emailUniv='" + emailUniv + '\'' +
                ", telephoneUniv='" + telephoneUniv + '\'' +
                ", bureau='" + bureau + '\'' +
                ", telephone='" + telephone + '\'' +
                ", poste='" + poste + '\'' +
                '}';
    }
}
