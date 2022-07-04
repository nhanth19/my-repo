// in js , function is a special object
// first-class function: function can use as everything

const strArray = ['JavaScript','MySql','PHP','Python','Java','HTML/CSS'];

function mapForEach(arr, fn) {
    const newArray = [];
    for (let i = 0; i < arr.length; i++) {
        newArray.push(fn(arr[i]));
    }
    return newArray;
};

const lenArray = mapForEach(strArray, item => item.length);

console.log(lenArray);