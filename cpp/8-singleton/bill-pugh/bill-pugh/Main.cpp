class Singleton {
private:
	// An instance attribute
	int data = 0;

	/*
	 * The Singleton Constructor
	 * Note that it is private
	 * No client can instantiate a Singleton object!
	*/
private:
	Singleton() {}

	class SingletonHelper {
		// Nested class is referenced after getInstance() is called
	public:
		static Singleton *uniqueInstance;
	};

public:
	static Singleton *getInstance() {
		return SingletonHelper::uniqueInstance;
	}

	void setData(int myData) {
		data = myData;
	}

	int getData() {
		return data;
	}
};

int main() {
	Singleton* s = Singleton::getInstance();
}