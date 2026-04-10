#include <iostream>
using namespace std;

int main() {
    int numero = 0; 

    while (numero <= 10) {
        cout << "Digite um numero (maior que 10 para sair): ";
        cin >> numero;
    }

    cout << "\nObrigado! Voce digitou um numero maior que 10 e saiu do laco." << endl;

    return 0;
}