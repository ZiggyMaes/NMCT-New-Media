import com.onformative.leap.*;
import com.leapmotion.leap.*;

LeapMotionP5 leap;
ArrayList<Hand> hands = new ArrayList<Hand>();

void setup() {
	size(1920, 1200, P3D);
	noFill();

	leap = new LeapMotionP5(this);
}

void draw() {
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
		rotateX(radians(yaw));
		rotateY(radians(pitch));
		rotateZ(radians(roll));
		sphere(size);

		textFont(createFont("Verdana", 40));
	  	text(h.toString(), 150, 0);

		popMatrix();


	}

	 //Hand currentHand = getHand();
}