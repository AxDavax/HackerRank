#include <ostream>
#include <iostream>

class Box {
	private:
		int l, b, h;

	public:
		Box() : l(0), b(0), h(0) {};
		Box(int l, int b, int h) : l(l), b(b), h(h) {};
		Box(const Box& B) : l(B.l), b(B.b), h(B.h) {};

		int getLength() const { return l; };
		int getBreadth() const { return b; };
		int getHeight() const { return h; };

		long CalculateVolume() const;


		bool operator < (const Box& B) const;
		friend std::ostream& operator << (std::ostream& out, const Box& B);
};

long Box::CalculateVolume() const {
	return 1L * l * b * h;
}

bool Box::operator < (const Box& B) const {
	if (l == B.l)
		return (b == B.b) ? h < B.h : b < B.b;

	return l < B.l;
}

std::ostream& operator << (std::ostream& out, const Box& B)
{
	out << B.l << " " << B.b << " " << B.h;
	return out;
}

int main()
{
	int n, l, b, h;
	std::cin >> n;
	Box temp;

	for (int i = 0; i < n; i++) {
		int type;
		std::cin >> type;

		if (type == 1)
			std::cout << temp << std::endl;

		if (type == 2)
		{
			int l, b, h;
			std::cin >> l >> b >> h;
			Box NewBox(l, b, h);
			temp = NewBox;
			std::cout << temp << std::endl;
		}

		if (type == 3)
		{
			int l, b, h;
			std::cin >> l >> b >> h;
			Box NewBox(l, b, h);
			std::cout << (NewBox < temp) ? "Lesser\n" : "Greater\n";
		}

		if (type == 4)
			std::cout << temp.CalculateVolume() << std::endl;

		if (type == 5)
		{
			Box NewBox(temp);
			std::cout << NewBox << std::endl;
		}
	}

	return 0;
}