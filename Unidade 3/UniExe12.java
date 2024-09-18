import java.util.Scanner;

public class UniExe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do funcionário?");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Qual é a quantidade de horas trabalhadas?");
        double horasFuncionario = scanner.nextDouble();

        System.out.println("Qual é a quantidade de dependentes?");
        int dependentesFuncionario = scanner.nextInt();

        double salarioTrabalho = horasFuncionario * 10.00;
        double salarioFamilia = dependentesFuncionario * 60;
        double descontoINSS  = (horasFuncionario * 10.00) * (8.5 / 100);
        double descontoIR  = (horasFuncionario * 10.00) * (5 / 100);
        double salarioLiquido = salarioTrabalho - descontoINSS - descontoIR;
        double salarioBruto = salarioFamilia + salarioTrabalho;

        System.out.println("O salário liquído do funcionário " + nomeFuncionario + " é igual a R$" + salarioLiquido + " e o salário bruto é igual a R$" + salarioBruto);

        scanner.close();
    }
}
