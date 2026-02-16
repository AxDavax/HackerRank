#include <iostream>
#include <vector>
#include <sstream>

std::vector<int> parseInts(std::string str)
{
	std::vector<int> result;

	std::stringstream ss(str);
	std::string item;

	while (getline(ss, item, ','))
		result.push_back(stoi(item));

	return result;
}


int main()
{
	std::string str;
	std::cin >> str;
	std::vector<int> integers = parseInts(str);
	for (int i = 0; i < integers.size(); i++) 
		std::cout << integers[i] << "\n";
	
	return 0;
}