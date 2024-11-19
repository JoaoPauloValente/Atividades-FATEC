let dia_da_semana = prompt("Digite um numero referente ao dia da semana;");

let dia = document.getElementById("resultado");

if(dia_da_semana == 0){

    dia.innerHTML = `<p class="alert alert-danger"> Domingo </p>`;

}else if(dia_da_semana == 1){

    dia.innerHTML = `Segunda`;

}else if(dia_da_semana == 2){

    dia.innerHTML = `Terça`;

}else if(dia_da_semana == 3){

    dia.innerHTML = `Quarta`;

}else if(dia_da_semana == 4){

    dia.innerHTML = `Quinta`;  

}else if(dia_da_semana == 5){

    dia.innerHTML = `Sexta`;

}else if(dia_da_semana == 6){

    dia.innerHTML = `Sábado`;

}else{

    dia.innerHTML = `<p class="alert alert-warning">Erro</p>`;
}
