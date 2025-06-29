console.log("aniket");
// Reverse a string without using .reverse().
function Reverse_string(str){
let newStr = str.split('').reverse().join('');
console.log(newStr);

let secondStr = '';
for(let i=str.length-1;i>=0;i--){
    secondStr+=str[i];
}
console.log(secondStr);
}
let str = "Aniket";
Reverse_string(str)