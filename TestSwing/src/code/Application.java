package code; /**
 * Created by deanto on 27.12.13.
 */

public class Application {
    public void init() {
    }

    public void run() {
        threeWindows.Show();
        int t=0;
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.run();
    }


}
