//class-based vs prototype-based
//create constructor function
function Employee() {
    this.name = '';
    this.dept = 'general';
};

function Manager() {
    Employee.call(this);
    this.report = [];
}
// equal with extend class
Manager.prototype = Object.create(Employee.prototype);
Manager.prototype.constructor = Manager;

function WorkerBee() {
    Employee.call(this);
    this.projects = [];
}
WorkerBee.prototype = Object.create(Employee.prototype);
WorkerBee.prototype.constructor = WorkerBee;

function Engineer(mach) {
    WorkerBee.call(this);
    this.machine = mach || '';
    this.dept = 'engineering';
}
Engineer.prototype = Object.create(WorkerBee.prototype);
Engineer.prototype.constructor = Engineer;

function SalesPerson() {
    WorkerBee.call(this);
    this.quota = 100;
    this.dept = 'sales';
}
SalesPerson.prototype = Object.create(WorkerBee.prototype);
SalesPerson.prototype.constructor = SalesPerson;

//create objects
var jim = new Employee;
var sally = new Manager;
var mark1 = new WorkerBee;
var mark2 = new WorkerBee;
var fred = new SalesPerson;
var jame = new Engineer;

//add properties at run time
mark1.bonus = 300;
WorkerBee.prototype.specialty = 'none'; //add pro to all object inherited from prototype

console.log(jim);
console.log(sally);
console.log(mark1);
console.log(mark2);
console.log(fred);
console.log(jame);
console.log(fred.specialty);
console.log(sally.specialty)

function Engineer1(name, props, mach) {
    this.base = WorkerBee;
    this.base(name, 'engineering', props);
    this.machine = mach || '';
}

var jane = new Engineer1('Doe, Jane', ['navigator', 'javascript'], 'belau');
console.log(jane)
Employee.prototype.specialty = 'none';

//js is single inherit