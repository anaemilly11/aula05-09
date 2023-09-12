package br.com.etechoracio.pw2Jpa.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_SERVICO")

public class Servico {

    @Id //é id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tem identify no banco
    @Column(name = "ID_SERVICO") //nome diferente
    private Long id;
    @Column(name = "TX_DESCRICAO")
    private String descricao;
    @Column(name = "NR_VALOR")
    private float valor;

}