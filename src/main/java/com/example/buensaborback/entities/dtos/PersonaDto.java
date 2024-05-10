package com.example.buensaborback.entities.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonaDto extends BaseDto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private UsuarioDto usuario;
    private ImagenArticuloDto imagen;
    private Set<DomicilioDto> domicilios = new HashSet<>();

}
