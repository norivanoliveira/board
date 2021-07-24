package br.com.inclusaodev.board.business.resposta.model;

import br.com.inclusaodev.board.business.topico.model.Topico;
import br.com.inclusaodev.board.security.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Resposta {

	private Long id;
	private String mensagem;
	private Topico topico;
	private LocalDateTime dataCriacao;
	private Usuario autor;
	private Boolean solucao;


}
