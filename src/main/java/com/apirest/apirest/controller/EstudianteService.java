
package com.apirest.apirest.controller;

import com.apirest.apirest.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service


public class EstudianteService {
    
    @Autowired 
    
    private EstudianteRepository estudianteRepository;
    public void guardar (Estudiante estudiante)  {
        
        estudianteRepository.save(estudiante);
        
    }
    
}
