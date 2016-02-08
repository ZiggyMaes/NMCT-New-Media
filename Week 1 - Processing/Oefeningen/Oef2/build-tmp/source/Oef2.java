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

public class Oef2 extends PApplet {

public void setup() {
	
	background(0xffEEEEF0);
}

public void draw() {

	noStroke();

	fill(0xff3C1651);
	ellipse(150, 150, 200, 200);

	fill(0xff3C1651);
	arc(400, 150, 200, 200, 0, PI+QUARTER_PI);

	fill(0xff3C1651);
	arc(650, 150, 200, 200, 0, 0.6f);
	fill(0xff5C3E6D);
	arc(650, 150, 200, 200, 0.6f, 1.25f);
	fill(0xff7B6188);
	arc(650, 150, 200, 200, 1.25f, PI);
	fill(0xff9A86A3);
	arc(650, 150, 200, 200, PI, 4);
	fill(0xffBAACC2);
	arc(650, 150, 200, 200, 4, TWO_PI);
}
  public void settings() { 	size(800, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
