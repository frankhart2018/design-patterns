#include <iostream>

#include "shapefactory.h"
#include "creator.h"

int main() {
	ShapeFactory shapeFactory;

	// Get an object of Circle and call its draw method
	Shape *shape1 = shapeFactory.getShape("CIRCLE");
	shape1->draw();

	// Get an object of Rectangle and call its draw method
	Shape *shape2 = shapeFactory.getShape("RECTANGLE");
	shape2->draw();

	// Get an object of Square and call its draw method
	Shape *shape3 = shapeFactory.getShape("SQUARE");
	shape3->draw();

	return 0;
}