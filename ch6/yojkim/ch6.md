### 6. 돌아온 '모두를 위한 평등'



- 5장에서 테스트 케이스를 하나 통과하게 만들기 위해서 엄청난 `복사` - `붙여넣기`를 했다.
- 이를 처리하기 위해서, `리팩토링` 과정을 거쳐야 한다.
- 첫 번째 방법은 우리가 만든 클래스 중 하나가 다른 클래스를 상속 받도록 하는 것이다.
  - 그러나, 이 방법은 어떠한 문제의 해결책도 되지 못했다.
- 나머지 하나의 방법은 공통 클래스를 찾는 것이다.



- 충분한 테스트가 갖춰지지 않을 경우, `리팩토링`하면서 실수했음에도 불구하고 테스트가 통과되는 경우가 존재하게 된다.
- `리팩토링` 이후 무언가가 동작하지 않게되면 `리팩토링`에 대한 신뢰가 깨지게 되고, `리팩토링`의 빈도 수가 줄어든다면 설계의 질은 자연스럽게 저하된다.