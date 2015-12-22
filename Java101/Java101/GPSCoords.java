

public class GPSCoords {

    private double lat;
    private double lon;

    public GPSCoords(double _lat, double _lon) {
        lat = _lat;
        lon = _lon;
    }

    public String formatString() {
        return lat + ", " + (-lon);
    }
}









