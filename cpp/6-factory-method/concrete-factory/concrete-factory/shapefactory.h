#pragma once

#include "creator.h"

std::string getUpperCaseString(std::string str) {
	std::string uppercase_string = "";

	for (int i = 0; i < str.length(); i++) {
		uppercase_string += toupper(str[i]);
	}

	return uppercase_string;
}

bool equalsIgnoreCase(std::string str1, std::string str2) {
	std::string uppercase_string = getUpperCaseString(str2);

	if (str1.compare(str2) == 0)
		return true;
	return false;
}

class ShapeFactory {
public:
	Shape* getShape(std::string shapeType) {
		if (shapeType.empty()) {
			return NULL;
		}
		else if (equalsIgnoreCase(shapeType, "CIRCLE")) {
			Circle circle;
			return &circle;
		}
		else if (equalsIgnoreCase(shapeType, "RECTANGLE")) {
			Rectangle rectangle;
			return &rectangle;
		}
		else if (equalsIgnoreCase(shapeType, "SQUARE")) {
			Square square;
			return &square;
		}

		return NULL;
	}
};