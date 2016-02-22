import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import gab.opencv.*; 
import processing.video.*; 
import java.awt.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Oef3 extends PApplet {





Capture webcam;
OpenCV cv;

public void setup() {
	webcam = new Capture(this, width, height);
	cv = new OpenCV(this, width, height);

	

	webcam.start();

	cv.loadCascade(OpenCV.CASCADE_FRONTALFACE);
}

public void draw() {
	image(webcam, 0, 0);
		stroke(0xffFF0000);
	strokeWeight(3);

	cv.loadImage(webcam);
	Rectangle[] faces = cv.detect();
	for(int i=0;i < faces.length; i++)
	{
		rect(faces[i].x, faces[i].y, faces[i].width, faces[i].height);
	}
}

public void captureEvent(Capture c)
{
	c.read();
}
  public void settings() { 	size(1280, 720); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
