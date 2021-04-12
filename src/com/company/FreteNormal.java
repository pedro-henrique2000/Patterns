package com.company;

import java.math.BigDecimal;

public class FreteNormal implements CalculadorFrete {

    private static final BigDecimal VALOR_FRETE_NORMAL = BigDecimal.valueOf(1.2);

    @Override
    public BigDecimal calcularFrete(Pedido pedido) {
        return pedido.getValorFinal().multiply(VALOR_FRETE_NORMAL);
    }
}
