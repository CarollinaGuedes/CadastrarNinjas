package dev.java10x.CadastrarNinjas.Ninjas.service;

import dev.java10x.CadastrarNinjas.Ninjas.model.NinjaModel;
import dev.java10x.CadastrarNinjas.Ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar todos os meus ninjas por ID
        public NinjaModel listarNinjasPorID(Long id){
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return  ninjaPorID.orElse(null);
    }

}
