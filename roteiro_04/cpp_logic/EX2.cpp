#include <iostream>
#include <vector>

int main() {

    std::vector<double> matrizA(20);
    std::vector<double> matrizB(20);
    std::vector<double> matrizC(20);


    std::cout << "--- Preenchendo a Matriz A (20 valores) ---\n";
    for (int i = 0; i < 20; i++) {
        std::cout << "Digite o " << i + 1 << "o elemento de A: ";
        std::cin >> matrizA[i];
    }

    std::cout << "\n--- Preenchendo a Matriz B (20 valores) ---\n";
    for (int i = 0; i < 20; i++) {
        std::cout << "Digite o " << i + 1 << "o elemento de B: ";
        std::cin >> matrizB[i];
    }


    std::cout << "\n--- Calculando e apresentando a Matriz C (A - B) ---\n";
    for (int i = 0; i < 20; i++) {
        matrizC[i] = matrizA[i] - matrizB[i]; 
        std::cout << "C[" << i << "] = " << matrizC[i] << std::endl; 
    }

    return 0;
}