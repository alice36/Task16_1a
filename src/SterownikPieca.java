public class SterownikPieca {
    public void piec(Weather weather){
        if (weather.getTemperature()< 15){
            System.out.println("Jest zimno. Uruchamiam piec.");
        } else{
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
        }
    }
}
