package br.com.inclusaodev.board.business.topico.service;

import br.com.inclusaodev.board.business.topico.vo.TopicoVO;

import java.util.Collection;

public interface TopicoService {

    Collection<TopicoVO> getAllTopicos();
}
