package br.com.etechoracio.pw2Jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_TECNICO")
public class Tecnico {

    @Id //é id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tem identify no banco
    @Column(name = "ID_TECNICO") //nome diferente
    private Long id;
    @Column(name = "TX_NOME")
    private  String nome;
    @Column(name = "TX_AREA_FONE")
    private String areafone;
    @Column(name = "TX_FONE")
    private String fone;
    @Column(name = "TX_TIPO_FONE")
    private String tipofone;
    @Column(name = "TX_EMAIL")
    private String email;
}
