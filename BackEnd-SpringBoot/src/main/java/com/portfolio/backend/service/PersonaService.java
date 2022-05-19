package com.portfolio.backend.service;

import com.portfolio.backend.models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.backend.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository personaRepo;  

    @Override
    public void crearPersona(Persona persona) {
        personaRepo.save(persona);
    }
    
    @Override
    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaRepo.save(persona);
    }
    
    @Override
    public Persona buscarPersona(Long id){
        return personaRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<Persona> verPersonas() {
        return personaRepo.findAll();
    }
    
}
