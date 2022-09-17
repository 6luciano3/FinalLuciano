/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Porfolio.Luciano.Service;

import com.Porfolio.Luciano.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Porfolio.Luciano.Repository.IPersonaRepository;
import com.Porfolio.Luciano.Interface.IPersonaService;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository IPersonaRepository;
    

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
