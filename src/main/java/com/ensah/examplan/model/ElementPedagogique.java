package com.ensah.examplan.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElementPedagogique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long idElemPedagogique;
    private String titre;
    private String niveau;
    private String type;
    @ManyToOne
    @JoinColumn(name = "enseignant_id",referencedColumnName = "idPersonnel")
    @JsonIgnoreProperties("elementPedagogiques")
    Enseignant enseignant;

}
