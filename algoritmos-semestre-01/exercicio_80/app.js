let nome_aluno = prompt("Digite o nome do aluno:");
let soma = 0;

for(i = 1; i<=2; i++){

    let nota = parseFloat(prompt(`Digite as duas notas:`));
    soma += nota;
    

}

    let media = soma/2;

if(media > 7 && media <=10){

    document.getElementById("resultado").innerHTML = `${nome_aluno} Sua média é ${media} e foi APROVADO!!`;

}else if(media < 5 && media >= 0){

    document.getElementById("resultado").innerHTML = `${nome_aluno} Sa média é ${media} e foi RETIDO!`;

}else if(media == 6){

    document.getElementById("resultado").innerHTML = `${nome_aluno} Sua média é ${media} Recuperação`;

}else{

    document.getElementById("resultado").innerHTML = `ERRO!!`;

}