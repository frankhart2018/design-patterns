#include <iostream>

#include "animalfactory.h"
#include "creator.h"

int main() {
	// Get duck object and call talk method
	Animal* duck = AnimalFactory::getAnimalType("DUCK");
	duck->talk();

	// Get tiger object and call talk method
	Animal* tiger = AnimalFactory::getAnimalType("TIGER");
	tiger->talk();

	return 0;
}