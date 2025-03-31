package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static Map<String, Developer> developerType = new HashMap<>();
    public Developer getDeveloper(String type) {
        Developer developer = developerType.get(type);
        if (developer == null) {
            switch (type) {
                case "Java":
                    System.out.println("new Java Developer");
                    developer = new JavaDeveloper();
                    break;
                case "Cpp":
                    System.out.println("new Cpp Developer");
                    developer = new CppDeveloper();
                    break;
                default:
                     System.out.println("Error");
                     break;

            }
            developerType.put(type, developer);
        }
        return developer;
    }
}
