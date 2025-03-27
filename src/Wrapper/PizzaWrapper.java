package Wrapper;

public abstract class PizzaWrapper implements IPizza {
    protected IPizza pizza;
    public PizzaWrapper(IPizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String info() {
        return pizza.info();
    }
}
