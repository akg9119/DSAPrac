function frequency_char(str){
    let obj ={};
    for(let i = 0 ;i<str.length;i++){
        let char = str[i];
        if(char==" ")continue;
        if(obj[char]){
            obj[char]++;
        }else{
            obj[char]=1;
        }
    }
    console.log(obj);

}
let input = "hello world";
frequency_char(input);
