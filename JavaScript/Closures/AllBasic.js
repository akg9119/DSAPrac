// Explain and implement a closure.
function outer() {
    let num = 1
    function inner() {
        num++;
        console.log(num);
    }
    return inner;
}
let count = outer();
// count();
// count();
// count();


// Create a counter using closures.

function counter() {
    let num = 0;
    return {
        increment: function () {
            num++;
            return num;
        },
        decrement: function () {
            num--;
            return num;

        },
        getCount: function () {
            return num;
        }
    }
}
let c = counter();
// console.log(c.increment());
// console.log(c.decrement());
// console.log(c.getCount());






