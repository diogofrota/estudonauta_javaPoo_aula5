import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("sistema do banco x");
        System.out.println("------------------");
        System.out.println("1-abrir conta");
        System.out.println("2-fazer deposito");
        System.out.println("3-fazer um saque");
        System.out.println("4-verificar saldo");
        System.out.println("-----------------");
        System.out.print("Escolha uma opcão: ");
        String op = sc.next();

        switch (op) {
            case "1":
                System.out.println("voce abriu uma conta");
                Conta cliente =  new Conta();
                cliente.numConta = 1;
                cliente.tipo = "CC";
                String dono;
                cliente.setDono(dono);
                break;
            case "2":
                System.out.println("Voce vai fazer um deposito");
                break;
            case "3":
                System.out.println("Voce vai fazer um saque");

                break;
            case "4":
                System.out.println("Voce vai verificar o saldo;");
            default:
                System.out.println("Escolha uma opcao correta");
        }

        sc.close();


    }
}