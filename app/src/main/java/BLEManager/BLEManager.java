package BLEManager;

/**
 * Created by iem on 20/10/2017.
 */

class BLEManager {
    private static final BLEManager ourInstance = new BLEManager();

    static BLEManager getInstance() {
        return ourInstance;
    }

    private BLEManager() {
    }
}
