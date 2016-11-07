package br.com.rednetsolucoes.merendaescolar.entidades;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEscola;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaProduto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-07T11:49:38")
@StaticMetamodel(MerendaSaidaMercadoria.class)
public class MerendaSaidaMercadoria_ { 

    public static volatile SingularAttribute<MerendaSaidaMercadoria, MerendaEscola> escola;
    public static volatile ListAttribute<MerendaSaidaMercadoria, MerendaProduto> produtos;
    public static volatile SingularAttribute<MerendaSaidaMercadoria, Long> id;

}