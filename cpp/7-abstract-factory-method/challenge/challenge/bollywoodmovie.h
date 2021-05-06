#pragma once

class BollywoodMovie {
public:
	virtual void getMovieName(std::string movieName) = 0;
};

class BollywoodActionMovie : public BollywoodMovie {
public:
	void getMovieName(std::string movieName) {
		std::cout << movieName << " is a bollywood action movie." << std::endl;
	}
};

class BollywoodComedyMovie : public BollywoodMovie {
public:
	void getMovieName(std::string movieName) {
		std::cout << movieName << " is a bollywood comedy movie." << std::endl;
	}
};