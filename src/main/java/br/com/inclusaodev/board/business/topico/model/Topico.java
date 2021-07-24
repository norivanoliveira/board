package br.com.inclusaodev.board.business.topico.model;

import br.com.inclusaodev.board.business.curso.model.Curso;
import br.com.inclusaodev.board.security.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@Entity
public class Topico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;

	@Enumerated(EnumType.ORDINAL)
	private StatusTopico status;

	@ManyToOne
	private Usuario autor;

	@ManyToOne
	private Curso curso;


}
