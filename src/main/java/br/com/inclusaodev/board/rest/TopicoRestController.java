package br.com.inclusaodev.board.rest;

import br.com.inclusaodev.board.business.topico.service.TopicoService;
import br.com.inclusaodev.board.business.topico.vo.TopicoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TopicoRestController {

    @Autowired
    TopicoService service;

    @RequestMapping("/topicos")
    public Collection<TopicoVO> getTopicos() {
        return service.getAllTopicos();
    }

}
