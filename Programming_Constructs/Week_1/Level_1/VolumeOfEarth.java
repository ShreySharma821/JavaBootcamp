public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusINKm=6378;
        double radiusINmiles=radiusKm*1.6;
        double volume1=(4/3)*3.14* Math.pow(radiusINKm, 3);
        double volume2=(4/3)*3.14* Math.pow(radiusINmiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volume1 + " and cubic miles " + volume2);
                
}
}
