#pragma once

class Color {
public:
	virtual void fill() = 0;
};

class Red : public Color {
public:
	void fill() {
		std::cout << "Inside Red::fill() method!" << std::endl;
	}
};

class Green : public Color {
public:
	void fill() {
		std::cout << "Inside Green::fill() method!" << std::endl;
	}
};

class Blue : public Color {
public:
	void fill() {
		std::cout << "Inside Blue::fill() method!" << std::endl;
	}
};