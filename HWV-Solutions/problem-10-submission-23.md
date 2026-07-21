# 점수 구간별 학점 변환기

- 난이도: 쉬움
- 핵심 문법: 조건문
- 테스트 결과: 3/3 통과

## 문제 설명

학생의 점수 score가 매개변수로 주어집니다. 점수를 10으로 나눈 몫을 기준으로 switch문을 사용하여 학점을 결정하고 반환하는 메서드를 작성하세요. 90점 이상은 'A', 80점 이상은 'B', 70점 이상은 'C', 60점 이상은 'D', 60점 미만은 'F'를 반환합니다. 단, 100점은 'A'입니다.

## 제출 코드

~~~java
public class Main {
    public static String solution(String input) {
        int num=Integer.parseInt(input)/10;
        switch(num){
            case 10:
                return "A";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
        }
        return "F";
    }

    public static void main(String[] args) throws Exception {
        String input = new String(System.in.readAllBytes()).trim();
        System.out.print(solution(input));
    }
}

~~~
