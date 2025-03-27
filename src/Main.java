import Adapter_pattern.AdapterUsbToCard;
import Adapter_pattern.MemoryCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("Choose an option:");
                System.out.println("1. Adapter");
                System.out.println("Exit");
                String option = scanner.nextLine();
                switch (option){
                    case "Adapter":
                        AdapterUsbToCard adapter = new AdapterUsbToCard(new MemoryCard());
                        adapter.connect();
                        break;
                    case "Exit":
                        running = false;
                        break;
                }
            }
        }
    }
}