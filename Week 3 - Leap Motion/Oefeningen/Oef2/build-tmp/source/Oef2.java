import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import com.onformative.leap.*; 
import com.leapmotion.leap.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Oef2 extends PApplet {




LeapMotionP5 leap;

public void setup() {
	
	noFill();

	leap = new LeapMotionP5(this);
}

public void draw() {
	background(0);

	int i = 1;
	for(Finger f : leap.getFingerList())
	{
		PVector pos = leap.getTip(f);

		fill(255, 0, 0);
		ellipse(pos.x, pos.y, 10, 10);
		text("" + i, pos.x, pos.y, 500, 500);
		i++;
	}
}
  public void settings() { 	size(1920, 1080, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
