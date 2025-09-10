public class SistemaPagamento implements GerenciaFormaPagamento {

    @Override
    public void exibirOpcoes() {
        System.out.println("Opções: PIX, Cartão de Crédito, Cartão de Débito");
    }

    @Override
    public void integrarComAPI(String url) {
        System.out.println("Integrando com API em: " + url);
    }

    @Override
    public boolean processarPagamento(FormaPagamento forma, double valor) {
        System.out.println("Faendo pagamento!");
        return true;
    }

    // processarPagamento já está implementado via default
}
