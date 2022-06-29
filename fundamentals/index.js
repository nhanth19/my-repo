// - scope :
//   + global scope
//   + local scope
//   + before ECmas2015 doesn't have block scope : var
//   + block scope : let, const
if(true) {
  var x= 6;
}
console.log(x);

if(true) {
   let y = 7;
}
// console.log(y);

//hoisting

//- literals
//  + array literal
let coffees = ['French Roast ','Water','Vegetables'];

//- controll flow: if , switch
//  + falsy value: a false value when encountered in a boolean context.

//- loop:
//  + label statement : identify code and use it another where
markLoop : 
while(a == true) {
  console.log("true");
}
// + for in:
// + for of:


