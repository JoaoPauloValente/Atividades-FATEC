let numero= parseInt(prompt("Digite um valor positivo:"));

if(numero > 0){

    for(let i = numero; i >= 1; i--){

        numero*= i;

    }

    console.log(`${numero}`);

}else{

    console.log(`1`);

}