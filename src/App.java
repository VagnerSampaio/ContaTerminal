import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = (double) 2000;

        System.out.print("Por favor, digite seu número da conta: ");
        numero = sc.nextInt();
        System.out.print("Por favor, digite sua agência: ");
        agencia = sc.next();
        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = sc.next();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nossa banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque.");
        } catch (InputMismatchException e){
            System.err.println("O número da conta precisa ser do tipo inteiro.");
        }
    }
}