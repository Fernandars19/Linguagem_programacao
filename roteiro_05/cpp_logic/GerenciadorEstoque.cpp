#include <iostream>
#include <string>
#include <unordered_map> 

using namespace std;

void exibirCabecalho() {
    cout << "========================================" << endl;
    cout << "          SORVETERIA DO DENER           " << endl;
    cout << "========================================" << endl;
}


string verificarEstoqueCritico(int quantidade) {
    if (quantidade < 5) {
        return " -> [AVISO: Estoque Critico!]";
    }
    return " -> [Estoque OK]";
}


void exibirMenu() {
    cout << "\n----------------------------------------" << endl;
    cout << "1. Consultar saldo de um produto" << endl;
    cout << "2. Sair do sistema" << endl;
    cout << "----------------------------------------" << endl;
}



int main() {

    unordered_map<string, int> inventario = {
        {"Morango", 12},
        {"Chocolate", 3},   // Estoque crítico
        {"Baunilha", 20},
        {"Casquinha", 4},   // Estoque crítico
        {"Caramelo", 8}
    };

    bool rodando = true;
    int opcao;
    string nomeProduto;

 
    exibirCabecalho();


    while (rodando) {
        exibirMenu();
        cout << "Escolha uma opcao: ";
        cin >> opcao;

        if (opcao == 1) {
            cout << "Digite o nome exato do produto (ex: Chocolate): ";
            cin >> nomeProduto;

        
            if (inventario.find(nomeProduto) != inventario.end()) {
                int saldo = inventario[nomeProduto];
                
                cout << "\nProduto: " << nomeProduto << " | Saldo: " << saldo;
                

                cout << verificarEstoqueCritico(saldo) << endl;
                
            } else {
                cout << "\nErro: Produto nao encontrado no catalogo." << endl;
            }
            
        } else if (opcao == 2) {
            rodando = false;
            cout << "\nEncerrando o sistema da Sorveteria..." << endl;
        } else {
            cout << "\nOpcao invalida. Tente novamente." << endl;
        }
    }

    return 0;
}