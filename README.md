# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 문자열 계산기 기능 요구사항
- [x] 문자열 값에 따라 사칙연산을 수행할 수 있어야한다.
- [x] 입력 문자열은 2 + 3 * 4 / 2 와 같다.
* - [x] 숫자와 사칙연산 사이에는 반드시 빈 공백 문자열이 있어야한다.
* - [x] 입력 값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
* - [x] 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
* - [x] 첫 문자와 끝 문자는 숫자여야한다. (사칙연산이 아니여야한다.)
- [x] 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
- [x] 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다

## 로또 기능 요구사항
- [x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- -[x] 로또는 1장당 6개의 번호를 랜덤으로 생성한다.
- -[x] 로또 번호는 1부터 45사이의 숫자여야한다.
- - [x] 구매한 로또를 한 줄씩 오름차순으로 출력한다.
- [x] 로또 1장의 가격은 1000원이다.
- - [x] 구매금액은 1000원이상이어야한다.
- - [x] 백원단위는 무시한다. (내림한다.)
- [ ] 지난 주 당첨 번호를 입력하면 수익률을 구한다.
* - [ ] 3개 일치, 4개 일치, 5개 일치, 6개 일치하는 갯수를 구한다.
* - [ ] 수익률은 총 당첨금액 / 총 로또 구입 금액이다.

