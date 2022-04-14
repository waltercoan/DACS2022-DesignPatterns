package observer;

public class Cliente {
    public static void main(String[] args) {
        Publisher jovemnerd = new Publisher();

        Subscriber zezinho = new ConcreteSubscriber();
        Subscriber luizinho = new ConcreteSubscriber();
        Subscriber huguinho = new ConcreteSubscriber();

        jovemnerd.subscribe(zezinho);
        jovemnerd.subscribe(luizinho);
        jovemnerd.subscribe(huguinho);

        jovemnerd.setMainState("Nos vendemos pra magalu");
        jovemnerd.notifySubscribers();

    }

}
