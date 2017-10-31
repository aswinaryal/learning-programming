import {Calculator} from "./calculator";

let calc:Calculator = new Calculator();
//calc.sub("5","3");//shows error since typescript is stric for type checking
let x = calc.add(5,3);
console.log(x);