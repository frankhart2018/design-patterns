#include <iostream>

class Vehicle {
public:
	virtual int getSpeed() = 0;
	virtual int getCubicCapacity() = 0;
};

class Car : public Vehicle {
public:
	int getSpeed() { return 1;  }
	int getCubicCapacity() { return 1;  }
	bool sHatchBack() { return true;  }
};

class Bus : public Vehicle {
public:
	int getSpeed() { return 2;  }
	int getCubicCapacity() { return 2;  }
	std::string getEmergencyExitLoc() { return "false";  }
};

int main() {
	Vehicle* vehicle = new Bus;
	vehicle->getSpeed();
	vehicle = new Car;
	vehicle->getCubicCapacity();

	// This follows Liskov Substitution Principle - sub type objects
	// can replace super type objects without affecting the functionality
	// inherent in the super type

	return 0;
}