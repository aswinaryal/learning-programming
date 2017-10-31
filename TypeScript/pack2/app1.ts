import {MathCommand} from './commands/MathCommand';
import {AddCommand} from './commands/AddCommand';
import {MathContext} from './commands/MathContext';

let ctx:MathContext = new MathContext(new AddCommand()); //Injecting dependecy 
ctx.doCalculation(50,150);