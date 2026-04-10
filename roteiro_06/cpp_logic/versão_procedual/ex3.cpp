#include <iostream>
#include <string>
using namespace std;

int main() {
    string senha = "";
    
    // O laço continua enquanto a senha for menor que 8 caracteres
    while (senha.length() < 8) {
        cout << "Digite uma senha (minimo 8 caracteres): ";
        cin >> senha;
        if (senha.length() < 8) {
            cout << "Senha invalida! Tente novamente." << endl;
        }
    }
    cout << "Senha cadastrada com sucesso!" << endl;
    return 0;
}