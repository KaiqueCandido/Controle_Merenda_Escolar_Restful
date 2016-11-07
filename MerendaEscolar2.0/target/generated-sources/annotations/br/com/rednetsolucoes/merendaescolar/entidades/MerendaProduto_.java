package br.com.rednetsolucoes.merendaescolar.entidades;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaFornecedor;
import br.com.rednetsolucoes.merendaescolar.enums.UnidadeMedida;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-07T16:06:29")
@StaticMetamodel(MerendaProduto.class)
public class MerendaProduto_ { 

    public static volatile SingularAttribute<MerendaProduto, Integer> qtde;
    public static volatile SingularAttribute<MerendaProduto, UnidadeMedida> unidadeMedida;
    public static volatile SingularAttribute<MerendaProduto, Long> id;
    public static volatile SingularAttribute<MerendaProduto, MerendaFornecedor> fornecedor;
    public static volatile SingularAttribute<MerendaProduto, Double> valorUnitario;
    public static volatile SingularAttribute<MerendaProduto, String> descricao;
    public static volatile SingularAttribute<MerendaProduto, String> codProduto;

}