#include <cstdint>
#include <iostream>

int max_of_four(int a, int b, int c, int d)
{
    int max = INT64_MIN;

    if (a > max) max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    if (d > max) max = d;

    return max;
}

int main()
{
    int a, b, c, d;
    std::cin >> a >> b >> c >> d;

    int ans = max_of_four(a, b, c, d);
    std::cout << ans << std::endl;

    return 0;
}