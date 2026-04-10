#include <iostream>
using namespace std;


float aplicar_desconto(float preco, float desconto) {
    return preco - (preco * (desconto / 100.0));
}

int main() {
    float valor, desc;
    cout << "Digite o valor original do produto: ";
    cin >> valor;
    cout << "Digite a porcentagem de desconto: ";
    cin >> desc;
    
    cout << "O valor final com desconto e: " << aplicar_desconto(valor, desc) << endl;
    return 0;
}