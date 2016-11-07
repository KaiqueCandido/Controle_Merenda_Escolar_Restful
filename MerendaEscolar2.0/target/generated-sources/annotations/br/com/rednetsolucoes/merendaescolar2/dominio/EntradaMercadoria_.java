package br.com.rednetsolucoes.merendaescolar2.dominio;

import br.com.rednetsolucoes.merendaescolar2.dominio.Fornecedor;
import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-04T17:21:52")
@StaticMetamodel(EntradaMercadoria.class)
public class EntradaMercadoria_ { 

    public static volatile SingularAttribute<EntradaMercadoria, Long> qtdeUnidade;
    public static volatile SingularAttribute<EntradaMercadoria, Produto> produto;
    public static volatile SingularAttribute<EntradaMercadoria, String> numeroNotaFical;
    public static volatile SingularAttribute<EntradaMercadoria, String> dataValidade;
    public static volatile SingularAttribute<EntradaMercadoria, String> dataEntrada;
    public static volatile SingularAttribute<EntradaMercadoria, Double> valorunitario;
    public static volatile SingularAttribute<EntradaMercadoria, String> tipoUnidade;
    public static volatile SingularAttribute<EntradaMercadoria, Long> id;
    public static volatile SingularAttribute<EntradaMercadoria, Fornecedor> fornecedor;

}