// synchronous
function makeGreeting() {
    return `Hello , my name is ${name}`;
}

const name = 'Miriam';
const greeting = makeGreeting(name);
console.log(greeting);

// asynchronous
// promise is a current state object returned by an asynchronous function
//  + pending
//  + fulfilled
//  + rejected
// then return a promise
// catch : 
// const fetchPromise = fetch('https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json');

// console.log(fetchPromise);

// fetchPromise
//     .then( response => {
//         if(!response.ok) {
//             throw new Error(`HTTP error : ${response.status}`);
//         }
//         return response.json();
//     })
//     .then ( data => {
//         console.log(data[0].name)
//     })
//     .catch(error => {
//         console.error(`Could not get products: ${error}`);
//     });

// console.log("Started request...");

//async, await
// await : before a call to function that return a promise
// async function fetchProducts() {
//     try {
//         const response = await fetch()
//     }
// }


// js is a single thread -> one call stack(LIFO) -> handle tasks -> event loop
// event loop :
//   call stack 
//   web APIs: Ajax , setTimeOut, setInterval, Dom event
//   callback queue : wait callbacks of WebAPIs return 
var action = setTimeout(function() {
    console.log('setTimeout');
}, 3000);

// clearTimeout(action);

var action1 = setInterval(function() {
    console.log("setInterval")
}, 3000);
clearInterval(action1);