package br.com.rednetsolucoes.merendaescolar2.dominio;

import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-04T15:08:09")
@StaticMetamodel(EscolaEstoque.class)
public class EscolaEstoque_ { 

    public static volatile ListAttribute<EscolaEstoque, Produto> estoque;
    public static volatile SingularAttribute<EscolaEstoque, Long> idEscola;
    public static volatile SingularAttribute<EscolaEstoque, String> nomeEscola;
    public static volatile SingularAttribute<EscolaEstoque, Long> id;

}