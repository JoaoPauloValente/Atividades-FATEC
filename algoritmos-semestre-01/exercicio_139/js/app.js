function Intervalo() {
    // Obter o valor do limite do formulário
    const max = parseInt(document.getElementById('Max').value);
    

    // Verificar se o valor inserido é um número
    

    // Inicializar uma string para armazenar os números ímpares
    let texto = " ";

    for (let i = 1 + 1; i < max; i++) {
        if(i % 3 == 0 && i % 5 == 0){
            texto += i + " ";
        }
    }
    console.log(texto)
    // Exibir o resultado na div resultado
    document.getElementById('n1').innerHTML = "<p>Número digitado: " + max + "</p>";
    document.getElementById('n2').innerHTML = "<p>2° Número digitado: " + texto + "</p>";

}