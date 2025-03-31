package Proxy_pattern;

public class ProxyRunner implements Application {
    private String url;
    private AppRunner runner;
    public ProxyRunner(String url) {
        this.url = url;
    }
    @Override
    public void run() {
        System.out.println("Proxy runner started");
        if(runner == null) {
            runner = new AppRunner(url);
        }
        runner.run();
    }
}
