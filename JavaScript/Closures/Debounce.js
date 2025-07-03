
function debounce(str,delay){
    let time;
   return function(...args){
    clearTimeout(time);
    time=setTimeout(()=>{
    str.apply(this,args);
    },delay);
   }

}
function search(input){
    console.log(input);
}
let cou = debounce(search,5000);
cou("a");
cou("ab");
cou("abc");



