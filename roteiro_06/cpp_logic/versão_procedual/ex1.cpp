#include <iostream>
using namespace std;

int main() {
    int numero;
    cout << "Digite um numero inteiro: ";
    cin >> numero;
    
    if (numero % 2 == 0) {
        cout << "O numero e Par." << endl;
    } else {
        cout << "O numero e Impar." << endl;
    }
    return 0;
}