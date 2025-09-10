
public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        // ========== Pagamento via PIX ==========
        PagamentoViaPix pagamentoPix = new PagamentoViaPix();
        pagamentoPix.pagarComChave("joao@banco.com", 150.00); // Apenas para simular chamada específica

        System.out.println("=== Processando pagamento via PIX ===");
        boolean sucessoPix = sistema.processarPagamento(pagamentoPix, 150.00);
        System.out.println("Pagamento via PIX realizado? " + sucessoPix);
        System.out.println();

        // ========== Pagamento via Cartão ==========
        PagamentoViaCartao pagamentoCartao = new PagamentoViaCartao();
        pagamentoCartao.definirTipoOperacao("crédito");
        pagamentoCartao.informarDadosCartao("1234 5678 9012 3456", "12/30", "123");
        pagamentoCartao.informarDadosTitular("João da Silva", "123.456.789-00");

        System.out.println("=== Processando pagamento via Cartão ===");
        boolean sucessoCartao = sistema.processarPagamento(pagamentoCartao, 250.00);
        System.out.println("Pagamento via Cartão realizado? " + sucessoCartao);
        System.out.println();


        // ========== Pagamento via Boleto ==========
        System.out.println("=== Processando pagamento via Boleto ===");
         boolean pagamentoBoleto = new PagamentoViaBoleto()
        .puxarBoleto("Boleto Bancário")
        .validarBoleto("234244553543544335346554456")
        .informarDadosTitular("Belmiro", "234324324")
        .efetuarPagamento(149.99);


    }
}
