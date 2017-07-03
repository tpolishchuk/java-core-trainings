package zhenya.workshop_12.task_2;

import java.util.Random;

public class Satellite {
    private String name;

    protected Satellite() {
    }

    protected Satellite(String name) {
        this.name = name;
    }

    private class Coordinates {
        Double elevation = 0.0;
        Double azimuth = 0.0;

        private void setElevation(Double elevation) {
            this.elevation = elevation;
        }

        private void setAzimuth(Double azimuth) {
            this.azimuth = azimuth;
        }

        private Double getElevation() {
            return elevation;
        }

        private Double getAzimuth() {
            return azimuth;
        }
    }

    private Coordinates coordinates = new Coordinates();

    private Coordinates getCoordinates() {
        return coordinates;
    }

    private void setCoordinates(Double elevation, Double azimuth) {
        getCoordinates().setElevation(elevation);
        getCoordinates().setAzimuth(azimuth);
    }

    protected void start() {
        System.out.println("Launching " + this.name);
        System.out.println("Press R THEN ENTER when you want sent " + this.name + " back to Earch");
    }

    protected void randomMoveSatellite() {
        Random r = new Random();

        Double newElevation = getCoordinates().getElevation() + r.nextDouble();
        Double newAzimuth = getCoordinates().getAzimuth() + r.nextDouble();

        setCoordinates(newElevation, newAzimuth);

        System.out.println("Coordinates were changed: " + getCoordinates().getElevation() +
                           "; " + getCoordinates().getAzimuth());
    }

    protected void backToEarth() {
        System.out.println("Preparing to return " + this.name + " to Earth");
    }
}
