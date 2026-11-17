package com.todobarato.pcl.todobarato.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarcaResponseDTO {
    private Integer idmarca;
    private String nombre;
    private Boolean estado;
    private BigDecimal precio;
    private Integer cantidad;
    private BigDecimal total;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
