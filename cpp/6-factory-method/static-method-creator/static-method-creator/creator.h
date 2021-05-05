#pragma once

class Shape {
public:
	virtual void draw() = 0;
};

class Rectangle : public Shape {
public:
	void draw() {
		std::cout << "Inside Rectangle::draw() method!" << std::endl;
	}
};

class Square : public Shape {
public:
	void draw() {
		std::cout << "Inside Square::draw() method!" << std::endl;
	}
};

class Circle : public Shape {
public:
	void draw() {
		std::cout << "Inside Circle::draw() method!" << std::endl;
	}
};