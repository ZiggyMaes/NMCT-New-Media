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

public class Oef4 extends PApplet {

int[] drawCcolors = {0xff000000, 0xffE9D32F, 0xffD1A72C, 0xff42919F, 0xffFE3830, 0xff284253, 0xff102C38, 0xff0E1B2E, 0xff152535};
int currentColorIndex;

public void setup() {
	
}

public void draw() {

	if (mouseButton == LEFT) 
  	{
  		stroke(drawCcolors[currentColorIndex]);
  		line(pmouseX, pmouseY, mouseX, mouseY);
  	}
}


public void keyPressed() {
	if (keyPressed) 
	{
		if (key == 'r' || key == 'R') currentColorIndex = 0;
	}

	  if (key == CODED) 
	  {
		if (keyCode == LEFT)
		{
  			if(currentColorIndex == 0) PApplet.parseInt(drawCcolors.length - 1);
  			else currentColorIndex--;
		}
		else if (keyCode == RIGHT)
		{
  			if(currentColorIndex + 1 == PApplet.parseInt(drawCcolors.length)) currentColorIndex = 0;
  			else currentColorIndex++;
		}
	}
}
  public void settings() { 	size(1800, 1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
