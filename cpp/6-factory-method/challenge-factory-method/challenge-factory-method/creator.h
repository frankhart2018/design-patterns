#pragma once

class Animal {
public:
	virtual void talk() = 0;
};

class Duck : public Animal {
public:
	void talk() {
		std::cout << "Duck says quack...quack" << std::endl;
	}
};

class Tiger : public Animal {
public:
	void talk() {
		std::cout << "Tiger says roar...roar" << std::endl;
	}
};