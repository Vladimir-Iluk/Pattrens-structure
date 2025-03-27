import Adapter_pattern.AdapterUsbToCard;
import Adapter_pattern.MemoryCard;
import Brdige_pattern.Color;
import Brdige_pattern.RedColor;
import Brdige_pattern.Triangle;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("Choose an option:");
                System.out.println("1. Adapter");
                System.out.println("2. Bridge");
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
                    case "Exit":
                        running = false;
                        break;
                }
            }
        }
    }
}