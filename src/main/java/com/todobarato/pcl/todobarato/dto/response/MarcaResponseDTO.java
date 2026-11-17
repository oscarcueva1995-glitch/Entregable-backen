package com.todobarato.pcl.todobarato.dto.response;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarcaResponseDTO {
    private Integer idmarca;
    private String nombre;
    private Boolean estado;

    // NUEVOS CAMPOS
    private Double precio;
    private Integer cantidad;
    private Double total;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}