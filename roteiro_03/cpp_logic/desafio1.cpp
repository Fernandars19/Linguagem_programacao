#include <iostream> 
#include <vector>   
#include <string>   

using namespace std;

int main() {

    cout << "--- Contando de 1 a 10 ---" << endl;

    for (int i = 1; i <= 10; i++) {
        cout << i << endl;
    }

    cout << "\n--- Lista de Nomes ---" << endl;

    vector<string> nomes = {"Guilherme", "Julia", "Fernanda", "Davi", "Emily"};


    for (const string& nome : nomes) {
        cout << nome << endl;
    }

    return 0; 
}