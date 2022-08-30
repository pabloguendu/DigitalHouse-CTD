package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pablo");
        usuario.setApellido("Guendulain");
        usuario.setEmail("pguendulain92@gmail.com");
        usuario.setTelefono("123128937189273");
        return usuario;

    }
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios=new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Pablo");
        usuario.setApellido("Guendulain");
        usuario.setEmail("pguendulain92@gmail.com");
        usuario.setTelefono("123128937189273");

        Usuario usuario2=new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("fernando");
        usuario2.setApellido("Guendulain");
        usuario2.setEmail("pguendulain92@gmail.com");
        usuario2.setTelefono("123128937189273");

        Usuario usuario3=new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("nico");
        usuario3.setApellido("Guendulain");
        usuario3.setEmail("pguendulain92@gmail.com");
        usuario3.setTelefono("123128937189273");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario3")
    public Usuario editar() {
        Usuario usuario=new Usuario();
        usuario.setNombre("Pablo");
        usuario.setApellido("Guendulain");
        usuario.setEmail("pguendulain92@gmail.com");
        usuario.setTelefono("123128937189273");
        return usuario;
    }
    @RequestMapping(value = "usuario4")
    public Usuario eliminar() {
        Usuario usuario=new Usuario();
        usuario.setNombre("Pablo");
        usuario.setApellido("Guendulain");
        usuario.setEmail("pguendulain92@gmail.com");
        usuario.setTelefono("123128937189273");
        return usuario;
    }
    @RequestMapping(value = "usuario5")
    public Usuario buscar() {
        Usuario usuario=new Usuario();
        usuario.setNombre("Pablo");
        usuario.setApellido("Guendulain");
        usuario.setEmail("pguendulain92@gmail.com");
        usuario.setTelefono("123128937189273");
        return usuario;
    }
}
