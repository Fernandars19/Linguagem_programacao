#include <iostream>
#include <string>
using namespace std;


string classificar_triangulo(float l1, float l2, float l3) {
    if (l1 == l2 && l2 == l3) {
        return "Equilatero";
    } else if (l1 == l2 || l1 == l3 || l2 == l3) {
        return "Isosceles";
    } else {
        return "Escaleno";
    }
}

int main() {
    float lado1, lado2, lado3;
    cout << "Digite os tres lados:\n";
    cin >> lado1 >> lado2 >> lado3;
    cout << "Classificacao: " << classificar_triangulo(lado1, lado2, lado3) << endl;
    return 0;
}