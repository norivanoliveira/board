package br.com.inclusaodev.board.business.topico;

import br.com.inclusaodev.board.business.curso.Curso;
import br.com.inclusaodev.board.security.usuario.model.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Topico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;

	@Enumerated(EnumType.ORDINAL)
	private TopicoStatus status;

	@ManyToOne
	private Usuario autor;

	@ManyToOne
	private Curso curso;


}
