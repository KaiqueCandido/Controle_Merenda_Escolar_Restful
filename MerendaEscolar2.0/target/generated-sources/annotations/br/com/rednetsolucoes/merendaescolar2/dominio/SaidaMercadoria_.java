package br.com.rednetsolucoes.merendaescolar2.dominio;

import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-07T11:49:38")
@StaticMetamodel(SaidaMercadoria.class)
public class SaidaMercadoria_ { 

    public static volatile SingularAttribute<SaidaMercadoria, String> escola;
    public static volatile SingularAttribute<SaidaMercadoria, Long> qtdeUnidade;
    public static volatile SingularAttribute<SaidaMercadoria, Produto> produto;
    public static volatile SingularAttribute<SaidaMercadoria, String> tipoUnidade;
    public static volatile SingularAttribute<SaidaMercadoria, Long> id;
    public static volatile SingularAttribute<SaidaMercadoria, String> dataSaida;

}