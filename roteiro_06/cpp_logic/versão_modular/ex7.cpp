#include <iostream>
using namespace std;

char classificar_nota(int nota) {
    if (nota >= 90) return 'A';
    else if (nota >= 80) return 'B';
    else if (nota >= 70) return 'C';
    else if (nota >= 60) return 'D';
    else return 'E';
}

int main() {
    int nota;
    cout << "Digite a nota (0 a 100): ";
    cin >> nota;
    cout << "Categoria: " << classificar_nota(nota) << endl;
    return 0;
}