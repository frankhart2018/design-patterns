#pragma once

class HollywoodMovie {
public:
	virtual void getMovieName(std::string movieName) = 0;
};

class HollywoodActionMovie : public HollywoodMovie {
public:
	void getMovieName(std::string movieName) {
		std::cout << movieName << " is a hollywood action movie." << std::endl;
	}
};

class HollywoodComedyMovie : public HollywoodMovie {
public:
	void getMovieName(std::string movieName) {
		std::cout << movieName << " is a hollywood comedy movie." << std::endl;
	}
};