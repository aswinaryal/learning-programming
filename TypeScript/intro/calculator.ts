export class Calculator{ //since we are importing this class in other classes, therefore we have to use export at the begining of class name.
	public add(x:number,y:number):number{
		return x+y;
	}
	public sub(x:number,y:number):number{
		return x-y;
	}
}