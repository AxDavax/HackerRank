#include <iostream>
#include <map>
#include <string>


int main()
{
	int q, type;
	std::string name;

	std::cin >> q;
	std::map<std::string, int>m;

	for (int i = 0; i < q; i++)
	{
		std::cin >> type >> name;

		switch (type)
		{
			case 1:
			{
				int marks;
				std::cin >> marks;
				m[name] += marks;
				break;
			}

			case 2: 
				m.erase(name);
				break;

			case 3: 
				std::cout << m[name] << "\n";
				break;

			default: break;
		}
	}

	return 0;
}