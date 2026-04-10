#include <iostream>
using namespace std;

int main() {
    int numero_secreto = 7;
    int palpite = 0;

    cout << "--- Jogo de Adivinhacao ---" << endl;


    while (palpite != numero_secreto) {
        cout << "Digite seu palpite: ";
        cin >> palpite;


        if (palpite > numero_secreto) {
            cout << "Tente um numero menor!" << endl;
        } else if (palpite < numero_secreto) {
            cout << "Tente um numero maior!" << endl;
        }
    }

   
    cout << "\nParabens! Voce acertou o numero secreto!" << endl;

    return 0;
}