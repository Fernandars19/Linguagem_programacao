#include <iostream>
#include <vector>

int main() {

    std::vector<int> matrizA = {2, 4, 6, 8, 10, 12, 14, 16};
    

    std::vector<int> matrizB(8);


    for (int i = 0; i < 8; i++) {
        matrizB[i] = matrizA[i] * 3; 


    std::cout << "--- Matriz B (Multiplicada por 3) ---\n";
    for (int i = 0; i < 8; i++) {
        std::cout << "Elemento " << i << ": " << matrizB[i] << std::endl;
    }

    return 0;
}