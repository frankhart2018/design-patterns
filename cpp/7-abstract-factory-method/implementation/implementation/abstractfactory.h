#pragma once

#include "color.h"
#include "shape.h"
#include "helpers.h"

class AbstractFactory {
	// This is bad design because the classes that implement this abstract class
	// will only care about one of them, but it will have to implement both
public:
	virtual Color* getColor(std::string color) = 0;
	virtual Shape *getShape(std::string shape) = 0;
};

class ShapeFactory : public AbstractFactory {
public:
	Color *getColor(std::string color) {
		return NULL;
	}

	Shape *getShape(std::string shape) {
		if (shape.empty()) {
			return NULL;
		}
		else if (equalsIgnoreCase(shape, "SQUARE")) {
			Square *square = new Square;
			return square;
		}
		else if (equalsIgnoreCase(shape, "RECTANGLE")) {
			Rectangle *rectangle = new Rectangle;
			return rectangle;
		}
		else if (equalsIgnoreCase(shape, "CIRCLE")) {
			Circle *circle = new Circle;
			return circle;
		}

		return NULL;
	}
};

class ColorFactory : public AbstractFactory {
public:
	Color *getColor(std::string color) {
		if (color.empty()) {
			return NULL;
		}
		else if (equalsIgnoreCase(color, "RED")) {
			Red *red = new Red;
			return red;
		}
		else if (equalsIgnoreCase(color, "GREEN")) {
			Green *green = new Green;
			return green;
		}
		else if (equalsIgnoreCase(color, "BLUE")) {
			Blue *blue = new Blue;
			return blue;
		}

		return NULL;
	}

	Shape* getShape(std::string shape) {
		return NULL;
	}
};
