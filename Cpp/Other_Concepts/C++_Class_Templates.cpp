#include <iostream>

template <class T>
class AddElements {
	private:
		T element;
	public:
		AddElements(T arg) {
			element = arg;
		}

		T add(T newArg) {
			element += newArg;
			return element;
		}

		std::string concatenate(std::string newStr) {
			return element + newStr;
		}
};

int main() {
	int n, i;
	std::cin >> n;

	for (int i = 0; i < n; i++) {
		std::string type;
		std::cin >> type;

		if (type == "float") {
			double element1, element2;
			std::cin >> element1 >> element2;
			AddElements<double> myfloat(element1);
			std::cout << myfloat.add(element2) << std::endl;
		}
		else if (type == "int") {
			int element1, element2;
			std::cin >> element1 >> element2;
			AddElements<int> myint(element1);
			std::cout << myint.add(element2) << std::endl;
		}
		else if (type == "string") {
			std::string element1, element2;
			std::cin >> element1 >> element2;
			AddElements<std::string> mystring(element1);
			std::cout << mystring.concatenate(element2) << std::endl;
		}
	}

	return 0;
}