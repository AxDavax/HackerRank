#include <iostream>
#include <vector>

int main()
{
	int n;
	std::cin >> n;

	std::vector<int> nums(n);
	
	for (int i = 0; i < n; i++)
		std::cin >> nums[i];

	int y, q;
	std::vector<int>::iterator low;

	std::cin >> q;

	for (int i = 0; i < q; i++) {
		std::cin >> y;

		low = std::lower_bound(nums.begin(), nums.end(), y);

		if (low != nums.end())
		{
			if (*low == y)
				std::cout << "Yes " << (low - nums.begin()) + 1 << "\n";
			else
				std::cout << "No " << (low - nums.begin()) + 1 << "\n";
		}
		else
			std::cout << "No " << nums.size() + 1 << "\n";
	}

	return 0;
}