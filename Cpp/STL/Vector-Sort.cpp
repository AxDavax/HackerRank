#include <iostream>
#include <vector>
#include <algorithm>

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

	sort(numb.begin(), numb.end());

	for (int x : numb)
		std::cout << x << " ";

	return 0;
}