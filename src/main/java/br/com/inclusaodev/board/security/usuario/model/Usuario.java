package br.com.inclusaodev.board.security.usuario.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {

	private Long id;
	private String nome;
	private String email;
	private String senha;

}
