import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import com.onformative.yahooweather.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Oef1 extends PApplet {




YahooWeather yahooWeatherAPI;
int[] WOEID = {972288, 753692, 1339615};
PImage condition;

public void setup() {
	

	yahooWeatherAPI = new YahooWeather(this, WOEID[1], "c", 10000);

	updateWeather();
}

public void updateWeather()
{
	int temperature = yahooWeatherAPI.getTemperature();
	String cityName = yahooWeatherAPI.getCityName();

	background(100+temperature, 160, 255-temperature);

	condition = loadImage("condition/" + yahooWeatherAPI.getWeatherConditionCode() + ".png");
	image(condition, 15, 50);

	textSize(32);
	text(cityName, 150, 100);
	text(temperature + "\u00b0C", 150, 150);
}
  public void settings() { 	size(400, 250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
