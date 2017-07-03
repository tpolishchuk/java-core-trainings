package zhenya.workshop_12.task_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlightCenter implements Runnable {

    static BufferedReader in;
    static int quit = 0;

    public void run() {
        String msg = null;
        while (true) {
            try {
                msg = in.readLine();
            } catch (Exception e) {
            }

            if (msg.equals("R")) {
                quit = 1;
                break;
            }
        }
    }

    public static void main(String args[]) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));

        Thread t1 = new Thread(new FlightCenter());
        t1.start();

        Satellite satellite = new Satellite("Mir");
        satellite.start();

        while (true) {
            t1.sleep(1000);
            if (quit == 1) {
                satellite.backToEarth();
                break;
            }
            satellite.randomMoveSatellite();
            // satellite.getCoordinates();
        }
    }
}
