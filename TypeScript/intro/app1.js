//Object Oriented way of writing code in javascript
function Calculator(){
	return{
		add:function(x,y){
			return x+y;
		},
		sub:function(x,y){
			return x-y;
		}
	};
}

var calc = new Calculator();
console.log(calc.add(3,5));
console.log(calc.sub(5,2));
console.log(calc.sub("5","2"));//same as above statement, since javascript doesn't has type checking