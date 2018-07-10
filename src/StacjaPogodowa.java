import java.util.Random;

public class StacjaPogodowa {
    public static Weather showWeather(){
        int temperature;
        String weatherDescription;
        Random rand = new Random();

        temperature = rand.nextInt(35) - 25;
        weatherDescription = desc(temperature);
        Weather weather = new Weather(temperature,weatherDescription);
        return weather;
    }

    public static String desc(int temp){
        String description;

        if (temp>20) {
            description = "słonecznie";
        } else{
            description = "pochmurnie";
        }
        return description;
    }

}
