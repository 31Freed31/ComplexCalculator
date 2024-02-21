import core.logger.*;
import core.*;


public class Main {
    public static void main(String[] args) {

        View view = new View(new LoggerTxt("log.txt"));
        view.run();

    }
}