import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o limite do Cartão.");
        double limite = s.nextDouble();

        var cartao = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da compra");
            String compra = s.next();
            System.out.println("Digite o valor da compra");
            double valor = s.nextDouble();

            Compra compras = new Compra(compra, valor);

            boolean comprasRealizadas = cartao.lancaCompra(compras);
            if (comprasRealizadas){
                System.out.println("Compra realizada");
                System.out.println("seu saldo atual e de " + cartao.getSaldo());
                System.out.println("Digite 0 para poder sair ou 1 para continuar");
                sair = s.nextInt();
            }else{
                System.out.println("Saldo Insuficiente");
                sair = 0;
            }
        }

        System.out.println("************************");
        System.out.println("Compras Realizadas");
        Collections.sort(cartao.getCompras());
        for (Compra c: cartao.getCompras()) {

            System.out.println(c.getDiscricao() + "-" + c.getValor());
        }
        System.out.println("Saldo atual = " + cartao.getSaldo());

        System.out.println("************************");

    }
}