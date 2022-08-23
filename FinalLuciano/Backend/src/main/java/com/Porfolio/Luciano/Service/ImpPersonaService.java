/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Porfolio.Luciano.Service;

import com.Porfolio.Luciano.Entity.Persona;
import com.Porfolio.Luciano.Interface.iPersonaService;
import com.Porfolio.Luciano.Repository.iPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements iPersonaService{
    @Autowired iPersonaRepository IPersonaRepository;
    

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = IPersonaRepository.findAll();
    return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        IPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        IPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = IPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
