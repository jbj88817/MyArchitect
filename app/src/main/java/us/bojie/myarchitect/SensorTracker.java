package us.bojie.myarchitect;

/**
 * Created by bojiejiang on 7/16/17.
 */
public class SensorTracker {

    private OnSensorChangedListener listener;

    interface OnSensorChangedListener {
        void onSensorChanged(SensorEntity sensorEntity);
    }

    public void startSensor(OnSensorChangedListener listener) {
        this.listener = listener;
    }

    public void stopSensor() {

    }

    public static class SensorEntity {
        public long timestamp;
        public float[] values;
    }
}
