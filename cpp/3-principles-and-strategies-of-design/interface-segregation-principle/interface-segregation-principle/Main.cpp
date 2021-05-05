#include <iostream>

//class ShapeInterface {
//public:
//	virtual double area() = 0;
//	virtual double volume() = 0; // Forces all 2D shapes to implement this when it's not needed
//};

class ShapeInterface {
public:
	virtual double area() = 0;
};

class SolidShapeInterface {
public:
	virtual double volume() = 0;
};

class ManagedShapeInterface {
public:
	virtual double calculate() = 0;
};

class Cube : public ShapeInterface, public SolidShapeInterface, public ManagedShapeInterface {
public:
	double area() {
		return 1.0;
	}

	double volume() {
		return 1.0;
	}

	double calculate() {
		return this->area() + this->volume();
	}
};

class Square : public ShapeInterface, public ManagedShapeInterface {
public:
	double area() {
		return 2.0;
	}

	double calculate() {
		return this->area();
	}
};

int main() {
	// Clients should not be forced to depend upon
	// interfaces that they do not use
	// or a client should not implement an interface if 
	// it does not use a method in that interface

	return 0;
}