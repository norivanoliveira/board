package br.com.inclusaodev.board.rest;

import br.com.inclusaodev.board.negocio.topico.vo.TopicoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static br.com.inclusaodev.board.negocio.topico.util.TopicoUtil.getFakeTopico;
import static br.com.inclusaodev.board.negocio.topico.vo.TopicoVOConveter.convertTopicosToTopicosVO;

@RestController
public class TopicoRestController {

    @RequestMapping("/topicos")
    public List<TopicoVO> getTopicos(){
        return convertTopicosToTopicosVO(Arrays.asList(getFakeTopico(), getFakeTopico()));
    }

}
