#include <iostream>

#include "color.h"
#include "shape.h"
#include "abstractfactory.h"
#include "factoryproducer.h"

int main() {
	// Get shape factory
	AbstractFactory* shapeFactory = FactoryProducer::getFactory("SHAPE");

	// Get an object of shape Circle
	Shape* shape1 = shapeFactory->getShape("CIRCLE");
	shape1->draw();

	// Get an object of shape Rectangle
	Shape* shape2 = shapeFactory->getShape("RECTANGLE");
	shape2->draw();

	// Get an object of shape Square
	Shape* shape3 = shapeFactory->getShape("SQUARE");
	shape3->draw();

	// Get color factory
	AbstractFactory* colorFactory = FactoryProducer::getFactory("COLOR");

	// Get an object of color Red
	Color* color1 = colorFactory->getColor("RED");
	color1->fill();

	// Get an object of color Green
	Color* color2 = colorFactory->getColor("GREEN");
	color2->fill();

	// Get an object of color Blue
	Color* color3 = colorFactory->getColor("BLUE");
	color3->fill();

	return 0;
}