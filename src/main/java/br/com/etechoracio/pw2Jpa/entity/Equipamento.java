package br.com.etechoracio.pw2Jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_EQUIPAMENTO")


public class Equipamento {
    @Id //é id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tem identify no banco
    @Column(name = "ID_EQUIPAMENTO") //nome diferente
    private Long id;
    @Column(name = "TX_MARCA")
    private  String marca;
    @Column(name = "TX_MODELO")
    private String modelo;
    @Column(name = "TX_NUMERO_SERIE")
    private String numeroSerie;
    @Column(name = "TX_TIPO")
    private String tipo;

}
