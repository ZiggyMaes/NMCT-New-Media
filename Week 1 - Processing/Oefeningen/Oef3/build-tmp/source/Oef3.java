import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Oef3 extends PApplet {

int diameter = 30;
int canvaswidth = 1800;
int canvasheight = 1000;
int[] randomColors = {0xffE9D32F, 0xffD1A72C, 0xff42919F, 0xffFE3830, 0xff284253, 0xff102C38, 0xff0E1B2E, 0xff152535};
int timer;

public void setup() 
{
	
	patern();
}

public void draw()
{
	if (millis() > timer + 1000) 
	{
		patern();
		timer = millis();
	}
}

public void patern()
{
	noStroke();

	for (int i = 40; i < canvasheight; i+=40)
	{
		drawElipseHorizontal(i);
	}
}

public void drawElipseHorizontal(int y)
{
	for (int i = 40; i < canvaswidth; i+=40) 
	{
		fill(RandomColor());
		ellipse(i, y, diameter, diameter);	
	}
}

public int RandomColor()
{	
	return randomColors[PApplet.parseInt(random(randomColors.length))];
}

  public void settings() { 	size(1800, 1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
