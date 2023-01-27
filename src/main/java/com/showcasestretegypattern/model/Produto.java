package com.showcasestretegypattern.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Produto {
    private int idCompra;
    private String nomeProduto;
    private Double valorCompra;
}
