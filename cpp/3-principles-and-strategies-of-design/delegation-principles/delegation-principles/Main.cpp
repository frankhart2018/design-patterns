#include <iostream>

class RealPrinter {
	// The "delegate"

public:
	void print() {
		std::cout << "The Delegate" << std::endl;
	}
};

class Printer {
private:
	// The "delegator"
	RealPrinter p;

public:
	// Create the delegate
	void print() {
		p.print(); // Delegation
	}
};

int main() {
	Printer printer;
	printer.print();

	return 0;
}