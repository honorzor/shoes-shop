package announcer;

public class Announcer implements Announce {

    @Override
    public void info(Object object) {
        System.out.println(object);
    }
}
