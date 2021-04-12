package com.company;

import java.math.BigDecimal;

public class Pedido {

    private CalculadorFrete calculadorFrete;
    private BigDecimal valorFinal;

    public Pedido(CalculadorFrete calculadorFrete, BigDecimal valorFinal) {
        this.calculadorFrete = calculadorFrete;
        this.valorFinal = valorFinal;
    }

    public CalculadorFrete getCalculadorFrete() {
        return calculadorFrete;
    }

    public void setCalculadorFrete(CalculadorFrete calculadorFrete) {
        this.calculadorFrete = calculadorFrete;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }

    public BigDecimal calcularValorFrete() {
        return calculadorFrete.calcularFrete(this);
    }
}
