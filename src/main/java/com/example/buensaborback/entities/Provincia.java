package com.example.buensaborback.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "nombre" }) })
public class Provincia extends Base{

    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "El pais es requerido")
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

}
