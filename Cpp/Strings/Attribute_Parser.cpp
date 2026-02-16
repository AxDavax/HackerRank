#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <sstream>

int main()
{
	int n, q;
	std::cin >> n >> q;
	std::cin.ignore();

	std::unordered_map<std::string, std::string> mp;
	std::vector<std::string> tag_stack;  

	for (int i = 0; i < n; i++)
	{
		std::string line;
		getline(std::cin, line);

		if (line[1] == '/') 
		{
			tag_stack.pop_back();  
			continue;  
		}

		line = line.substr(1, line.length() - 2);
		std::stringstream ss(line);

		std::string tag;
		ss >> tag;

		std::string path = tag;
		if (!tag_stack.empty())
			path = tag_stack.back() + "." + tag;  

		tag_stack.push_back(path);

		std::string attr, eq, val;
		while (ss >> attr >> eq >> val)
		{
			val = val.substr(1, val.length() - 2);
			mp[path + "~" + attr] = val;
		}
	}

	while (q--)
	{
		std::string query;
		getline(std::cin, query);
		std::cout << (mp.count(query) ? mp[query] : "Not Found!") << std::endl;
	}

	return 0;
}