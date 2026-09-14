function solution(n) {
    let pizza = 6;
    while(true) {
        if(pizza % n === 0){
            return pizza / 6;
        }      
        pizza+=6;
    }
}