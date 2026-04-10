#include <iostream>
using namespace std;

int main() {
    float celsius, fahrenheit;
    
    cout << "Digite a temperatura em Celsius: ";
    cin >> celsius;
    
    fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
    cout << "A temperatura em Fahrenheit e: " << fahrenheit << endl;
    return 0;
}