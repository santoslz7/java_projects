
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Motor motorPop = new Motor(80, "Flex");
        Motor motorLuxo = new Motor(300, "Gasolina");

        CategPopular popular1 = new CategPopular("ABC-1111", "Fiat", "Mobi", 110.0, true, motorPop, 215);
        CategPopular popular2 = new CategPopular("DEF-2222", "Renault", "Kwid", 120.0, true, motorPop, 200);

        CategLuxo luxo1 = new CategLuxo("LUX-7777", "Audi", "A4", 500.0, true, motorLuxo, true);
        CategLuxo luxo2 = new CategLuxo("PRE-9999", "Mercedes", "C180", 600.0, true, motorLuxo, false);

        Cliente clienteAtual = null;

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n LOCADORA SENAI ");
            System.out.println("1. Cadastrar Cliente ");
            System.out.println("2. Consultar Frota Disponivel");
            System.out.println("3. Registrar Locacao e Calcular");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("\n Cadastro de Cliente ");
                    System.out.print("Nome Completo: ");
                    String nome = teclado.nextLine();
                    System.out.print("Idade: ");
                    int idade = teclado.nextInt();
                    teclado.nextLine();

                    if (idade < 21) {
                        System.out.println(" CADASTRO NEGADO: O cliente deve ter 21 anos ou mais.");
                    } else {
                        System.out.print("CPF: ");
                        String cpf = teclado.nextLine();
                        System.out.print("Validade CNH: ");
                        String cnh = teclado.nextLine();

                        clienteAtual = new Cliente(nome, cpf, idade, cnh);
                        System.out.println(" Cliente " + clienteAtual.getNome() + " cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("\n  Veiculos Disponiveis ");
                    System.out.println("CATEGORIA POPULAR:");
                    System.out.println("1. " + popular1.getModelo() + " (Porta-malas: " + popular1.getCapacidadePortamalas() + "L) - Diaria: R$" + popular1.getValorDiaria());
                    System.out.println("2. " + popular2.getModelo() + " (Porta-malas: " + popular2.getCapacidadePortamalas() + "L) - Diaria: R$" + popular2.getValorDiaria());

                    System.out.println("\n CATEGORIA LUXO:");
                    System.out.println("3. " + luxo1.getModelo() + " (Teto Solar: " + (luxo1.isTetoSolar() ? "Sim" : "Nao") + ") - Diaria: R$" + luxo1.getValorDiaria());
                    System.out.println("4. " + luxo2.getModelo() + " (Teto Solar: " + (luxo2.isTetoSolar() ? "Sim" : "Nao") + ") - Diaria: R$" + luxo2.getValorDiaria());
                    break;
                case 3:
                    if (clienteAtual == null) {
                        System.out.println("Erro. E necessario cadastrar um cliente primeiro!");
                        break;
                    }
                    System.out.println("\n Registrar Locacao ");
                    System.out.println("Qual categoria voce deseja consultar?");
                    System.out.println("1. Carros Populares");
                    System.out.println("2. Carros de Luxo");
                    System.out.print("Escolha: ");
                    int tipoCateg = teclado.nextInt();
                    teclado.nextLine();

                    Veiculo selecionado = null;

                    if (tipoCateg == 1) {
                        System.out.println("\n Carros Populares:");
                        System.out.println("1. " + popular1.getModelo() + " Diaria: " + popular1.getValorDiaria());
                        System.out.println("2. " + popular2.getModelo() + " Diaria: " + popular2.getValorDiaria());
                        System.out.print("Escolha o carro (1 ou 2): ");
                        int escPop = teclado.nextInt();
                        selecionado = (escPop == 1) ? popular1 : popular2;
                    } else if (tipoCateg == 2) {
                        System.out.println("\n Carros de Luxo: ");
                        System.out.println("1. " + luxo1.getModelo() + " Diaria: " + luxo1.getValorDiaria());
                        System.out.println("2. " + luxo2.getModelo() + " Diaria: " + luxo2.getValorDiaria());
                        System.out.print("Escolha o carro (1 ou 2): ");
                        int escLux = teclado.nextInt();
                        selecionado = (escLux == 1) ? luxo1 : luxo2;
                    }
                    if (selecionado != null) {
                        System.out.print("Quantidade de dias: ");
                        int diasLocacao = teclado.nextInt();
                        teclado.nextLine();
                       
                        ContratoLocacao contrato = new ContratoLocacao(selecionado, clienteAtual, diasLocacao, 0.0, "05/05/2026");     
                        
                        double totalValor = contrato.calcularValortt();
                        System.out.println("\nEscolha a Forma de Pagamento:");
                        System.out.println("1. Cartao de Credito");
                        System.out.println("2. Cartao de Debito");
                        System.out.print("Opcao: ");
                        int opPag = teclado.nextInt();
                        teclado.nextLine();

                        if (opPag == 1) {
                            clienteAtual.setFormaPagamento("Credito");
                        } else if (opPag == 2) {
                            clienteAtual.setFormaPagamento("Debito");
                        } else {
                            clienteAtual.setFormaPagamento("Nao definido");
                        }
                        System.out.println("\n DADOS DA LOCACAO ");
                        System.out.println("Locatario: " + clienteAtual.getNome());
                        System.out.println("Veiculo: " + selecionado.getMarca() + "," + selecionado.getModelo());
                        System.out.println("Motor: " + selecionado.getMotor().getCavalos() + " Cavalos" + ", Combustivel: " + selecionado.getMotor().getTipoCombustivel());
                        if (selecionado instanceof CategLuxo) {
                            CategLuxo luxo = (CategLuxo) selecionado;
                            System.out.println("Teto Solar: " + (luxo.isTetoSolar() ? "Sim" : "Nao"));
                        } else if (selecionado instanceof CategPopular) {
                            CategPopular pop = (CategPopular) selecionado;
                            System.out.println("Porta-malas: " + pop.getCapacidadePortamalas() + " Litros");
                        }
                        System.out.println("Tempo: " + diasLocacao + " dias");
                        System.out.println("Data: "+contrato.getData());
                        System.out.println("VALOR TOTAL:  " + totalValor);
                        System.out.println("Forma de Pagamento: " + clienteAtual.getFormaPagamento());
                    } else {
                        System.out.println("Erro. escolha invalida!!.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
        teclado.close();
    }
}
