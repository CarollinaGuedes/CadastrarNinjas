package dev.java10x.CadastrarNinjas.Ninjas.controller;


import dev.java10x.CadastrarNinjas.Ninjas.model.NinjaModel;
import dev.java10x.CadastrarNinjas.Ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")

public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas") //GetMapping serve para mostrar
        public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }


    //Adicionar ninja(CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }
    //Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //localhist:8080/minjas/listar/...
    //Mostrar ninjas por id (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorID(id)
                ´-
    }
    //Alterar dados dos ninjas(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorID(){
        return  "Alterar Ninja por ID";
    }
    //Deletar Ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return  "Deletar Ninja por ID";
    }



}
