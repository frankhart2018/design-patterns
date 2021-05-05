#pragma once

#include "creator.h"

class AbstractShapeFactory {
protected:
	virtual Shape* factoryMethod() = 0;

public:
	Shape* getShape() {
		return factoryMethod();
	}

	// Other helper methods
};

class RectangleFactory: public AbstractShapeFactory {
protected:
	Shape *factoryMethod() {
		Rectangle rectangle;
		return &rectangle;
	}
};

class SquareFactory : public AbstractShapeFactory {
protected:
	Shape *factoryMethod() {
		Square square;
		return &square;
	}
};

class CircleFactory : public AbstractShapeFactory {
protected:
	Shape *factoryMethod() {
		Circle circle;
		return &circle;
	}
};