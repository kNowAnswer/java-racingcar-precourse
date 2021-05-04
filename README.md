# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 요구 사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다.전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9사이에서 random값을 구한 후 random값이 4이상일 경우 전진하고, 3이
하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다

## 구현할 기능 목록

1. ~~Random값(0 ~ 9) 받기~~ - 완료
1. ~~Random값에 따른 전진 / 멈춤 구현~~ - 완료
1. ~~사용자 입력 횟수에 따른 자동차 전진 횟수 확인~~ - 완료
1. ~~여러 자동차로 전진 횟수 확인~~ 완료
    1. ~~Car 클래스에 name 필드 추가~~
    1. ~~CarsTest 작성~~
    1. ~~RaceResults 작성~~
1. ~~우승 확인~~ - 완료
    1. ~~WinnerTest 작성~~
1. ~~사용자 입력 받기~~ - 완료
1. ~~자동차 경주 시각화~~
    1. ~~Car 클래스 출력~~
    1. ~~시도 횟수별 출력~~
    1. ~~랜덤 숫자 입력을 위한 생성자 작성~~
    1. ~~최종 결과 출력~~
1. 2주차 요구사항
    1. 일급콜렉션
    1. 원시값, 문자열 포장
