#include <iostream>

void update(int* a, int* b)
{
    int x = *a;
    int y = *b;

    *a = x + y;
    *b = (x > y) ? (x - y) : (y - x);
}

int main()
{
    int a, b;
    int* pa = &a, * pb = &b;
    std::cin >> a >> b;
    update(pa, pb);
    std::cout << a << "\n" << b;

    return 0;
}