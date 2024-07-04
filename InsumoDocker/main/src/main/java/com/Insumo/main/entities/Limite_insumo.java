package com.Insumo.main.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="insumo_tiene_limite")
public class Limite_insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int insumoId;
    private String nombre;
    private int stock;
    private int limite_stockout;
    private int limite_sobreabastecimiento;
    private Double costo;
}
