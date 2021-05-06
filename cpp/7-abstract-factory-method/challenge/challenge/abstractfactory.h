#pragma once

#include "bollywoodmovie.h"
#include "hollywoodmovie.h"
#include "helpers.h"

class AbstractFactory {
public:
	virtual HollywoodMovie* getHollywoodMovie(std::string movieType) = 0;
	virtual BollywoodMovie* getBollywoodMovie(std::string movieType) = 0;
};

class HollywoodMovieFactory : public AbstractFactory {
public:
	HollywoodMovie* getHollywoodMovie(std::string movieType) {
		if (movieType.empty()) {
			return NULL;
		}
		else if (equalsIgnoreCase(movieType, "ACTION")) {
			HollywoodActionMovie* hollywoodActionMovie = new HollywoodActionMovie;
			return hollywoodActionMovie;
		}
		else if (equalsIgnoreCase(movieType, "COMEDY")) {
			HollywoodComedyMovie* hollywoodComedyMovie = new HollywoodComedyMovie;
			return hollywoodComedyMovie;
		}

		return NULL;
	}

	BollywoodMovie* getBollywoodMovie(std::string movieType) {
		return NULL;
	}
};

class BollywoodMovieFactory : public AbstractFactory {
public:
	HollywoodMovie* getHollywoodMovie(std::string movieType) {
		return NULL;
	}

	BollywoodMovie* getBollywoodMovie(std::string movieType) {
		if (movieType.empty()) {
			return NULL;
		}
		else if (equalsIgnoreCase(movieType, "ACTION")) {
			BollywoodActionMovie* bollywoodActionMovie = new BollywoodActionMovie;
			return bollywoodActionMovie;
		}
		else if (equalsIgnoreCase(movieType, "COMEDY")) {
			BollywoodComedyMovie* bollywoodComedyMovie = new BollywoodComedyMovie;
			return bollywoodComedyMovie;
		}

		return NULL;
	}
};

// Another way is to create classes for action and comedy which uses the
// get hollywood and bollywood movie methods to return the corresponding movie
// this would be much cleaner than my solution