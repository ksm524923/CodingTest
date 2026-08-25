def solution(numbers):
    answer = 0
    for i in numbers:
        answer+=i
        i+=1
        
    return answer/len(numbers)