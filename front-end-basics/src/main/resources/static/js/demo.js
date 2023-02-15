function printStars(count) {
    console.log("*".repeat(count))
}

printStars(10);
// printStars("testMe");

separator();

let printStarsObject = function printStars() {
    console.log("*".repeat(20))
};

printStarsObject();

separator();

console.log(testMeHoisting + " " + typeof testMeHoisting);

var testMeHoisting;
testMeHoisting = "421i741287";
console.log(testMeHoisting + " " + typeof testMeHoisting);

let person = {
    firstName: "Nikolay",
    lastName: "Markov",
    age: 250,
    documentsNumbers: {id: 25, carId: 53},
    functions: {printStarsObject}
}

let keys = Object.keys(person);

let values = Object.values(person);


console.log(person.firstName);
console.log(person.middleName);

separator();

for (const key in person) {
    console.log(`obj.${key}=${person[key]}`);
}

separator();

person.functions.printStarsObject();
console.log(person.documentsNumbers.id);

separator();

values.forEach(v => console.log(v))

separator();

for (const key of keys) {
    console.log(`obj.${key}=${person[key]}`);
}

function separator() {
    console.log("------------------------------------------")
}

// Why Is JS Weird ? Why Is JS Weird ? Why Is JS Weird ?

// Number(true); // -> 1
// Number(false); // -> 0
// 1 + 0; // -> 1
console.log( true + false);
separator();

// [,,,] outputs an array with three empty slots. The last comma is a trailing comma.
console.log([, , ,].length);
separator();

// The extremely simplified answer is that the arrays are converted to strings and are then concatenated.
console.log([1, 2, 3] + [4, 5, 6]);
separator();

// This is a standard dilemma of comparing floating-point values. Instead of comparing two floating points directly,
// one should compare the floating points with some level of tolerance
console.log(0.2 + 0.1 === 0.3);
separator();

// The comma operator simply returns the value of the last operand.
console.log(10, 2);
separator();

// You can add two exclamation marks before any value to get its corresponding boolean primitive.
// The technical term for this is double NOT (yes, really, Borat would love it)
console.log(!!"");
separator();

// Arrays are truthy, hence the double NOT operator will output true.
// The plus character then converts true to its numeric representation: 1.
console.log(+!![]);
separator();

// The parseInt function converts its first argument into a string (if it isn't one already) and then to a number.
// When 0.0000005 is converted into a string, this happens:
parseInt(0.5); // -> 0
parseInt(0.05); // -> 0
parseInt(0.005); // -> 0
parseInt(0.0005); // -> 0
parseInt(0.00005); // -> 0
parseInt(0.000005); // -> 0
parseInt(0.0000005); // -> 5
console.log(parseInt(0.0000005));
separator();

// According to the rules of abstract equality comparison, both of these values are converted to numbers when compared.
console.log(true == "true");
separator();

// 010 is treated as an octal number by JavaScript. Thus, its value is in base 8.
// The MDN Web Docs provides a brief explanation of octal numbers.
console.log(010 - 03);
separator();

// These two empty strings are both converted to 0.
console.log("" - -"");
separator();

// Null converts to its numeric representation: 0.
console.log(null + 0);
separator();

// As there is no meaningful numerical answer to the equation 0/0, the output is simply NaN.
console.log(0 / 0);
separator();

// JavaScript treats both of these values as infinite, and infinity is equal to infinity. Learn more about infinities.
// 1/0; // -> Infinity
// 10 ** 1000; // -> Infinity
// Infinity > Infinity; // -> false
console.log(1/0 > 10 ** 1000);
separator();

//Our first and only syntax error. => true++
// console.log(true++);
// separator();

// While the addition operator (+) is used both for numbers and strings, the subtraction operator (-) has no use for
// strings, so JavaScript interprets this as an operation between numbers. An empty string is type coerced into 0.
console.log("" - 1);
separator();

// null is coerced into 0.
console.log(true + ("true" - 0));
separator();

// Putting a solemn exclamation mark, also known as the logical NOT operator, before a non-Boolean value will convert
// it to a boolean value opposite of what the Boolean function would convert it into.
console.log(!5 + !5);
separator();

// JavaScript will execute these operations from left to right. String concatenation will take priority when
// the number three is added with the string three.
console.log(1 + 2 + "3");
separator();

// The ECMAScript Language Specification explains NaN as a number value that is a IEEE 754 “Not-a-Number” value.
// It might seem strange, but this is a common computer science principle.
//
// There are some odd issues surrounding NaN in JavaScript, however. For instance, this is one of the two only
// instances where the Object.is function disagrees with triple equals.
console.log(typeof NaN);
separator();

// While false can be converted to a number, undefined cannot.
console.log(undefined + false);
separator();

// Chances are that you've only ever used the logical AND operator in if-statements, but when used by itself it actually
// returns the value of one of the operands. If the first expression is truthy, then it returns the second. Otherwise,
// it returns the first. An empty string is falsy, hence it returns the first operand.
console.log("" && -0);
separator();

// The finale combines some of the bizarre syntax that I've covered in this quiz. I've explained all of this behavior
// already in the explanations above, except for the multiplication operator (*), which will coerce the empty string
// into its numeric equivalent: 0.
console.log(+!!NaN * "" - -[,]);
separator();
