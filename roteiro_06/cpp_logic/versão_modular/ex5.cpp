#include <iostream>
using namespace std;


float celsius_para_fahrenheit(float c) {
    return (c * 9.0 / 5.0) + 32.0;
}

int main() {
    float celsius;
    cout << "Digite a temperatura em Celsius: ";
    cin >> celsius;
    
    cout << "A temperatura em Fahrenheit e: " << celsius_para_fahrenheit(celsius) << endl;
    return 0;
}