

let valor_inicial= parseInt(prompt("Digite valor inicial"));
let valor_final= parseInt(prompt("Digite o valor final"));
let soma = 0;

if (valor_inicial >= 1 && valor_final >=1){

    if(valor_inicial > valor_final){

        let aux = valor_inicial;
        valor_inicial = valor_final;
        valor_final = aux;

    }

    for(let i = valor_inicial; i <= valor_final; i++){

    soma += i; 

        }


    console.log(soma) 

}else{

    console.log("Erro! o valor é menor que 1")

}

