package composite;

public class Cliente {
    public static void main(String[] args) {
        Composite embalagemIphone13 = new Composite();
        Telefone iPhone13 = new Telefone();
        embalagemIphone13.add(iPhone13);

        Composite embalagemMotoG = new Composite();
        Telefone motoG = new Telefone();
        Carregador carregador = new Carregador();
        embalagemMotoG.add(motoG);
        embalagemMotoG.add(carregador);

        Composite promocao = new Composite();
        promocao.add(embalagemIphone13);
        promocao.add(embalagemMotoG);
        System.out.println();
    }
}
