package com.todobarato.pcl.todobarato.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarcaRequestDTO {

    @Schema(description = "Nombre de la marca", example = "Toyota")
    @NotBlank(message = "El nombre de la marca es obligatorio")
    @Size(max = 200, message = "El nombre no puede superar los 200 caracteres")
    private String nombre;

    @Schema(description = "Estado de la marca (activo/inactivo)", example = "true")
    @Builder.Default
    private Boolean estado = true;

    // NUEVOS CAMPOS
    @Schema(description = "Precio del producto", example = "150.50")
    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser mayor a 0")
    private Double precio;

    @Schema(description = "Cantidad del producto", example = "5")
    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad debe ser al menos 1")
    private Integer cantidad;
}