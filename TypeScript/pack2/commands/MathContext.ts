import {MathCommand} from './MathCommand';

export class MathContext{
	private cmd:MathCommand;//Object created but not instantiated; so that we can't access members using this object.

	public constructor(cmd:MathCommand){
		this.cmd = cmd;
	}

	public doCalculation(x:number,y:number){
		console.log(this.cmd.calculate(x,y));
	}
}
