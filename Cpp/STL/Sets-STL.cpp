#include <iostream>
#include <set>

int main()
{
	int q, y, x;
	std::cin >> q;

	std::set<int>s;

	for (int i = 0; i < q; i++)
	{
		std::cin >> y >> x;

		switch (y)
		{
			case 1: 
				s.insert(x);
				break;

			case 2: 
				s.erase(x);
				break;

			case 3:
			{
				auto itr = s.find(x);
				std::cout << (itr != s.end() ? "Yes" : "No") << std::endl;
				break;
			}

			default: break;
		}
	}

	return 0;
}