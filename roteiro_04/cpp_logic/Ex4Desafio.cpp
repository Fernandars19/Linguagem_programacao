#include <iostream>
#include <vector>
#include <string>

int main() {

    std::vector<std::string> nomesInsumos(3);
    std::vector<int> quantidades(3);

    std::cout << "--- MVP Sorveteria do Dener: Cadastro de Estoque ---\n";


    for (int i = 0; i < 3; i++) {
        std::cout << "\nDigite o nome do " << i + 1 << "o produto: ";

        std::getline(std::cin >> std::ws, nomesInsumos[i]); 

        std::cout << "Digite a quantidade em estoque: ";
        std::cin >> quantidades[i];
    }

    std::cout << "\n============================================\n";
    std::cout << "        RELATORIO FINAL DE AUDITORIA        \n";
    std::cout << "============================================\n";


    for (int i = 0; i < 3; i++) {
        std::cout << "Produto: " << nomesInsumos[i] << " | Estoque: " << quantidades[i] << " unidades.";
        
        // 4. Regra de Auditoria
        if (quantidades[i] < 5) {
            std::cout << " [REPOSICAO NECESSARIA]";
        }
        
        std::cout << std::endl; 
    }

    return 0;
}