import gab.opencv.*;
import processing.video.*;
import java.awt.*;

Capture webcam;
OpenCV cv;

void setup() {
	webcam = new Capture(this, width, height);
	cv = new OpenCV(this, width, height);

	size(1280, 720);

	webcam.start();

	cv.loadCascade(OpenCV.CASCADE_FRONTALFACE);
}

void draw() {
	image(webcam, 0, 0);
		stroke(#FF0000);
	strokeWeight(3);

	cv.loadImage(webcam);
	Rectangle[] faces = cv.detect();
	for(int i=0;i < faces.length; i++)
	{
		rect(faces[i].x, faces[i].y, faces[i].width, faces[i].height);
	}
}

void captureEvent(Capture c)
{
	c.read();
}