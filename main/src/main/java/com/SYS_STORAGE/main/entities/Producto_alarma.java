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
@Table(name="producto_alarmas")
public class Producto_alarma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int producto_id;
    private int tipo_alarma;
    private Date fecha;

}
