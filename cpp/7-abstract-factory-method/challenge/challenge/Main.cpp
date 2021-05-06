#include <iostream>

#include "factoryproducer.h"

int main() {
	AbstractFactory* hollywoodFactory = FactoryProducer::getMovieFactory("HOLLYWOOD");

	HollywoodMovie* hollywoodActionMovie = hollywoodFactory->getHollywoodMovie("ACTION");
	hollywoodActionMovie->getMovieName("Mission Impossible: Ghost Protocol");

	HollywoodMovie* hollywoodComedyMovie = hollywoodFactory->getHollywoodMovie("COMEDY");
	hollywoodActionMovie->getMovieName("The Hangover");

	AbstractFactory* bollywoodFactory = FactoryProducer::getMovieFactory("BOLLYWOOD");

	BollywoodMovie* bollywoodActionMovie = bollywoodFactory->getBollywoodMovie("ACTION");
	bollywoodActionMovie->getMovieName("Dhoom 2");

	BollywoodMovie* bollywoodComedyMovie = bollywoodFactory->getBollywoodMovie("COMEDY");
	bollywoodComedyMovie->getMovieName("Dhamaal");

	return 0;
}