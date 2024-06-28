package curso_programacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaMGS {
	private Map<String, Funcionario> funcionarios;
    private Scanner scanner;

    public SistemaMGS() {
        funcionarios = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarFuncionario() {
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Alergias: ");
        String alergias = scanner.nextLine();
        System.out.print("Problemas Médicos: ");
        String problemasMedicos = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Funcionario funcionario = new Funcionario(identificador, nome, alergias, problemasMedicos, telefone, email);
        funcionarios.put(identificador, funcionario);
    }

    public void exibirFuncionario() {
        System.out.print("Identificador do funcionário: ");
        String identificador = scanner.nextLine();
        Funcionario funcionario = funcionarios.get(identificador);
        if (funcionario != null) {
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void executar() {
        while (true) {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Exibir Funcionário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    exibirFuncionario();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        SistemaMGS sistema = new SistemaMGS();
        sistema.executar();
    }
}
	

