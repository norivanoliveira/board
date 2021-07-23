package br.com.inclusaodev.board.negocio.topico.vo;

import br.com.inclusaodev.board.negocio.topico.Topico;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class TopicoVOConveter {

     public static List<TopicoVO> convertTopicosToTopicosVO(List<Topico> topicos){
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
