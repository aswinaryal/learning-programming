import {MathCommand} from './commands/MathCommand';
import {AddCommand} from './commands/AddCommand';
import {SubCommand} from './commands/SubCommand';


let cmd:MathCommand = new AddCommand();
console.log(cmd.calculate(15,15));

let cmd1:SubCommand = new SubCommand();
console.log(cmd1.calculate(20,5));


