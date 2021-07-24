package br.com.inclusaodev.board.business.topico.model;

import br.com.inclusaodev.board.business.curso.model.Curso;
import br.com.inclusaodev.board.business.resposta.model.Resposta;
import br.com.inclusaodev.board.security.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class Topico {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private StatusTopico status;
	private Usuario autor;
	private Curso curso;
	private List<Resposta> respostas;

}
