#pragma once

#include "abstractfactory.h"

class FactoryProducer {
public:
	static AbstractFactory* getMovieFactory(std::string movieFactoryName) {
		if (movieFactoryName.empty()) {
			return NULL;
		}
		else if (equalsIgnoreCase(movieFactoryName, "HOLLYWOOD")) {
			HollywoodMovieFactory* hollywoodMovieFactory = new HollywoodMovieFactory;
			return hollywoodMovieFactory;
		}
		else if (equalsIgnoreCase(movieFactoryName, "BOLLYWOOD")) {
			BollywoodMovieFactory* bollywoodMovieFactory = new BollywoodMovieFactory;
			return bollywoodMovieFactory;
		}

		return NULL;
	}
};