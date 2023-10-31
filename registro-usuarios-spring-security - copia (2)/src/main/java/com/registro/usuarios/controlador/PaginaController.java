package com.registro.usuarios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
    
    @GetMapping("/principal")
    public String mostrarPrincipal() {
        return "principal";
    }
    
    
    @GetMapping("/pag_servicios")
    public String mostrarPag_servicios() {
        return "pag_servicios";
    }
}



