package br.com.inclusaodev.board.business.topico.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class TopicoVO {
     final Long id;
     final String titulo;
     final String mensagem;
     final LocalDateTime dataCriacao;
}
