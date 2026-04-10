#include <iostream>
using namespace std;

int main() {
    float nota;
    float soma = 0; 
    float media;

    cout << "--- Calculadora de Media ---" << endl;


    for (int i = 1; i <= 5; i++) {
        cout << "Digite a nota " << i << ": ";
        cin >> nota;
        soma = soma + nota; 
    }


    media = soma / 5;

    cout << "\nA soma de todas as notas e: " << soma << endl;
    cout << "A media final e: " << media << endl;

    return 0;
}