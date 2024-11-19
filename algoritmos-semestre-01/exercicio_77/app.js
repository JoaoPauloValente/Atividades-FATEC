let nota_01 = parseInt(prompt("Digite a 1º nota:"));
let nota_02 = parseInt(prompt("Digite a 2º nota:"));
let nota_03 = parseInt(prompt("Digite a 3º nota:"));
let nota_04 = parseInt(prompt("Digite a 4º nota:"));
let nota_05 = parseInt(prompt("Digite a 5º nota:"));

let media = nota_01+nota_02+nota_03+nota_04+nota_05/5;

document.getElementById(`resultado`).innerHTML = `A média é: ${media}`;


console.log(`A média é: ${media}`)