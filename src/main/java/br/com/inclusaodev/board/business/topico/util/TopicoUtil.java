package br.com.inclusaodev.board.business.topico.util;

import br.com.inclusaodev.board.legacy.Curso;
import br.com.inclusaodev.board.legacy.Usuario;
import br.com.inclusaodev.board.business.topico.model.StatusTopico;
import br.com.inclusaodev.board.business.topico.model.Topico;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class TopicoUtil {

    public static Topico getFakeTopico() {
        Topico topicoTemp = new Topico(Long.valueOf(1), "testou", "teste",
                LocalDateTime.now(), StatusTopico.NAO_RESPONDIDO,
                new Usuario(Long.valueOf(1), "autor", "email", "senha"),
                new Curso(Long.valueOf(1), "Curso", null),
                null);
        return topicoTemp;
    }
}