public class SterownikRolet {

    public static void rolety(Weather weather){
        if (weather.getWeatherDescription().equals("słonecznie")){
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        } else{
            System.out.println("Nie jest słonecznie. Nie zasłaniam rolet.");
        }
    }
}
