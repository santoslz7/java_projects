import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Manutencao> listaDeOrdens = new ArrayList<>();
        int opcao;

        do {
            System.out.println("-- MENU --");
            System.out.println("1. Cadastrar Servico Eletrico");
            System.out.println("2. Cadastrar Servico Hidraulico");
            System.out.println("3. Cadastrar Servico de Climatizacao");
            System.out.println("4. Executar Operacoes e Gerar Relatorios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Codigo: ");
                int cod = leitor.nextInt();
                leitor.nextLine();
                System.out.print("Descricao: ");
                String desc = leitor.nextLine();
                System.out.print("Valor Base: ");
                double valor = leitor.nextDouble();
                System.out.print("Prazo Estimado (dias): ");
                int prazo = leitor.nextInt();
                leitor.nextLine();

                if (opcao == 1) {
                    System.out.print("Tensao (ex: 110, 220): ");
                    double tensao = leitor.nextDouble();
                    listaDeOrdens.add(new ServicoEletrico(cod, desc, valor, prazo, true));
                } 
                else if (opcao == 2) {
                    System.out.print("Tipo de Encanamento (PVC/COBRE): ");
                    String material = leitor.nextLine();
                    listaDeOrdens.add(new ServicoHidraulico(cod, desc, valor, prazo, true));
                } 
                else if (opcao == 3) {
                    System.out.print("Quantidade de Equipamentos: ");
                    int qtd = leitor.nextInt();
                    listaDeOrdens.add(new ServicoClimatizacao(cod, desc, valor, prazo, true));
                }
                System.out.println("Ordem cadastrada com sucesso!");

            } else if (opcao == 4) {
                if (listaDeOrdens.isEmpty()) {
                    System.out.println("Nenhuma ordem cadastrada.");
                } else {
                    for (Manutencao m : listaDeOrdens) {
                        System.out.println("\n--- Processando OS #" + m.codigo + " ");
                        
                        m.iniciarServico(true);
                        
                        double taxaAdicional = 0;
                        if (m instanceof ServicoEletrico) {
                            taxaAdicional = ((ServicoEletrico) m).custoFinal();
                        } else if (m instanceof ServicoHidraulico) {
                            taxaAdicional = ((ServicoHidraulico) m).custoFinal();
                        } else if (m instanceof ServicoClimatizacao) {
                            taxaAdicional = ((ServicoClimatizacao) m).custoFinal();
                        }

                        m.gerarRelatorio(m.valorBase, true, taxaAdicional, true);
                    }
                }
            }

        } while (opcao != 0);

        System.out.println("Sistema finalizado.");
        leitor.close();
    }
}