#include <iostream>
using namespace std;

int main() {
    int nota;
    cout << "Digite a nota (0 a 100): ";
    cin >> nota;
    
    if (nota >= 90 && nota <= 100) {
        cout << "Categoria: A" << endl;
    } else if (nota >= 80 && nota <= 89) {
        cout << "Categoria: B" << endl;
    } else if (nota >= 70 && nota <= 79) {
        cout << "Categoria: C" << endl;
    } else if (nota >= 60 && nota <= 69) {
        cout << "Categoria: D" << endl;
    } else {
        cout << "Categoria: E" << endl;
    }
    return 0;
}