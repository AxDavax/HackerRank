#include <iostream>
#include <vector>
#include <deque>

void printKMax(std::vector<int>& arr, int n, int k) {
	std::deque<int> dq;

	for (int i = 0; i < n; i++) {

		if (!dq.empty() && dq.front() == i - k) 
			dq.pop_front();

		while(!dq.empty() && arr[dq.back()] < arr[i])
			dq.pop_back();

		dq.push_back(i);

		if (i >= k - 1) 
			std::cout << arr[dq.front()] << " ";
	}
		
	
	std::cout << "\n";
}

int main() {

	int t;
	std::cin >> t;
	
	while (t > 0) {
		int n, k;
		std::cin >> n >> k;
		int i;
		std::vector<int> arr(n);

		for (i = 0; i < n; i++)
			std::cin >> arr[i];
		
		printKMax(arr, n, k);
		t--;
	}

	return 0;
}