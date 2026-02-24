#include <iostream>

class Rectangle {
	protected:
		int width, height;

	public: 
		void display() const {
			std::cout << width << " " << height << '\n';
		}
};

class RectangleArea : public Rectangle {
	public:
		void read_input() {
			std::cin >> width >> height;
		}

		void display() const {
			std::cout << width * height << '\n';
		}
};

int main() 
{
	RectangleArea r_area;

	r_area.read_input();

	r_area.Rectangle::display();

	r_area.display();

	return 0;
}