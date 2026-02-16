#include <iostream>
#include <vector>

int main()
{
	int n, v;
	std::cin >> n;
	std::vector<int> numb;

	for (int i = 0; i < n; i++)
	{
		std::cin >> v;
		numb.push_back(v);
	}

	int ind;
	std::cin >> ind;

	numb.erase(numb.begin() + (ind - 1));

	int a, b;
	std::cin >> a >> b;

	numb.erase(numb.begin() + (a - 1), numb.begin() + (b - 1));

	std::cout << numb.size() << std::endl;

	for (int x : numb)
		std::cout << x << " ";

	return 0;
}