package Facade_pattern;

public class FacadeApp {
    private Application app;
    private Bd bd;
    private Something something;
    public FacadeApp() {
        this.app = new Application();
        this.bd = new Bd() ;
        this.something = new Something();
    }
    public void startApp(){
        System.out.println("Application started");
        app.openApp();
        bd.connectBd();
        something.connectSomething();
    }
}
