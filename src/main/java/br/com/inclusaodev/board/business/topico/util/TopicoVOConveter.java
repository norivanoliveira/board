package br.com.inclusaodev.board.business.topico.util;

import br.com.inclusaodev.board.business.topico.Topico;
import br.com.inclusaodev.board.business.topico.vo.TopicoVO;
import lombok.experimental.UtilityClass;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class TopicoVOConveter {

     public static Collection<TopicoVO> convertTopicosToTopicosVO(List<Topico> topicos) {
          return topicos.stream().map(TopicoVOConveter::createTopicoVO).collect(Collectors.toList());
     }

     private TopicoVO createTopicoVO(Topico topico){
          return TopicoVO.builder()
                  .id(topico.getId())
                  .titulo(topico.getTitulo())
                  .mensagem(topico.getMensagem())
                  .dataCriacao(topico.getDataCriacao())
                  .build();
     }
}
