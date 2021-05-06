#pragma once

#include "abstractfactory.h"

class FactoryProducer {
public:
	static AbstractFactory *getFactory(std::string choice) {
		if (equalsIgnoreCase(choice, "SHAPE")) {
			ShapeFactory *shapeFactory = new ShapeFactory;
			return shapeFactory;
		}
		else if (equalsIgnoreCase(choice, "COLOR")) {
			ColorFactory *colorFactory = new ColorFactory;
			return colorFactory;
		}

		return NULL;
	}
};