#include <iostream>

class Service {
public:
	void write(std::string message) {
		std::cout << "Hello World" << std::endl;
	}
};

class Client {
private:
	Service myService;

public:
	// Injects via the constructor
	Client(Service service) {
		myService = service;
	}

	void doSomething() {
		myService.write("This is a message");
	}

	// Injects via setter method
	void setService(Service service) {
		myService = service;
	}
};

int main() {
	Service service;
	Client client(service);
	client.doSomething();
	client.setService(service);

	return 0;
}