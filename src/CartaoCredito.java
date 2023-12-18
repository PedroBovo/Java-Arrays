import java.util.ArrayList;
import java.util.List;

public class CartaoCredito  {
    private double valor;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double valor) {
        this.valor = valor;
        this.saldo = valor;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;

        }
        return false;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }



}
