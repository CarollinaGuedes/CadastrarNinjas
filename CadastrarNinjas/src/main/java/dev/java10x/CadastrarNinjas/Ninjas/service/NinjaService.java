package dev.java10x.CadastrarNinjas.Ninjas.service;

import dev.java10x.CadastrarNinjas.Ninjas.model.NinjaModel;
import dev.java10x.CadastrarNinjas.Ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
}
