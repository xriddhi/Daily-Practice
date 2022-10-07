//6 Oct 2022
//1.Intro to Javascript

//7 Oct 2022
//2. Var Vs Let vs Const

console log("Hi!")


console.log("Var Vs Let Vs Const")
var a= 17;
var a="Riddhi";
console.log(a)
// will print 5
// var can be redeclared as well as be updated


let b = 17;
b="String";
console.log(b)
//will print String
// let can be updated but cannot be redeclared

const c =17;
//c=18;
console.log(c)
//error
// const cannot be changed
// cant be updated nor can it be redeclared

// Let and Const are Block scoped variables
{let d=9;
console.log(d)
}
let d=2;
console.log(d)

//scope lies within block


{const e=17;
console.log(e)
}
const e=18;
console.log(e)

//scope lies within block
