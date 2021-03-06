package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(CommunicationId.class)
public class Communication  implements Serializable {

    @Id
    private Long idEtudiant;

    @Id
    private Long idPromotion;

    @Id
    private Long idDiplome;

    @Id
    private Long idEmploye;

    @Id
    private Long idCommunication;

    private Timestamp dateHeure;

    @Lob
    private String description;

    private String nature;
}
