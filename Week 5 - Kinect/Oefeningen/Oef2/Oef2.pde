import SimpleOpenNI.*;

SimpleOpenNI kinect;

void setup() {
	size(1300, 600);
	kinect = new SimpleOpenNI(this);

	kinect.enableDepth();
	kinect.enableRGB();
}

void draw() {
	kinect.update();

	image(kinect.depthImage(), 0, 0);
	image(kinect.rgbImage(), 660, 0);
}

void mouseClicked() {
	int[] distance = kinect.depthMap();

	int mousePos = mouseX + (mouseY * width);

	fill(50);
	text("Distance: " + distance[mousePos] + "mm", 600, 550);
}