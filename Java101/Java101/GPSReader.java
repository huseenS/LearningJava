import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class GPSReader {

    ArrayList<GPSCoords> coords;

    public GPSReader() {
        coords = new ArrayList<GPSCoords>();
    }

    public void dumpCoordinates() {
        for (GPSCoords currentCoord : coords) {
            System.out.println(currentCoord.formatString());
        }
    }
   
    public void readGPSFile(String filename) {
        try {
            File inputFile = new File(filename);
            Scanner myScanner = new Scanner(inputFile);

            while (myScanner.hasNextLine()) {

                String line = myScanner.nextLine();
                if (line.substring(0, 6).equals("$GPGGA")) {
                    String[] tokens = line.split(",");
                    double stupidLat = Double.parseDouble(tokens[2]);
                    double stupidLon = Double.parseDouble(tokens[4]);

                    double lat = (int)(stupidLat / 100) + (stupidLat % 100) / 60;
                    double lon = (int)(stupidLon / 100) + (stupidLon % 100) / 60;

                    coords.add(new GPSCoords(lat, lon));
                }
            } // ends while
        } // end try
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e);
        }


    }


}
















