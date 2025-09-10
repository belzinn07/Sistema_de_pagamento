public class PagamentoViaBoleto implements PagamentoBoleto {
    
    private String tipo;
    private String numero;
    private String nome;
    private String documento;

    @Override
    public boolean efetuarPagamento(double valor) {
        System.out.println("O pagamento na forma de boleto, deu certo!");
        return true;
    }

    @Override
    public PagamentoViaBoleto puxarBoleto(String tipo) {
        this.tipo=tipo;
        System.out.println("Puxou boleto com sucesso!");
        return this;
    }

    @Override
    public PagamentoViaBoleto validarBoleto(String numero) {
        this.numero=numero;
        System.out.println("Validou o boleto com sucesso!.");
        return this;
    }

    @Override
    public PagamentoViaBoleto informarDadosTitular(String nome, String documento) {
        this.documento=documento;
        System.out.println("Validou o usuário com sucesso!.");
        return this;
    }
    
}
