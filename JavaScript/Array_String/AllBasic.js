console.log("aniket");

// Reverse a string without using .reverse()
function Reverse_string(str) {
    // Using built-in methods (just for demonstration)
    let newStr = str.split('').reverse().join('');
    console.log("Using built-in reverse:", newStr);

    // Manually reversing the string
    let secondStr = '';
    for (let i = str.length - 1; i >= 0; i--) {
        secondStr += str[i];
    }
    console.log("Using manual reverse:", secondStr);
}

// Example usage:
// let str = "Aniket";
// Reverse_string(str);


//  Check if a string is a palindrome
function Palindrome_string(str) {
    let org = str;

    // Using built-in reverse to check
    let newStr = str.split('').reverse().join('');
    if (org === newStr) {
        console.log("Yes, it's a palindrome (built-in check)");
    } else {
        console.log("No, it's not a palindrome (built-in check)");
    }

    // Manually checking using loop
    let secondStr = '';
    for (let i = str.length - 1; i >= 0; i--) {
        secondStr += str[i];
    }
    if (org === secondStr) {
        console.log("Yes, it's a palindrome (manual check)");
    } else {
        console.log("No, it's not a palindrome (manual check)");
    }
}

// Example usage:
// let str = "AnA";
// Palindrome_string(str);


// Find the first non-repeating character in a string
function Non_repeating_char(str) {
    let obj = {};

    // Count frequency of each character
    for (let i = 0; i < str.length; i++) {
        let char = str[i];
        obj[char] = (obj[char] || 0) + 1;
    }

    // Find the first character with frequency 1
    for (let v of str) {
        if (obj[v] === 1) {
            console.log("First non-repeating character:", v);
            break;
        }
    }
}

// Example usage:
// let str = "aniketasni";
// Non_repeating_char(str);


// Flatten a nested array ([1, [2, [3, 4]]] → [1, 2, 3, 4])
function Flatten(arr) {
    let result = [];

    for (let m of arr) {
        // If element is an array, recursively flatten it
        if (Array.isArray(m)) {
            result = result.concat(Flatten(m));
        } else {
            // If not an array, add it to the result
            result.push(m);
        }
    }

    return result;
}

// Example usage:
// let arr = [1, [2, [3, 4]]];
// let val = Flatten(arr);
// console.log("Flattened array:", val);


//  Remove duplicates from an array
function Remove_duplicates(arr) {
    // Using Set to store only unique values
    let uniqueSet = new Set(arr);

    // Convert Set back to Array if needed
    let uniqueArray = [...uniqueSet];
    console.log("Array without duplicates:", uniqueArray);
}

// Example usage:
// let arr = [1, 2, 3, 2, 4, 1];
// Remove_duplicates(arr);
