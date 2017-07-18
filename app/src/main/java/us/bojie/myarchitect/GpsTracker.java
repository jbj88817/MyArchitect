package us.bojie.myarchitect;

/**
 * Created by bojiejiang on 7/16/17.
 */
public class GpsTracker {

    private OnGpsChangedListener listener;

    interface OnGpsChangedListener {
        void onGpsChanged(GpsEntity gpsEntity);
    }

    public void startLocation(OnGpsChangedListener listener) {
        this.listener = listener;
    }

    public void stopLocation() {

    }

    public static class GpsEntity {
        public long timestamp;
        public double latitude;
        public double longitude;
    }
}
