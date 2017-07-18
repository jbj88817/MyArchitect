package us.bojie.myarchitect;

/**
 * Created by bojiejiang on 7/16/17.
 */
public class TripManager {

    private TripTracker mTracker;
    private static TripManager INSTANCE;
    private TripManager(){}

    public static TripManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TripManager();
        }

        return INSTANCE;
    }

    public void startTrip() {
        TripSettings settings = new TripSettings();
        mTracker = new TripTracker(settings);
        mTracker.startTracker();
    }

    public void stopTrip() {
        mTracker.stopTracker();
    }
}
