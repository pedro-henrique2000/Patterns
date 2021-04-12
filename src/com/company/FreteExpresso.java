package com.company;

import java.math.BigDecimal;

public class FreteExpresso implements CalculadorFrete {

    private static final BigDecimal VALOR_FRETE_EXPRESSO = BigDecimal.valueOf(1.5);

    @Override
    public BigDecimal calcularFrete(Pedido pedido) {
        return pedido.getValorFinal().multiply(VALOR_FRETE_EXPRESSO);
    }
}
