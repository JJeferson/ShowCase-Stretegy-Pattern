package com.showcasestretegypattern.controller;

import com.showcasestretegypattern.model.Produto;
import com.showcasestretegypattern.service.DescontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/desconto")
public class DescontoController {

    @Autowired
    DescontoService descontoService;

    @PostMapping()
    public String verificaDesconto(@RequestBody Produto produto){
       // return   descontoService.calculaDesconto(produto.getValorCompra());

    }
}
