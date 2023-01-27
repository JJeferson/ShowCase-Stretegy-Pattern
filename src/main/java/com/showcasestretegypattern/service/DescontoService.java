package com.showcasestretegypattern.service;


import com.showcasestretegypattern.strategies.CalculaDescontoStrategyInterface;
import com.showcasestretegypattern.strategies.condicoes.MaiorQue100;
import com.showcasestretegypattern.strategies.condicoes.MenorQue100;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescontoService {
    @Autowired
    CalculaDescontoStrategyInterface strategy ;
    CalculaDescontoStrategyInterface a = new MenorQue100(strategy);
}
