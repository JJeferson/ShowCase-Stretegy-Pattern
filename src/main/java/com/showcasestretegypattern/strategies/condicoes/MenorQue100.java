package com.showcasestretegypattern.strategies.condicoes;

import com.showcasestretegypattern.strategies.CalculaDescontoStrategyInterface;
import org.springframework.stereotype.Component;

@Component
public class MenorQue100 implements CalculaDescontoStrategyInterface {

    private  CalculaDescontoStrategyInterface calculaDescontoStrategy;

    public MenorQue100(CalculaDescontoStrategyInterface calculaDescontoStrategy) {
        this.calculaDescontoStrategy=calculaDescontoStrategy;
    }

    @Override
    public String calculaDesconto(Double valor) {
        if(valor<100.00){
            return "Desconto de 10 R$";
        }
        return "Não";
    }
}
