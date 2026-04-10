#include <iostream>
using namespace std;


float calcular_area_retangulo(float base, float altura) {
    return base * altura;
}

int main() {
    float b, h;
    cout << "Digite a base: ";
    cin >> b;
    cout << "Digite a altura: ";
    cin >> h;
    
    cout << "A area do retangulo e: " << calcular_area_retangulo(b, h) << endl;
    return 0;
}