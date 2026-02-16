#include <iostream>
#include <iomanip>
#include <sstream>

class Student {
	private:
		int age, standard;
		std::string firstName, lastName;

	public:
		void set_age(int age) { this->age = age; }
		int get_age() { return age; }

		void set_standard(int standard) { this->standard = standard; }
		int get_standard() { return standard; }

		void set_first_name(std::string firstName) { this->firstName = firstName; }
		std::string get_first_name() { return firstName; }

		void set_last_name(std::string lastName) { this->lastName = lastName; }
		std::string get_last_name() { return lastName; }

		std::string to_string() {
			return std::to_string(age) + "," + firstName + "," + lastName + "," + std::to_string(standard);
		}
};

int main()
{
	int age, standard;
	std::string first_name, last_name;

	std::cin >> age >> first_name >> last_name >> standard;

	Student st;
	st.set_age(age);
	st.set_standard(standard);
	st.set_first_name(first_name);
	st.set_last_name(last_name);

	std::cout << st.get_age() << "\n";
	std::cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
	std::cout << st.get_standard() << "\n";
	std::cout << "\n";
	std::cout << st.to_string();

	return 0;
}