#include <iostream>
#include <string>
using namespace std;

int main() {
    string nome;
    int idade;
    
    cout << "Digite o seu nome: ";
    getline(cin, nome); // nomes compostos
    cout << "Digite a sua idade: ";
    cin >> idade;
    
    cout << "Ola " << nome << "! Bem-vindo(a). Voce tem " << idade << " anos." << endl;
    return 0;
}