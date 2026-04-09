#include <iostream> //biblioteca para entrada e saída
#include <iomanip> //biblioteca para formatar a saída de casas decimais
using namespace std;

int main (){
    //passo 1: declaração de variaveis (tipagem estatica)
    int num1 = 0, num2 = 0, soma, sub, mult;
    float div;

    //passo 2: entrada de dados
    cout << "Digite o primeiro numero:"; cin >> num1;
    cout << "Digite o segundo valor:"; cin >> num2;

    //passo 3: Processamento (calculos aritmeticos)
    soma = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = num1 / num2;

    //passo 4: Saída de resultados Formatado
    cout << fixed << setprecision(2);
    cout << "soma:" << soma << endl;
    cout << "sub:" << sub << endl;
    cout << "mult:" << mult << endl;
    cout << "div:" << div << endl;
    
    return 0;
}