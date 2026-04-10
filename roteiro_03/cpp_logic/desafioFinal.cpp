#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    int opcao = 0;
    

    vector<string> nomes;
    vector<int> quantidades;
    vector<float> precos;


    while (opcao != 3) {
        cout << "\n=== Sistema da Sorveteria ===" << endl;
        cout << "1. Adicionar novo produto" << endl;
        cout << "2. Listar produtos em estoque" << endl;
        cout << "3. Sair" << endl;
        cout << "Escolha uma opcao: ";
        cin >> opcao;

        if (opcao == 1) {
        
            string nome_temp;
            int qtd_temp;
            float preco_temp;

            cout << "\nDigite o nome do sabor: ";
            cin >> nome_temp;
            

            do {
                cout << "Digite a quantidade (nao pode ser negativa): ";
                cin >> qtd_temp;
                if (qtd_temp < 0) {
                    cout << "Erro: A quantidade deve ser 0 ou maior.\n";
                }
            } while (qtd_temp < 0);

            cout << "Digite o preco: ";
            cin >> preco_temp;


            nomes.push_back(nome_temp);
            quantidades.push_back(qtd_temp);
            precos.push_back(preco_temp);
            
            cout << "-> Produto cadastrado com sucesso!" << endl;

        } else if (opcao == 2) {

            cout << "\n--- Produtos em Estoque ---" << endl;
            

            if (nomes.size() == 0) {
                cout << "Nenhum produto cadastrado ainda." << endl;
            } else {

                for (int i = 0; i < nomes.size(); i++) {
                    cout << "Sabor: " << nomes[i] 
                         << " | Qtd: " << quantidades[i] 
                         << " | Preco: R$ " << precos[i] << endl;
                }
            }

        } else if (opcao != 3) {
            cout << "\nOpcao invalida! Tente novamente." << endl;
        }
    }

    cout << "\nSaindo do sistema. Ate logo, Dener!" << endl;

    return 0;
}