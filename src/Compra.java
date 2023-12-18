public class Compra implements Comparable<Compra> {
    private String discricao;
    private double valor;

    public Compra(String discricao, double valor) {
        this.discricao = discricao;
        this.valor = valor;
    }

    public String getDiscricao() {
        return discricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "discricao='" + discricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
