#include <iostream>

class DBConnectionInterface {
public:
	virtual int connect() = 0;
};

class MySqlConnection : public DBConnectionInterface {
public:
	int connect() {
		return 1;
	}
};

class PasswordReminder {
private:
	DBConnectionInterface* dbConnection;

public:
	PasswordReminder(DBConnectionInterface* dbConnection) {
		this->dbConnection = dbConnection;
	}
};

int main() {
	return 0;
}