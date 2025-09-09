import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public void foo(){
        System.out.println("Foo!");
    }

    public static void main(String[] args) {
        // 이건 인스턴스가 아닌 클래스이기 때문에 그냥 실행을 할려면 static으로 선언된 메서드들이 실행이 될 수가 있다
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.println("Hello and welcome!");
        System.out.println("Hello and welcome!" + "in here" + 2 );
        System.out.println("Hello and welcome!" + "in here" + 2.1234 );
        // string+string 지원 string+int 는 ? 이것도 가능 int 를 string 으로 자동변환
        // string+float 는 ? 이것도 가능 int 를 string 으로 자동변환 , float 도 마찬가지임
        // 파란색으로 뜨는 숫자 같은 인스턴스 들은 primitive type or modifier(public , private.. ) , Number constant compiler generic이라고?..

        // 메모리는 아래에서 위로 갈 수록 스택 -> 힙 -> 데이터영역 -> ... 이런 식으로 진행

        //javac -encoding UTF-8 Main.java 을 터미널에서 실행을 하면 java.class 즉 바이트코드가 생성이 됨
        // 그리고 나서 터미널 창에 java Main 이라고 작성하면 이때 java 는 JVM 이고 , JVM 뒤에 Main 이라는 이름의 .class 파일 즉 바이트 코드를 실행하라고 하면 실행이 완료된다.
        // JVM -> java runtime environment
        // 즉 가상환경으로 작동하기 때문에 우리 메모리의 실제 구조를 건드리는게 아니라 , 그냥 남는 메모리에서 자기만의 샌드박스 같은걸 설정하고 이 코드를 실행하는 것 같은데

        Main myMain = new Main(); // 이건 힙에 인스턴스 생성하는 것 , myMain에 리턴되어 들어가는 값은 힙의 시작 주소
        myMain.foo();

        // call by value (copy value) / call by reference (copy address) : 본직적으로는 자바는 후자는 지원 안 하고 전자만 지원 한다고?
        // 1. 그러나 자바는 array를 지원하기에, 굳이 주소값으로 값을 전달하고 싶으면 , array 타입으로 만들어서 전달
        // 2. 아니면 인스턴스를 생성하는 것도 가능하다고? 왜냐하면 인스턴스 자체가 힙 상의 메모리 (시작주소)를 담고 있으니까

        // 뭔가를 코드로 짜고 싶다면 처음에 클래스를 짜야 한다

        // Scanner 을 검색하면 수 많은 클릭할 수 있는 것들이 뜨는데
        // 다른 파라미터 -> 즉 construct overloading 으로 만들어낸 같은 이름의 Scanner 클래스 같은 수 많은 클래스가 있다
        // 같은 baseclass에서 상속(is a)관계에 있는 객체 관계 안에서 자식이 자신의 특성값을 설정 하는 건 오버라이딩
        // 반면 function 오버로딩은 하나의 클래스 내에서 발생하는 것은 오버로딩 : 한 클래스 내에서 여러 생성자가 있다면 그건 오버로딩
        // 다른 클래스(자식 클래스)에서 변화된 인자들을 정의하는 것은 오버라이딩
        // 자바는 c++ 와는 다르게 어떤 클래스의 상속을 정의하고 싶을때는 class A extends B 라고 쓰고 , A(자식) is a B(부모)라고 그 관계를 정의한다

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        Double number1 = input.nextDouble(); // 슈발 노란 줄 왜 뜨노
        System.out.println("number1 :" + number1);

        System.out.println(1/2);
        System.out.println((double)1/2);
        System.out.println((double)(1/2));
    }
}