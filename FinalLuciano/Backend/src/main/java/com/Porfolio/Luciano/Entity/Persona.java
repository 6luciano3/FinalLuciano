package com.Porfolio.Luciano.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Sive(min = 1, max = 50, mensage = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Sive(min = 1, max = 50, mensage = "No cumple con la longitud"
    private String apellido;
    
    
    @Sive(min = 1, max = 50, mensage = "No cumple con la longitud"
    private String img;

    public Persona orElse(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
