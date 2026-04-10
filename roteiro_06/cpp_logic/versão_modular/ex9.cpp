#include <iostream>
#include <string>
using namespace std;

int contar_vogais(string texto) {
    int contador = 0;
    for (int i = 0; i < texto.length(); i++) {
        char c = tolower(texto[i]);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            contador++;
        }
    }
    return contador;
}

int main() {
    string frase;
    cout << "Digite uma palavra ou frase: ";
    getline(cin, frase);
    
    cout << "Total de vogais: " << contar_vogais(frase) << endl;
    return 0;
}