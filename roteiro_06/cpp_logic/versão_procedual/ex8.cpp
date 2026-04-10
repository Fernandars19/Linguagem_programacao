#include <iostream>
using namespace std;

int main() {
    float l1, l2, l3;
    cout << "Digite os tres lados do triangulo:\n";
    cin >> l1 >> l2 >> l3;
    
    if (l1 == l2 && l2 == l3) {
        cout << "Triangulo Equilatero" << endl;
    } else if (l1 == l2 || l1 == l3 || l2 == l3) {
        cout << "Triangulo Isosceles" << endl;
    } else {
        cout << "Triangulo Escaleno" << endl;
    }
    return 0;
}