const myCar = {
    make: 'Ford',
    model: 'Mustang',
    year: 1969
};

const myObj = new Object(),
      str = 'myString',
      rand = Math.random(),
      anotherObj = new Object();

// Now, creating additional properties.
myObj.type              = 'Dot syntax for a key named type';
myObj['date created']   = 'This key is a string with a space';
myObj[str]              = 'This key is held in the variable str';
myObj[rand]             = 'A random number is the key here';
myObj[anotherObj]       = 'This key is the name of object anotherObj';
myObj['']               = 'This key is an empty string';

console.log( myObj);
console.log( myObj.myString );

let propertyName = 'make';
myCar[propertyName] = 'Ford';

propertyName = 'model';
myCar[propertyName] = 'Mustang';

function showProps(obj, objName) {
    let result = '';
    for (let i in obj) {
      // obj.hasOwnProperty() is used to filter out properties from the object's prototype chain
      if (obj.hasOwnProperty(i)) {
        result += `${objName}.${i} = ${obj[i]}\n`;
      }
    }
    console.log(result);
  }

showProps(myCar, 'myCar')