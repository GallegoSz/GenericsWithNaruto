import java.util.ArrayList;
import java.util.List;

class BolsaNinja<T> {
    private List<T> itens = new ArrayList<>();

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void imprimirItens() {
        System.out.println("Itens na bolsa:");
        for (T item : itens) {
            System.out.println("- " + item);
        }
    }
}

class Kunai {
    @Override
    public String toString() {
        return "Kunai";
    }
}

class Shuriken {
    @Override
    public String toString() {
        return "Shuriken";
    }
}

class Pergaminho {
    @Override
    public String toString() {
        return "Pergaminho";
    }
}

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsa = new BolsaNinja<>();

        bolsa.adicionarItem(new Kunai());
        bolsa.adicionarItem(new Shuriken());
        bolsa.adicionarItem(new Pergaminho());
        bolsa.adicionarItem(new Kunai());
        bolsa.adicionarItem("Poção Mágica");

        bolsa.imprimirItens();
    }
}



