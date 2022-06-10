package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuario")

public class UsuarioController {

    private static final List<Usuario> usuarios = new ArrayList<Usuario>();

    public UsuarioController() {
        usuarios.add(new Usuario("38954971857","Alexandre",10,8));
        usuarios.add(new Usuario("98354715812","Jonathan",6,8));
        usuarios.add(new Usuario("14524835787","Adenilson",6,4));
    }

    @GetMapping
    public String getUsuario (Model model)
    {
        model.addAttribute("usuarios", usuarios);
        return "usuarios";

    }
}
