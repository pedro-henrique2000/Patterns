package com.company;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        CalculadorFrete normal = new FreteNormal();
        Pedido pedido = new Pedido(normal, BigDecimal.valueOf(100.0));
        System.out.println(pedido.calcularValorFrete());

        CalculadorFrete expresso = new FreteExpresso();
        pedido.setCalculadorFrete(expresso);
        System.out.println(pedido.calcularValorFrete());
    }
}
