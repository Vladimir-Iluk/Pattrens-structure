package Wrapper;

public class PeperoniWrapper extends PizzaWrapper {
    public PeperoniWrapper(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String info() {
        return pizza.info() + "  Peperoni";
    }

}
