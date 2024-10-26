package pe.edu.cibertec.CL3_GemuNoSekai_docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping
    public String listaJuegos(){
        log.info("API REST Listar Juegos");
        return "Lista de Juegos: The Legend of Zelda Tears of The Kingdom, Pokemon Legends Arceus, Hades, ........";
    }

}
