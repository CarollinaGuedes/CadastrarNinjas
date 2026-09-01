package dev.java10x.CadastrarNinjas.Ninjas.repository;

import dev.java10x.CadastrarNinjas.Ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}