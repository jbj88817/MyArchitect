package us.bojie.myarchitect;

/**
 * Created by bojiejiang on 7/16/17.
 */
public class TripTracker implements GpsTracker.OnGpsChangedListener, SensorTracker.OnSensorChangedListener {
    private GpsTracker mGpsTracker;
    private SensorTracker mSensorTracker;
    private TripWriter mTripWriter;
    private TripSettings mSettings;

    public TripTracker(TripSettings settings) {
        mSettings = settings;
    }

    public void startTracker() {
        mTripWriter = new TripWriter();


        mGpsTracker = new GpsTracker();
        mGpsTracker.startLocation(this);

        mSensorTracker = new SensorTracker();
        mSensorTracker.startSensor(this);
    }

    public void stopTracker() {
        mGpsTracker.stopLocation();
        mSensorTracker.stopSensor();
        mTripWriter.close();
    }

    @Override
    public void onGpsChanged(GpsTracker.GpsEntity gpsEntity) {
        mTripWriter.onGpsChanged(gpsEntity);
    }

    @Override
    public void onSensorChanged(SensorTracker.SensorEntity sensorEntity) {
        mTripWriter.onSensorChanged(sensorEntity);
    }
}
