#include <iostream>

#include "shapefactory.h"
#include "creator.h"

int main() {
	// Get an object of Circle and call its draw method
	Shape* shape1 = ShapeFactory::getShape("CIRCLE");
	shape1->draw();

	// Get an object of Rectangle and call its draw method
	Shape* shape2 = ShapeFactory::getShape("RECTANGLE");
	shape2->draw();

	// Get an object of Square and call its draw method
	Shape* shape3 = ShapeFactory::getShape("SQUARE");
	shape3->draw();

	return 0;
}