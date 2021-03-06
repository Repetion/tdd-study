### 1장. 다중 통화를 지원하는 Moeny 객체



**TDD의 리듬**

1. 테스트를 추가
2. 모든 테스트를 실행하고 새로 추가한 것이 실패하는지 확인
3. 코드를 수정
4. 모든 테스트 실행, 전부 성공하는지 확인
5. 리팩토링 통해 중복 제거 



- 반드시 코드를 작성하기 이전에 테스트를 먼저 작성
- `오퍼레이션`이 외부에서 어떻게 보일지에 대해서 생각한다.
  - `인터페이스`를 고려하기
- 외부에서 보이는 API의 형태부터 고민하는 것이 실제 구현부터 생각하는 것보다 낫다.
- 목적의 단순화
  - '다중 통화 구현' 이라는 목표에서 '테스트를 통과 시키기로 바뀜'
- `중복된 로직`이란 동일한 문장이 코드의 여러 장소에 나타나는 것을 의미한다.
  - `중복된 로직`을 하나로 끄집어내는 일엔 `객체`를 이용하는 것이 최고.
  - 중복을 제거하면 `의존성` 또한 제거된다.
    - `TDD`의 두 번째 규칙인 중복 제거가 존재하는 이유
- `TDD`의 핵심은 시작부터 이런 단계를 거쳐야하는 것이 아니라 문제 발생시 이러한 단계로 쪼갤 수 있어야 된다는 것