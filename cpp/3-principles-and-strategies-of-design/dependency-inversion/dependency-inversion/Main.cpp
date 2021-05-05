#include <iostream>

class MySqlConnection {
public:
	int connect() {
		return 1;
	}
};

class PasswordReminder {
private:
	MySqlConnection dbConnection;
};

int main() {


	return 0;
}