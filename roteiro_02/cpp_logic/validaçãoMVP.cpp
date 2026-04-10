#include <iostream>
#include <string> 
using namespace std;

int main() {
   
    string nome_do_produto;
    int quantidade_em_estoque;
    float preco_unitario;

    cout << "Digite o nome do produto: ";
    cin >> nome_do_produto; 
    
    cout << "Digite a quantidade em estoque: ";
    cin >> quantidade_em_estoque;
    
    cout << "Digite o preço unitário do produto: ";
    cin >> preco_unitario;

    cout << "-----------------------------------" << endl;


    if (quantidade_em_estoque < 0) {
    
        cout << "Erro: A quantidade não pode ser um valor negativo. Por favor, tente novamente." << endl;
    } else {
      
        cout << "RESUMO DO PRODUTO CADASTRADO" << endl;
        cout << "Nome: " << nome_do_produto << endl;
        cout << "Quantidade em estoque: " << quantidade_em_estoque << " unidades" << endl;
        cout << "Preço Unitário: R$ " << preco_unitario << endl;
    }

    return 0;
}