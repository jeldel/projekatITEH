package com.fon.zakazivanjeterminalicna.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mupovi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MUP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String naziv;
    String adresa;
    String brojTelefona;
    @OneToMany
    @JoinColumn(name ="mupId")
    List<Termin> termini = new ArrayList<>();
}
