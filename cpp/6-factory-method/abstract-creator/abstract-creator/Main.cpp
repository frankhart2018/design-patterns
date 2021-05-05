#include <iostream>

#include "abstractshapefactory.h"
#include "creator.h"

int main() {
	// Get an object of circle and call its draw method
	CircleFactory circleFactory;
	Shape* shape1 = circleFactory.getShape();
	shape1->draw();

	// Get an object of rectangle and call its draw method
	RectangleFactory rectangleFactory;
	Shape* shape2 = rectangleFactory.getShape();
	shape2->draw();

	// Get an object of circle and call its draw method
	SquareFactory squareFactory;
	Shape* shape3 = squareFactory.getShape();
	shape3->draw();

	return 0;
}