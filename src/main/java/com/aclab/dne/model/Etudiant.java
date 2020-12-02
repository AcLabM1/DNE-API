package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@PrimaryKeyJoinColumn(name = "idInterneUniv")
public class Etudiant extends InterneUniv {

    private Date dateNaissance;
    private String emailPersonnel;
    private String telephonePeronnel;
}
