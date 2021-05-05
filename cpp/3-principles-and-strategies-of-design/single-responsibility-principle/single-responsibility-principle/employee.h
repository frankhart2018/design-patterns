#pragma once

class Employee {
private:
	std::string employeeId;
	std::string name;
	std::string address;
	
	// Both of these functions are not responsibility of an Employee
	// and hence this class breans the Single Responsibility Principle
//public:
//	bool isPromotionDueThisYear() {
//		// Promotion logic
//		return true;
//	}
//
//	double calcIncomeTaxForCurrentYear() {
//		// Income tax logic
//		return 2.0;
//	}

	// Getters / setters for all member variables
};