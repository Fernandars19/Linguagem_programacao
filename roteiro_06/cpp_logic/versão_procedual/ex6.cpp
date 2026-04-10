#include <iostream>
using namespace std;

int main() {
    float valor_original, porcentagem, valor_final;
    
    cout << "Digite o valor original do produto: ";
    cin >> valor_original;
    cout << "Digite a porcentagem de desconto: ";
    cin >> porcentagem;
    
    valor_final = valor_original - (valor_original * (porcentagem / 100.0));
    cout << "O valor final com desconto e: " << valor_final << endl;
    return 0;
}