package br.com.inclusaodev.board.business.resposta.model;

import br.com.inclusaodev.board.business.topico.model.Topico;
import br.com.inclusaodev.board.security.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Resposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private Boolean solucao;

	@ManyToOne
	private Topico topico;

	@ManyToOne
	private Usuario autor;

}
