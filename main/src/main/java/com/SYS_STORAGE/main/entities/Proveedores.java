package com.SYS_STORAGE.main.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="proveedores")
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre_empresa;
    private String nombre_contacto;
    private String ruc;
    private String descripcion;
    private String ciudad;
    private String direccion;
    private String num_telefonico;
    private String email_contacto;
}
