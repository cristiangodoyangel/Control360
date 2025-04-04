package com.control360.control.inventario.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proveedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nombre;

    @Column(length = 255)
    private String contacto;
}
