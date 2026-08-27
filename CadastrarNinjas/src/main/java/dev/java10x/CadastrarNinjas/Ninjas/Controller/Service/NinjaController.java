package dev.java10x.CadastrarNinjas.Ninjas.Controller.Service;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
        public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }



}
