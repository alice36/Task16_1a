public class SmartHome {
    public static void smartHome(){
        Weather weather = StacjaPogodowa.showWeather();
        SterownikGlosnika.showInfo(weather);
        SterownikPieca.piec(weather);
        SterownikRolet.rolety(weather);
    }
}
