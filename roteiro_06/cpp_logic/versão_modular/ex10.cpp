#include <iostream>
using namespace std;

// Função do tipo void (não retorna valor) que imprime a tabuada
void gerar_tabuada(int num) {
    for (int i = 1; i <= 10; i++) {
        cout << num << " x " << i << " = " << (num * i) << endl;
    }
}

int main() {
    int numero;
    cout << "Digite um numero para ver sua tabuada: ";
    cin >> numero;
    
    gerar_tabuada(numero); // Chamada da função
    return 0;
}