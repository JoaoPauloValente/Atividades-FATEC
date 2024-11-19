let btn = document.getElementById("btn");
let arrNum = [];


function cadastrar() {

    let num = parseFloat(document.getElementById(`joaopaulo`).value);
    arrNum.push(num);

    document.getElementById("qtdNum").innerHTML = `Quantidade de números digitados: ${arrNum.length}`

    //------------------------------
    //Números Separados por hashtag
    //------------------------------

    document.getElementById("hashtag").innerHTML = `Números Digitados:`
    document.getElementById("numImpares").innerHTML = `Números ímpares digitados:`
    document.getElementById("numSubstituidos").innerHTML = `Números ímpares Substituidos:`

    let somaimpar = 0;
    let qtdImpar = 0;
    for (let i = 0; i < arrNum.length; i++) {

        document.getElementById("hashtag").innerHTML += `${arrNum[i]} # `

        //------------------------------
        //Soma dos números ímpares
        //------------------------------

        if (arrNum[i] % 2 != 0) {

            somaimpar += arrNum[i];
            qtdImpar++

            document.getElementById("numImpares").innerHTML += `${arrNum[i]} -`

        }

        if (arrNum[i] % 2 == 0) {

            document.getElementById("numSubstituidos").innerHTML += ` @ - `

        }else{

            document.getElementById("numSubstituidos").innerHTML += `${arrNum[i]} -`
            
        }


        
    
  

    }

    document.getElementById("somaImpar").innerHTML = `Soma dos números ímpares: ${somaimpar}`
    document.getElementById("media").innerHTML = `Média dos números ímpares: ${somaimpar/qtdImpar}`

    console.log(arrNum);
}

btn.addEventListener(`click`, cadastrar)