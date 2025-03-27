package Adapter_pattern;

public class Usb implements IUsb {
    public void connect() {
        System.out.println("Connected to usb");
    }
}
