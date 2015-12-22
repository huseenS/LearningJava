

public class GPSProgram {

    public static void main(String[] args) {
        GPSReader gpsr = new GPSReader();
        gpsr.readGPSFile("gpsdata.txt");
        gpsr.dumpCoordinates();
    }
}
















