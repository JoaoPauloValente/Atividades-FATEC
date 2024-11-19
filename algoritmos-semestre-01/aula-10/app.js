let div = document.getElementById(`resultado`);
let btn = document.getElementById(`btn`);
let getNameInput = document.getElementById(`nome`)

let arrNomes = [];

function cadastrar(){

    let nomeDoInput = document.getElementById(`nome`).value
    arrNomes.push(nomeDoInput);
    console.log(arrNomes)

    div.innerHTML = "";

    for(let i = 0; i < arrNomes.length; i++){


        if(i%2 == 0){

            div.innerHTML += `<p class=" alert alert-danger"> ${arrNomes[i]}</p>`

        }else{

            div.innerHTML += `<p class=" alert alert-success"> ${arrNomes[i]}</p>`

        }

    }

    getNameInput.value = "";
    getNameInput.focus();
}

btn.addEventListener(`click`, cadastrar);