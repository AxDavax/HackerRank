#include <string>
#include <iostream>
#include <array>

std::string StrNumb(int n)
{
    static const std::array<std::string, 10> words = { "", "one", "two", "three", "four", "five",
                                                "six", "seven", "eight", "nine" };
    return (n >= 1 && n <= 9) ? words[n] : "";
}

int main()
{
    int a, b;

    std::cin >> a;
    std::cin >> b;

    for (int i = a; i <= b; i++)
    {
        if (i <= 9)
            std::cout << StrNumb(i) << "\n";
        else
            std::cout << (i % 2 == 0 ? "even" : "odd") << "\n";
    }

    return 0;
}