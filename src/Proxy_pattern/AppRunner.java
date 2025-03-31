package Proxy_pattern;

public class AppRunner implements Application {
    private String url;
    public AppRunner(String url) {
        this.url = url;
        load();

    }
    public void load(){
        System.out.println("Loading url: " + url);
    }
    @Override
    public void run() {
        System.out.println("Start app from " + url);
    }
}
