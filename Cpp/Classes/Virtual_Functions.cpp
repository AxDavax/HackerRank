#include <iostream>
#include <vector>

class Person {
	public:
		int age;
		std::string name;
		
		virtual void getdata() = 0;
		virtual void putdata() = 0;
};

class Professor : public Person {
	private:
		int publications, cur_id;
		static int id_counter;

	public:
		Professor() {
			cur_id = ++id_counter;
		}

		void getdata() override {
			std::cin >> name >> age >> publications;
		}

		void putdata() override {
			std::cout << name << " " << age << " " << publications << " " << cur_id << "\n";
		}
};

int Professor::id_counter = 0;

class Student : public Person {
	private:
		int marks[6], cur_id, sum;
		static int id_counter;

	public:
		Student() {
			cur_id = ++id_counter;
		}

		void getdata() override {
			std::cin >> name >> age;
			
			sum = 0;
			for (int i = 0; i < 6; i++) {
				std::cin >> marks[i];
				sum += marks[i];
			}
		}

		void putdata() override {
			std::cout << name << " " << age << " " << sum << " " << cur_id << "\n";
		}
};

int Student::id_counter = 0;

int main()
{
	int n, val;
	std::cin >> n;
	std::vector<Person*> per(n);

	for (int i = 0; i < n; i++) {

		std::cin >> val;
		if (val == 1) 
			per[i] = new Professor;
		else 
			per[i] = new Student; 

		per[i]->getdata(); 
	}

	for (int i = 0; i < n; i++)
		per[i]->putdata(); 

	return 0;
}