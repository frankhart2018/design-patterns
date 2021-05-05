#include <iostream>

// This breaks both single responsibility principle
// and interface segregation principle
class RestaurantInterface {
public:
	virtual void acceptOnlineOrder() = 0;
	virtual void takeTelephoneOrder() = 0;
	virtual void payOnliine() = 0;
	virtual void walkInCustomerOrder() = 0;
	virtual void payInPerson() = 0;
};

int main() {


	return 0;
}