package thanh.ha.gifted.constants;

/**
 * Created by HaVan on 5/24/2017.
 */

public class Globals {
    private static Globals ourInstance = null;

    public static Globals getIns() {
        if (ourInstance == null) {
            ourInstance = new Globals();
        }
        return ourInstance;
    }


    private Globals() {
    }

}
