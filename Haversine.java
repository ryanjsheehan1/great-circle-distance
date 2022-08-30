/**
 * The haversine formula determines the great-circle distance between two points
 * on a sphere given their longitudes and latitudes. Important in navigation,
 * it is a special case of a more general formula in spherical trigonometry,
 * the law of haversines, that relates the sides and angles of spherical triangles.
 */

public class Haversine {
    /**
     * The greatCircleDistance method prints the great-circle distance between
     * two points on a sphere given their longitudes and latitudes as arguments.
     *
     * @param lat1 the latitude of point 1
     * @param lon1 the longitude of point 1
     * @param lat2 the latitude of point 2
     * @param lon2 the longitude of point 2
     * @return the great-circle distance between point 1 and point 2
     */

    public static double greatCircleDistance(double lat1, double lon1,
                                             double lat2, double lon2) {
        // Mean radius of earth (km)
        final double R = 6371.0;

        // Distance between latitude and longitude in radians
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // Convert latitudes to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // Apply Haversine formula;
        double a = Math.pow(Math.sin(dLat / 2.0), 2.0) +
                Math.pow(Math.sin(dLon / 2.0), 2.0) *
                        Math.cos(lat1) * Math.cos(lat2);

        double c = 2.0 * Math.asin(Math.sqrt(a));
        return c * R;
    }

    public static void main(String[] args) {
        double lat1 = Double.parseDouble(args[0]);
        double lon1 = Double.parseDouble(args[1]);
        double lat2 = Double.parseDouble(args[2]);
        double lon2 = Double.parseDouble(args[3]);

        System.out.println(greatCircleDistance(lat1, lon1, lat2, lon2) + " km");
    }
}
