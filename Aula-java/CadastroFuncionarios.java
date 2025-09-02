import java.util.Scanner;

class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}

public class CadastroFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.println("Digite o salário de " + nome + ": ");
            double salario = sc.nextDouble();
            sc.nextLine(); 
            funcionarios[i] = new Funcionario(nome, salario);
        }

        System.out.println("\n--- Funcionários em ordem crescente de salário ---");
        ordenarPorSalario(funcionarios, true);
        mostrar(funcionarios);

       
        System.out.println("\n--- Funcionários em ordem decrescente de salário ---");
        ordenarPorSalario(funcionarios, false);
        mostrar(funcionarios);

        
        System.out.println("\n--- Funcionários em ordem alfabética ---");
        ordenarPorNome(funcionarios);
        mostrar(funcionarios);

        sc.close();
    }

    public static void ordenarPorSalario(Funcionario[] funcionarios, boolean crescente) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (crescente) {
                    if (funcionarios[j].salario > funcionarios[j + 1].salario) {
                        Funcionario temp = funcionarios[j];
                        funcionarios[j] = funcionarios[j + 1];
                        funcionarios[j + 1] = temp;
                    }
                } else {
                    if (funcionarios[j].salario < funcionarios[j + 1].salario) {
                        Funcionario temp = funcionarios[j];
                        funcionarios[j] = funcionarios[j + 1];
                        funcionarios[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void ordenarPorNome(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (funcionarios[j].nome.compareToIgnoreCase(funcionarios[j + 1].nome) > 0) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    
    public static void mostrar(Funcionario[] funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.nome + " | Salário: R$ " + f.salario);
        }
    }
}
