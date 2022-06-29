//functions declaration: hoist
//pass by value
function myFunc(theObject) {
    theObject.make = 'Toyota';
}
  
var mycar = {make: 'Honda', model: 'Accord', year: 1998};
var x, y;
  
x = mycar.make; // x gets the value "Honda"
  
myFunc(mycar);
y = mycar.make; // y gets the value "Toyota"
// (the make property was changed by the function)

//function expression : easy to pass as parameter to another function
const square = function(number) { 
  return number * number 
}
var x = square(4)

function map(f, a) {
    let result = []; // Create a new Array
    let i; // Declare variable
    for (i = 0; i != a.length; i++)
      result[i] = f(a[i]);
    return result;
}
const f = function(x) {
  return x * x * x;
}
let numbers = [0, 1, 2, 5, 10];
let cube = map(f,numbers);
console.log(cube);

//nested func: "closures", inner func contains the scope of outer func, and no reverse. 
//closures: 
function addSquare(a,b) {
  function square1(x) {
    return x * x;
  }
  return square1(a)+square1(b);
}
a = addSquare(2 , 3);
b = addSquare(3, 4);
c = addSquare(4,5)

var pet = function(name) {   // The outer funct defines a variable called "name"
  var getName = function() {
    return name;       // The inner funct has access to the "name" variable of the outer func
  }
  return getName;            // Return the inner func, thereby exposing it to outer scopes
}
myPet = pet('Vivie');

myPet();                     // Returns "Vivie"


// func paramter : default para, rest para == variable para in java
function multiply(mul, ...arr) {
  return arr.map(x => mul * x);
}

var result1 = multiply(2,2,1,3);
console.log(result1);

//arrow func: shotest func, non-binding of "this"
var a= [
  'Hydrogen',
  'Helium',
  'Lithium',
  'Beryllium'
];

var a2 = a.map(function(s) {
  return s.length;
})

console.log(a2);
var a3 = a.map(s => s.length);
console.log(a3);