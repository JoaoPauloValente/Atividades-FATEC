let numero01 = 5;
let numero02 = "5";
console.log(typeof numero01, typeof numero02);
console.log(numero01 == numero02);
console.log(numero01 === numero02);
console.log(numero01 > numero02);
console.log(numero01 <= numero02);

let numero03 = 8;
console.log(numero01 == numero02 && numero01 == numero03);
console.log(numero01 != numero02 && numero01 != numero03);
console.log(numero01 == numero02 && numero01 != numero03);

if(numero03%2 == 0){

    console.log("PAR");

}else{

    console.log("IMPAR")

}