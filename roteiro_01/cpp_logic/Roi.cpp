#include <iostream>
#include <iomanip>

using namespace std;

int main() {
   
    float ganho, investimento, roi;

    cout << "--- Simulador Financeiro (ROI) ---" << endl;
    
    // Entrada de Dados
    cout << "Digite o valor do Investimento Inicial: ";
    cin >> investimento;
    
    cout << "Digite o valor do Ganho Obtido: ";
    cin >> ganho;

    if (investimento == 0) {
  
        cout << "Erro: O valor do investimento não pode ser zero!" << endl;
    } else {
     
        roi = ((ganho - investimento) / investimento) * 100; 

        // Saída de Dados
        cout << fixed << setprecision(2);
        cout << "O Retorno sobre Investimento (ROI) e de: " << roi << "%" << endl;
    }

    return 0;
}