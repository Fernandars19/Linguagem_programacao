#include <iostream>
#include <string>
using namespace std;

int main() {
    string frase;
    int contador = 0;
    
    cout << "Digite uma palavra ou frase: ";
    getline(cin, frase);
    
    for (int i = 0; i < frase.length(); i++) {
        char c = tolower(frase[i]); // Converte para minúscula para facilitar
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            contador++;
        }
    }
    
    cout << "Total de vogais: " << contador << endl;
    return 0;
}