import controlP5.*;

ControlP5 cp5;
Slider slRadius, slStretch, slWeight;
Knob knAngle;
Button btnSave;

double theta = 1;
float prevValAngle, prevValWeight, prevValStretch, prevValRadius;

void setup() {
	size(1600,1000);
	background(#80bfff);

	cp5 = new ControlP5(this);

 	slRadius = cp5.addSlider("radius").setPosition(10,10).setSize(150,30).setRange(0,3);
 	slStretch = cp5.addSlider("stretch").setPosition(10,50).setSize(150,30).setRange(0,10);
 	slWeight = cp5.addSlider("weight").setPosition(10,90).setSize(150,30).setRange(5,20);
  
  	knAngle = cp5.addKnob("angle").setRange(150,1000).setPosition(10,150);

  	btnSave = cp5.addButton("btnSave", 0, 200, 600, 120, 20);
}

void draw() 
{
	noStroke();
	drawSpiral();
}

void drawSpiral() {
    if ((knAngle.getValue() != prevValAngle) || (slWeight.getValue() != prevValWeight) || (slStretch.getValue() != prevValStretch) || (slRadius.getValue() != prevValRadius)) {
        theta = 1;
        background(#FEF4E9);
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