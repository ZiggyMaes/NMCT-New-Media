import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Oef2 extends PApplet {



ControlP5 cp5;
Slider slRadius, slStretch, slWeight;
Knob knAngle;
Button btnSave;

double theta = 1;
float prevValAngle, prevValWeight, prevValStretch, prevValRadius;

public void setup() {
	
	background(0xff80bfff);

	cp5 = new ControlP5(this);

 	slRadius = cp5.addSlider("radius").setPosition(10,10).setSize(150,30).setRange(0,3);
 	slStretch = cp5.addSlider("stretch").setPosition(10,50).setSize(150,30).setRange(0,10);
 	slWeight = cp5.addSlider("weight").setPosition(10,90).setSize(150,30).setRange(5,20);
  
  	knAngle = cp5.addKnob("angle").setRange(150,1000).setPosition(10,150);

  	btnSave = cp5.addButton("btnSave", 0, 200, 600, 120, 20);
}

public void draw() 
{
	noStroke();
	drawSpiral();
}

public void drawSpiral() {
    if ((knAngle.getValue() != prevValAngle) || (slWeight.getValue() != prevValWeight) || (slStretch.getValue() != prevValStretch) || (slRadius.getValue() != prevValRadius)) {
        theta = 1;
        background(0xffFEF4E9);
        for(int i = 0; i < 128; i++) {
            fill(color(35,145,201));
 
            double r = slStretch.getValue() + slRadius.getValue() * theta;
            float x = (float)(r * Math.cos(theta));
            float y = (float)(r * Math.sin(theta));
 
            ellipse(x * 20 + 400, y * 20 + 300, slWeight.getValue(), slWeight.getValue());
 
            theta = theta + knAngle.getValue();
        }
 
        prevValAngle = knAngle.getValue();
    }
}

public void btnSave(int theValue)
{
	//volledig scherm printen: saveFrame();

	//Stuk v/h scherm printen: 
	PImage screenArea = get(150, 0, 1000, 1000);
	screenArea.save("output.png");
}
  public void settings() { 	size(1600,1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
