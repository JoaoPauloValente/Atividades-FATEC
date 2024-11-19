let positivo = 0;
let negativo = 0;
let nulo = 0;

for( i = 1; i <=10; i++){

    let numeros = parseFloat(prompt("Digite um valor: "));

if( numeros > 0){

    positivo++

}else if(numeros < 0){

    negativo++
        
}else if(numeros == 0){

    nulo++
    
}else{

    document.getElementById("resultado").innerHTML = 'ERRO'

}

document.getElementById("resultado_2").innerHTML = `${positivo} números são positivos`
document.getElementById("resultado_3").innerHTML = `${negativo} números são negativos`
document.getElementById("resultado_4").innerHTML = `${nulo} números são nulos`

}
