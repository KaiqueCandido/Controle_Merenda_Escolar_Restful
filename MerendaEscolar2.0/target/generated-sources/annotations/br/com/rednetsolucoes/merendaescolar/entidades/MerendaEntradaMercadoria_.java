package br.com.rednetsolucoes.merendaescolar.entidades;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaProduto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-07T16:06:28")
@StaticMetamodel(MerendaEntradaMercadoria.class)
public class MerendaEntradaMercadoria_ { 

    public static volatile SingularAttribute<MerendaEntradaMercadoria, String> numeroNotaFical;
    public static volatile SingularAttribute<MerendaEntradaMercadoria, Integer> qtdeEntrada;
    public static volatile SingularAttribute<MerendaEntradaMercadoria, String> dataEntrada;
    public static volatile ListAttribute<MerendaEntradaMercadoria, MerendaProduto> produtos;
    public static volatile SingularAttribute<MerendaEntradaMercadoria, Long> id;
    public static volatile SingularAttribute<MerendaEntradaMercadoria, String> dataCompra;

}