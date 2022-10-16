//SSBBNNU
//S=string,S=Symbol
//B=Boolean,B=BigInt
//N=Null,N=Number
//U=Undefined

console.log("Good Morning")

//Practice Q
//Q.To find data type of the variable?

//To get to know the type of Data type use typeOf 
let f = "Harry";
let g = 6;
console.log(typeof (f+g));

//Q.CAn we chance value of const variable
 const h ={
   name:"Anshul",
   section:"A",
   isPrincipal:false
  
 }
h=45; //WONT WORK
//but
h['friend']="Ashutosh"
console.log(h)
//WILL WORK

//Q. Create a word meaning dictionary with JS
const dict = {
  ablution:"pious",
  adulation: "coax,cajolery,obeisance",
  obscure:"clear"
}
console.log(dict['obscure'])
