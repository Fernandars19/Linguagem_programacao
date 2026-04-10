#include <iostream>
#include <string> 
using namespace std;

int main() {
    string senha_correta = "senha123";
    string tentativa = "";

    cout << "--- Tela de Login ---" << endl;

    while (tentativa != senha_correta) {
        cout << "Digite a senha: ";
        cin >> tentativa;

        if (tentativa != senha_correta) {
            cout << "Senha incorreta. Tente novamente.\n" << endl;
        }
    }

    cout << "\nAcesso permitido! Boas-vindas ao sistema." << endl;

    return 0;
}