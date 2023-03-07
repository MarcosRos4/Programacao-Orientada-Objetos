package contacorrentepackage;
import java.util.Scanner;

public class AppContaCorrente{

    public static void main(String[] args) {

    Agencia agencia1 = new Agencia();
    agencia1.setidAgencia("1234");
    agencia1.setnomeAgencia("Agencia do Marcos");

    ContaCorrente corrente1 = new ContaCorrente();
    corrente1.setnumeroConta("6969");
    corrente1.setsaldoConta(12355);
    
    Agencia agencia2 = new Agencia();
    agencia2.setidAgencia("0987");
    agencia2.setnomeAgencia("Agencia do Thomas");

    ContaCorrente corrente2 = new ContaCorrente();
    corrente2.setnumeroConta("4567");
    corrente2.setsaldoConta(1238955);
    
    ContaCorrente[] contas = {corrente1, corrente2};

    Agencia[] agencias = {agencia1, agencia2};

    String a; String c; String o="f";

    try (Scanner sc = new Scanner(System.in)) {
        
        do {

            System.out.print("Informe o Número da Agência e da Conta:\nAgência: ");

            a = sc.next();
            System.out.print("Conta: ");
            c = sc.next();
            
        } while (procurar(a, c, agencias, contas) == false);
        
        do {
            System.out.print("Informe a próxima ação desejada:\nConsulta de Saldo = C\nDepósito = D\nSaque = S\nEncerrar = E\nOpção: ");
            o = sc.next().toLowerCase();
            switch (o) {
                case "c":
                    consulta(c, contas);
                    break;
                
                case "d":
                    System.out.print("Informe um valor a ser Depositado: ");
                    float v = sc.nextFloat();
                    deposito(c, contas, v);
                    break;
                
                case "s":
                    System.out.print("Informe um valor a ser Sacado: ");
                    float s = sc.nextFloat();
                    saque(c, contas, s);
                    break;
                
                case "e":
                    System.out.println("Programa Encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (o.equals("e") == false);
    }
}

    public static boolean procurar(String ag, String co, Agencia[] obj, ContaCorrente[] abj) {

        for (int i = 0; i < 2; i++) {
            if (obj[i].getidAgencia().equals(ag) && abj[i].getnumeroConta().equals(co)) {
                System.out.println("Dados Encontrados!");
                return true;
            }
        }
        System.out.println("Agência ou conta não encontrada!");
        return false;
    }

    public static void consulta(String co, ContaCorrente[] coArray) {
        for (int i = 0; i < 2; i++) {
            if (coArray[i].getnumeroConta().equals(co) == true) {
                System.out.println(coArray[i].getsaldoConta());
            }
        }
    }

    public static void deposito(String co, ContaCorrente[] coArray, float v) {
        for (int i = 0; i < 2; i++) {
            if (coArray[i].getnumeroConta().equals(co) == true) {
                coArray[i].setsaldoConta(coArray[i].getsaldoConta() + v);
            }
        }
    }

    public static void saque(String co, ContaCorrente[] coArray, float v) {
        for (int i = 0; i < 2; i++) {
            if (coArray[i].getnumeroConta().equals(co) == true) {
                coArray[i].setsaldoConta(coArray[i].getsaldoConta() - v);
            }
        }
    }

}


