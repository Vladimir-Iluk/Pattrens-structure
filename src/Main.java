import Adapter_pattern.AdapterUsbToCard;
import Adapter_pattern.MemoryCard;
import Brdige_pattern.Color;
import Brdige_pattern.RedColor;
import Brdige_pattern.Triangle;
import Composit_pattern.Director;
import Composit_pattern.Manager;
import Composit_pattern.Worker;
import Facade_pattern.FacadeApp;
import Flyweight.Developer;
import Flyweight.DeveloperFactory;
import Proxy_pattern.AppRunner;
import Proxy_pattern.Application;
import Proxy_pattern.ProxyRunner;
import Wrapper.BasePizza;
import Wrapper.IPizza;
import Wrapper.PeperoniWrapper;

import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("Choose an option:");
                System.out.println("1. Adapter");
                System.out.println("2. Bridge");
                System.out.println("3. Composite");
                System.out.println("4. Wrapper");
                System.out.println("5. Facade");
                System.out.println("6. Flyweight");
                System.out.println("7. Proxy");
                System.out.println("Exit");
                String option = scanner.nextLine();
                switch (option){
                    case "Adapter":
                        AdapterUsbToCard adapter = new AdapterUsbToCard(new MemoryCard());
                        adapter.connect();
                        break;
                    case "Bridge":
                        RedColor red = new RedColor();
                        Triangle triangle = new Triangle(red);
                        triangle.info();
                        break;
                    case "Composite":
                        Worker worker = new Worker("worker", "position");
                        Worker worker1 = new Worker("worker1", "position1");
                        Worker worker2 = new Worker("worker2", "position2");
                        Manager manager = new Manager("manager1","position Manager1");
                        manager.addWorker(worker);
                        Manager manager2 = new Manager("manager2","position Manager2");
                        manager2.addWorker(worker1);
                        manager2.addWorker(worker2);
                        Director director = new Director("director1","position Director1");
                        director.addManager(manager);
                        director.addManager(manager2);
                        director.info();
                        break;
                    case "Wrapper":
                        IPizza pizza = new BasePizza();
                        pizza = new PeperoniWrapper(pizza);
                        System.out.println(pizza.info());
                        break;
                    case "Facade":
                        FacadeApp facadeApp = new FacadeApp();
                        facadeApp.startApp();
                        break;
                    case "Flyweight":
                        DeveloperFactory developerFactory = new DeveloperFactory();
                        List<Developer> developers = new ArrayList<>();
                        for (int i = 0; i < 5; i++) {
                            developers.add(developerFactory.getDeveloper("Java"));
                        }
                        for(int i =0; i < 5; i++) {
                            developers.add(developerFactory.getDeveloper("Cpp"));
                        }
                        for(Developer developer : developers) {
                            developer.writeCode();
                        }
                        break;
                    case "Proxy":
                        String url = "something url";
                        Application app = new ProxyRunner(url);
                        app.run();
                        break;
                    case "Exit":
                        running = false;
                        break;
                }
            }
        }
    }
}