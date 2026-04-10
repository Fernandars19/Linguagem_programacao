#include <iostream>
#include <string>
using namespace std;


bool validar_senha(string senha) {
    return senha.length() >= 8;
}

int main() {
    string senha;
    bool valida = false;
    
    while (!valida) {
        cout << "Digite uma senha (minimo 8 caracteres): ";
        cin >> senha;
        valida = validar_senha(senha);
        
        if (!valida) {
            cout << "Senha invalida! Tente novamente." << endl;
        }
    }
    cout << "Senha cadastrada com sucesso!" << endl;
    return 0;
}