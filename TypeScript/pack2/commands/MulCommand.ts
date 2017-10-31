import {MathCommand} from './MathCommand';

export class MulCommand implements MathCommand{
	public calculate(x:number,y:number):number{
		return x*y;
	}
}