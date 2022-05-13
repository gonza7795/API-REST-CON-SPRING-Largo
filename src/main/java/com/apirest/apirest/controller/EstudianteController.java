
package com.apirest.apirest.controller;

import com.apirest.apirest.model.Estudiante;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    
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
    
}
