/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Porfolio.Luciano.Interface;

import com.Porfolio.Luciano.Entity.Persona;
import java.util.List;



public interface iPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();
    
    // Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto persona por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
    
 
}
