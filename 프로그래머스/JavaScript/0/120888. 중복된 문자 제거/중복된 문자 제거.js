function solution(my_string) {
    let answer = my_string;
        let a=[...new Set(answer)].join('');
    return a;
}