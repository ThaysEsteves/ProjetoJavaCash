import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float saldo = 0;
        Scanner leitura = new Scanner(System.in);
        String contaTipo = "Corrente";
        String entrada = String.format("""
                ******************************
                *Bem-vindo ao banco JavaCash**
                *Nome do cliente: Thays silva*
                *Saldo em conta:R$%f   *
                *Tipo de conta: %s     *
                ******************************
                """, saldo, contaTipo);
        System.out.println(entrada);

        int operaçoes = 0;
        while (operaçoes != 4) {

            String escolha;
            escolha = """
                    Escolha a operação desejada:
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4-Sair""";
            System.out.println(escolha);
                operaçoes = leitura.nextInt();

            if (operaçoes == 1){
                System.out.println("Saldo em conta é: R$"+ saldo);
            }if (operaçoes == 2){
                System.out.println("Valor a receber: R$ ");
                float receber = leitura.nextInt();
                if (receber < 0){
                    System.out.println("Valor inválido, tente novamente!");
                }else{
                saldo = receber + saldo;
                System.out.println("saldo atual: R$ " + saldo);}
            }if (operaçoes == 3 ){
                System.out.println("Quanto deseja transferir? R$");
                float transferir = leitura.nextInt();
                if (saldo < transferir){
                    System.out.println("Valor superior ao disponível em conta!");
                }else{
                    saldo = saldo - transferir;
                    System.out.println("saldo atual: R$ " + saldo);
                }
            }if (operaçoes <1 || operaçoes > 4){
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}