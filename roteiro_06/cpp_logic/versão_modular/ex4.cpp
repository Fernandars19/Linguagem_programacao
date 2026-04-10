#include <iostream>
#include <string>
using namespace std;

string gerar_mensagem_boas_vindas(string nome, int idade) {
    return "Ola " + nome + "! Bem-vindo(a). Voce tem " + to_string(idade) + " anos.";
}

int main() {
    string nome;
    int idade;
    
    cout << "Digite o seu nome: ";
    getline(cin, nome);
    cout << "Digite a sua idade: ";
    cin >> idade;
    
    cout << gerar_mensagem_boas_vindas(nome, idade) << endl;
    return 0;
}