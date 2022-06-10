package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {


    private static final List<Usuario> usuarios = new ArrayList<Usuario>();

    public UsuarioRestController() {

        usuarios.add(new Usuario("14795175265", "Briza", 8, 8));
        usuarios.add(new Usuario("25878932579", "Lucas", 4, 9));
        usuarios.add(new Usuario("12385236951", "Franz", 2, 4));
    }

    @GetMapping
    public List<Usuario> getUsuarios(){
        return usuarios;
    }

}