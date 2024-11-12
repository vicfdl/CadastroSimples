package com.aulabd.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aulabd.cadastro.model.Cliente;
import com.aulabd.cadastro.model.ClienteService;

@Controller
public class CadastroController {

    @Autowired
    ApplicationContext context;

    @GetMapping("/")
    public String principal(){
        return "principal"; 
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model){
        Cliente cli = new Cliente();
        model.addAttribute("cliente", cli);
        return "cadastro"; 
    }

    @PostMapping("/cadastro")
    public String sucesso(@ModelAttribute Cliente cli){
        ClienteService cs = context.getBean(ClienteService.class);
        cs.inserirCliente(cli);
        return "sucesso"; 
    }

}
