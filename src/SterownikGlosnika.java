public class SterownikGlosnika {
    public void showInfo(Weather weather){
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + weather.getTemperature() + "*C i jest " + weather.getWeatherDescription()
                + ". To będzie dobry dzień!");
    }
}
