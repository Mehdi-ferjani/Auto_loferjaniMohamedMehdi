package tn.esprit.auto_loferjanimohamedmehdi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    private String libelle;
}