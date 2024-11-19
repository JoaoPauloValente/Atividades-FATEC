
for(i = 1; i <= 5; i++){

    let numeros = parseFloat(prompt("Digite um vallor: "));

    let potenciacao = Math.pow(numeros,2);

    document.getElementById("resultado").innerHTML += `O quadrado do número ${numeros} é ${potenciacao}<br>`;

}