package br.com.inclusaodev.board.business.topico.service;

import br.com.inclusaodev.board.business.topico.TopicoRepository;
import br.com.inclusaodev.board.business.topico.vo.TopicoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static br.com.inclusaodev.board.business.topico.util.TopicoVOConveter.convertTopicosToTopicosVO;
import static java.util.Objects.nonNull;

@Service
public class TopicoServiceImpl implements TopicoService {

    @Autowired
    TopicoRepository repository;

    @Override
    public Collection<TopicoVO> getTopicosByFilter(String cursoNome) {
        return (nonNull(cursoNome)) ?
                convertTopicosToTopicosVO(repository.findByCursoNome(cursoNome))
                :
                convertTopicosToTopicosVO(repository.findAll());
    }
}
