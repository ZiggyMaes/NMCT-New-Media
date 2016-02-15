import com.onformative.yahooweather.*;


YahooWeather yahooWeatherAPI;
int[] WOEID = {972288, 753692, 1339615};
PImage condition;

void setup() {
	size(400, 250);

	yahooWeatherAPI = new YahooWeather(this, WOEID[1], "c", 10000);

	updateWeather();
}

void updateWeather()
{
	int temperature = yahooWeatherAPI.getTemperature();
	String cityName = yahooWeatherAPI.getCityName();

	background(100+temperature, 160, 255-temperature);

	condition = loadImage("condition/" + yahooWeatherAPI.getWeatherConditionCode() + ".png");
	image(condition, 15, 50);

	textSize(32);
	text(cityName, 150, 100);
	text(temperature + "°C", 150, 150);
}