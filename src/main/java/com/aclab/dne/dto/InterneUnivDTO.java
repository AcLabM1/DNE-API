package com.aclab.dne.dto;

public class InterneUnivDTO {

    private Long idInterneUniv;
    private String numInterneUniv;
    private String emailUniv;
    private String password;
    private String username;

    public InterneUnivDTO() {
    }

    public InterneUnivDTO(Long idInterneUniv, String numInterneUniv, String emailUniv) {
        this.idInterneUniv = idInterneUniv;
        this.numInterneUniv = numInterneUniv;
        this.emailUniv = emailUniv;
    }

    public Long getIdInterneUniv() {
        return idInterneUniv;
    }

    public void setIdInterneUniv(Long idInterneUniv) {
        this.idInterneUniv = idInterneUniv;
    }

    public String getnumInterneUniv() {
        return numInterneUniv;
    }

    public void setnumInterneUniv(String numInterneUniv) {
        this.numInterneUniv = numInterneUniv;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
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

}
