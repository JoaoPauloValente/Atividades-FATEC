let div = document.getElementById(`resultado`)
let btn = document.getElementById(`btn`)
let arrAlunos = [];

function cadastrar(){

    let aluno = {
        nome: document.getElementById(`nome`).value,
        idade: document.getElementById(`idade`).value,
        sexo: document.getElementById(`sexo`).value
    }

    arrAlunos.push(aluno);
    console.log(arrAlunos);

    document.getElementById(`qtd`).innerHTML =`
        <p class="alert alert-success">Quantidade de alunos cadastrados: ${arrAlunos.length}</p>
    `;

    div.innerHTML ="";

    for(let i = 0; i < arrAlunos.length; i++){

        div.innerHTML +=`
        
        <div class="col-4">
            <div class="m-3 border">
                <h2 class="display-5 p-3">${arrAlunos[i].nome}</h2>
                <hr>
                <p class="p-3">Idde: ${arrAlunos[i].idade}</p>
                <p class="p-3">Sexo: ${arrAlunos[i].sexo}</p>
            </div>
        </div>
        
        `
    }


}

btn.addEventListener(`click`, cadastrar);
