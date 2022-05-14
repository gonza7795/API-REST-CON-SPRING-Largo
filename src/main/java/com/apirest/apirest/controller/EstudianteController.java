
package com.apirest.apirest.controller;

import com.apirest.apirest.model.Estudiante;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;
    

    
    @GetMapping("api/estudiante")
    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> listaEstudiantes=new ArrayList<>();
        
        
        Estudiante e = new Estudiante();
        
        e.setId(1);
        e.setNombres("Elviar");
        e.setApellidos("Largo");
        e.setEmail("elargo@gmail.com");
        e.setNota(5D);
        
        
            Estudiante e1 = new Estudiante();
        
        e.setId(2);
        e.setNombres("Luis");
        e.setApellidos("Paredez");
        e.setEmail("elarg1@gmail.com");
        e.setNota(8D);
        
        
        
        
        
        listaEstudiantes.add(e);
         listaEstudiantes.add(e1);
         
         return listaEstudiantes;
        
    }
    
    
    
    @PostMapping("api/estudiante")
    public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
        System.out.println("Estudiante correctamente creado");
        estudianteService.guardar(estudiante);
        return estudiante;
        
    }
      
    
}
