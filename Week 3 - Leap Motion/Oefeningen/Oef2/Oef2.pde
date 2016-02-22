import com.onformative.leap.*;
import com.leapmotion.leap.*;

LeapMotionP5 leap;

void setup() {
	size(1920, 1080, P3D);
	noFill();

	leap = new LeapMotionP5(this);
}

void draw() {
	background(0);

	int i = 1;
	for(Finger f : leap.getFingerList())
	{
		PVector pos = leap.getTip(f);

		fill(255, 0, 0);
		ellipse(pos.x, pos.y, 10, 10);
		text("" + i, pos.x, pos.y, 100, 100);
		i++;
	}
}