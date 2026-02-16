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
    int n;
    std::cin >> n;

    if (n <= 9)
        std::cout << StrNumb(n) << std::endl;
    else
        std::cout << "Greater than 9" << std::endl;

    return 0;
}