//promises
function successCallback(result) {
    console.log("Audio file ready at URL: " + result);
}
  
function failureCallback(error) {
    console.error("Error generating audio file: " + error);
}

const promise = doSomething();
//then : return new callback -> callback catch the result of a previous promise
const promise1 = promise.then(successCallback, failureCallback);

// //promise chain
const promise2 = new Promise((resolve, reject) => {
    console.log("Initial");
  
    resolve();
  })
    //occur error , omit then
    .then(() => {
      throw new Error("Something failed");
  
      console.log("Do this");
    })
    .catch(() => {
      console.error("Do that");
    })
    .then(() => {
      console.log("Do this, no matter what happened before");
    });
console.log(promise2);

//ES2017 : async/ await
//promise rejection events
//