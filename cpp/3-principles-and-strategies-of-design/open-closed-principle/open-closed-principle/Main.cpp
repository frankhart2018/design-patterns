#include <iostream>

class Shape {
public:
	virtual double calculateArea() = 0;
};

class Rectangle: public Shape {
public:
	double length;
	double width;

public:
	double calculateArea() {
		return length * width;
	}
};

class Circle: public Shape {
public:
	double radius;

public:
	double calculateArea() {
		return (22. / 7.) * radius * radius;
	}
};

class AreaCalculator {
public:
	double caluclateShapeArea(Shape *shape) {
		return shape->calculateArea(); // Giving responsibility to calculate area to the responsible class
	}
};

// This follows open closed principle - open for extension by implementing the interface
// closed for modification in the AreaCalulator class

int main() {
	Rectangle rectangle;
	rectangle.length = 3;
	rectangle.width = 4;
	
	AreaCalculator areaCalculator;

	double rectangleArea = areaCalculator.caluclateShapeArea(&rectangle);
	std::cout << "Area of rectangle = " << rectangleArea << std::endl;

	Circle circle;
	circle.radius = 7;

	double circleArea = areaCalculator.caluclateShapeArea(&circle);
	std::cout << "Area of circle = " << circleArea << std::endl;
	
	return 0;
}