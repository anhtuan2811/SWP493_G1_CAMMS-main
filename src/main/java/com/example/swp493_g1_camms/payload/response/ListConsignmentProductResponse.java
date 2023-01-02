package com.example.swp493_g1_camms.payload.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ListConsignmentProductResponse {
    private Long id;

    private Long warehouseId;

    private String warehouseName;

    private String importDate;

    private String expirationDate;

    private Integer quantityInstock;

    private Integer quantity;
}
