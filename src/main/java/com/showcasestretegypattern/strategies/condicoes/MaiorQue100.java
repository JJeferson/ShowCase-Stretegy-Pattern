package com.showcasestretegypattern.strategies.condicoes;

import com.showcasestretegypattern.strategies.CalculaDescontoStrategyInterface;
import org.springframework.stereotype.Component;

@Component
public class MaiorQue100 implements CalculaDescontoStrategyInterface {

    @Override
    public String calculaDesconto(Double valor) {
        if(valor >=100.00){
            return "Desconto de 20%";
        }
        return "Não";
    }
}
