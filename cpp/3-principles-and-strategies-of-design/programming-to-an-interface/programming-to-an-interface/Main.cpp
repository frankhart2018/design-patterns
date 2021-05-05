#include <iostream>

class displayModule {
public:
	virtual void display() = 0;
};

class Monitor : public displayModule {
public:
	void display() {
		std::cout << "Display through Monitor" << std::endl;
	}
};

class Projector : public displayModule {
public:
	void display() {
		std::cout << "Display through Projector" << std::endl;
	}
};

class Client {
private:
	displayModule *dm;

public:
	void setDisplayModule(displayModule* dm) {
		this->dm = dm;
	}

	void display() {
		dm->display();
	}
};

int main() {
	Client client;

	Monitor dm;
	Projector dm1;

	client.setDisplayModule(&dm);
	client.display();

	client.setDisplayModule(&dm1);
	client.display();

	return 0;
}