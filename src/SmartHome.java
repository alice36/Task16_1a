public class SmartHome {
    public void smartHome(){
        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
        Weather weather = stacjaPogodowa.showWeather();

        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika();
        sterownikGlosnika.showInfo(weather);

        SterownikPieca sterownikPieca = new SterownikPieca();
        sterownikPieca.piec(weather);

        SterownikRolet sterownikRolet = new SterownikRolet();
        sterownikRolet.rolety(weather);
    }
}
