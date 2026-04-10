#include <iostream>
using namespace std;


void verificar_paridade(int num) {
    if (num % 2 == 0) {
        cout << "O numero e Par." << endl;
    } else {
        cout << "O numero e Impar." << endl;
    }
}

int main() {
    int numero;
    cout << "Digite um numero inteiro: ";
    cin >> numero;
    verificar_paridade(numero); 
    return 0;
}