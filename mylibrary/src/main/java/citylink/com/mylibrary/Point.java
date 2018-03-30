package citylink.com.mylibrary;

/**
 * Created by Amritesh Sinha on 3/30/2018.
 */

/**
 * Representation of a Latitude/Longitude pair Point in the map.
 */
public class Point {
    float mLatitude;
    float mLongitude;

    public Point(float latitude, float longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public float getLongitude() {
        return mLongitude;
    }
}