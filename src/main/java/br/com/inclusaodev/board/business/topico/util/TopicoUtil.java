package br.com.inclusaodev.board.business.topico.util;

import br.com.inclusaodev.board.business.curso.model.Curso;
import br.com.inclusaodev.board.business.topico.model.StatusTopico;
import br.com.inclusaodev.board.business.topico.model.Topico;
import br.com.inclusaodev.board.security.usuario.model.Usuario;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class TopicoUtil {

    public static Topico getFakeTopico() {
        return new Topico(1L, "testou", "teste",
                LocalDateTime.now(), StatusTopico.NAO_RESPONDIDO,
                new Usuario(1L, "autor", "email", "senha"),
                new Curso(1L, "Curso", null));
    }
}