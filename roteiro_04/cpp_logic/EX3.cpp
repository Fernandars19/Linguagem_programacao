#include <iostream>
#include <vector>

int main() {

    std::vector<int> matrizA(15);
    std::vector<int> matrizB(15);


    std::cout << "--- Digite 15 numeros para a Matriz A ---\n";
    for(int i = 0; i < 15; i++) {
        std::cout << "Digite o " << i + 1 << "o numero: ";
        std::cin >> matrizA[i];
    }


    for(int i = 0; i < 15; i++) {
        matrizB[i] = matrizA[i] * matrizA[i]; 
    }


    std::cout << "\n=== RESULTADOS ===\n";
    
    std::cout << "Matriz A Original: \n";
    for(int i = 0; i < 15; i++) {
        std::cout << matrizA[i] << " ";
    }
    
    std::cout << "\n\nMatriz B (Quadrados): \n";
    for(int i = 0; i < 15; i++) {
        std::cout << matrizB[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}