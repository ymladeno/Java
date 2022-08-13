#include <iostream>
#include <string>

template<int N>
struct Factorial {
    static const int value = N * Factorial<N-1>::value;
};

template<>
struct Factorial<1> {
    static const int value = 1;
};

int main() {
    std::cout << Factorial<5>::value << "\n";
}