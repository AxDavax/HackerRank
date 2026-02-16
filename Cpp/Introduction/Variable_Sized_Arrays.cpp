#include <iostream>
#include <vector>

int main()
{
    int rows, queries, new_values;

    std::cin >> rows >> queries;

    std::vector<std::vector<int>> arr(rows);

    for (int i = 0; i < rows; i++)
    {
        std::cin >> new_values;

        arr[i].resize(new_values);

        for (int j = 0; j < new_values; j++)
            std::cin >> arr[i][j];
    }

    int val1, val2;

    for (int i = 0; i < queries; i++)
    {
        std::cin >> val1 >> val2;
        std::cout << arr[val1][val2] << std::endl;
    }

    return 0;
}