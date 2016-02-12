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

public class Oef6 extends PApplet {

PImage island;
int iHeight, iWidth;
float size = 500;

public void setup() {
	
	island = loadImage("img/island.png");
	imageMode(CENTER);
}

public void draw() {
	background(0xff80bfff);
	image(island, width/2, height/2, size, size);
}

public void mouseMoved() 
{
	float distance = dist(width/2, height/2, mouseX, mouseY);
  	float maxDistance = dist(0, 0, width/2, height/2);
  	size = map(distance, 0, maxDistance, height, 0);

}
  public void settings() { 	size(1600, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
