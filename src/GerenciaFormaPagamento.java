public interface GerenciaFormaPagamento {
     void exibirOpcoes();
     void integrarComAPI(String url);
     boolean processarPagamento(FormaPagamento forma, double valor);
}

public interface FormaPagamento {
    boolean efetuarPagamento(double valor);
}


public interface PagamentoPix extends FormaPagamento {
     void pagarComCodigoEstatico(String codigoPix);
     void pagarComQRCode(String codigoQRCode);
     void pagarComChave(String chave, double valor);
}


public interface PagamentoCartao extends FormaPagamento {
    void definirTipoOperacao(String tipo); 
    void informarDadosCartao(String numero, String validade, String codigoSeguranca);
    void informarDadosTitular(String nome, String documento);
}

public interface PagamentoBoleto extends FormaPagamento {
    PagamentoBoleto puxarBoleto(String tipo);
    PagamentoBoleto validarBoleto(String numero);
    PagamentoBoleto informarDadosTitular(String nome, String documento);
}
