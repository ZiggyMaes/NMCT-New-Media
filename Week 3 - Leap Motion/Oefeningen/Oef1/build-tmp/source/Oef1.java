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

public class Oef1 extends PApplet {




LeapMotionP5 leap;
ArrayList<Hand> hands = new ArrayList<Hand>();

public void setup() {
	
	noFill();

	leap = new LeapMotionP5(this);
}

public void draw() {
	background(0);

	hands = leap.getHandList();

	for (Hand h : hands) 
	{
		PVector pos = leap.getPosition(h);
		float pitch = leap.getPitch(h);
		float yaw = leap.getYaw(h);
		float roll = leap.getRoll(h);
		float size = leap.getSphereRadius(h);

		fill(0, 255, 0); //green

		pushMatrix();

		translate(pos.x, pos.y);
		rotateX(radians(pitch));
		rotateY(radians(yaw));
		rotateZ(radians(roll));
		sphere(size);

		textFont(createFont("Verdana", 40));
	  	text(h.toString(), 150, 0);

		popMatrix();


	}

	 //Hand currentHand = getHand();
}
  public void settings() { 	size(1920, 1200, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
