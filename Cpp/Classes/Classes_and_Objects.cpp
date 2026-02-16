#include <iostream>

class Student {
	private:
		int scores[5];

	public:
		void input() {
			for (int i = 0; i < 5; i++)
				std::cin >> scores[i];
		}

		int calculateTotalScore() {
			int somme = 0;

			for (int i = 0; i < 5; i++)
				somme += scores[i];

			return somme;
		}
};

int main()
{
	int n;
	std::cin >> n;
	Student* s = new Student[n];

	for (int i = 0; i < n; i++)
		s[i].input();

	int kristen_score = s[0].calculateTotalScore();

	int count = 0;
	for (int i = 1; i < n; i++) {
		int total = s[i].calculateTotalScore();
		if (total > kristen_score) count++;
	}

	std::cout << count;

	return 0;
}