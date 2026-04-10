#include <iostream>
using namespace std;

int main() {
    float base, altura, area;
    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retangulo: ";
    cin >> altura;
    
    area = base * altura;
    cout << "A area do retangulo e: " << area << endl;
    return 0;
}