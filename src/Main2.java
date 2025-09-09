//public class Main2 {
//    public static void main(String[] args){
//        System.out.println(1/2);
//        System.out.println((double)1/2);
//        System.out.println((double)(1/2));
//        System.out.println(0xFFFF); // when print -> hex to Deci autonomically
//        System.out.println(1.0/3.0); // double : when just write like n.n its processed autonomically double format
//        System.out.println(1.0F/3.0F); // float : when write like n.n with float nomination its processed float format
//
//        long CreditCardNumber = 2324_4345_4519_3415L; // 자바는 10진수에 대해 이렇게 언더바를 통한 끊어쓰기 기능을 제공
//        System.out.println("CreditCardNumber: " + CreditCardNumber);
//        System.out.println(1-0.1-0.1-0.1-0.1-0.1);
//        final double EPSILON = 1E-10; // 만약 double이나 floating point 를 쓰는 경우의 loop 을 멈추고 싶다면 epsilon 을 써라는데
//        double x = 1.0;
////        while(true){
////            if(x == 0.5){
////                break;
////            }else{
////                System.out.println("x: " + x);
////            }
////            x = x-0.1;
////        } // 이렇게 하면 끝이 나지 않는다고?
//
////        -> 기대대로라면 언젠가 0.5가 나와서 break가 걸려야겠죠?
////
////        하지만 실제로는 x가 정확히 0.5가 되지 않고 0.5000000000000001 같은 식으로 떨어집니다.
////
////        즉, x == 0.5 조건이 영원히 false → 무한루프 :
////        같은 double 타입인 것과는 별개로 애초에 우리의 10진수 소수는 딱 떨어지지 않는 무한 소수 이기에 같은 double 타입이라도 완벽히 같은 수 표현할 수 없음
//        while(true){
//            if(Math.abs(x-0.5) < EPSILON){
//                break;
//            }else{
//                System.out.println("x: " + x);
//            }
//            x = x-0.1;
//        } // 이렇게 해야 끝이 난다는데
//        int number = 11;
//        boolean even = number%2 ==0; // boolean : true or false 가 있으니까 >0 이런거 쓰지 말라는데 아 뭔 소리고
//        System.out.println("even: " + even);
//        char letter = 'A';
//        char letter2 = '\u0041';
//        char ch = 'a';
//        System.out.println(ch++);
//        System.out.println(++ch);
//        System.out.println(ch+1); // 이렇게 하면 99가 나오는데 아마 ch 가 char 에서 integer 로 스위칭 되서 더해지니까 결과도 int 가 되는 것
//
//        int k = '2' + '3' ; // ascii code 상으로는 50 , 51
//        System.out.println("k: " + k);
//
//        System.out.println("(char)k: " + (char)k);
//        String welcome = "Welcome to Java"; // String 은 애초에 클래스만 있고 primitive 타입 자체가 없는 듯 java 에서랑 C++ 는 그랬던 것 같아
//        String welcome2 = "Welcome to Java";
//        if(welcome == welcome2) //  자바는 String 클래스의 두 인스턴스를 .equals() 로 비교할 수도 , == 으로 비교할 수도 있다 좋네
//            System.out.println("same");
//        else System.out.println("different");
//
//        char *Str = "Welcome";  // 얘는 text segment 에 저장 되는 거라서 수정도 안 됨
//        // 스택(위 rw) -> 힙(rw) -> data segment(rw) -> read-only data segment(r) -> text segement(r)
//        char str[10] = "welcome"; // 이건 array - > 스택에 저장되므로 rw 가능 따라서 수정됨
//        String Welcome = "Welcome"; // 이건 read-only data segment 영역 이므로 주소를 저장할 것 같지만
//        String welcome2 = "Welcome"; // 이렇게 하면 자바는 어차피 read-only data segment 영역에 이미 있는 값이라서 주소를 welcome의 주소와 같은 주소로 할당
//        // 그래서 welcome == welcome2 로 처리되는 것 -> 분명 String 하면
//        String welcome3 = new String("Welcome"); //  이건 또 조금 다르게 힙에 공간이 할당되고 welcom3는 그 힙의 주소를 가지니 welcome , welcom2 와 비교하면 다르다는 결과가 나온다
//
//        String s = welcome3 + "123"; // 을 하면 완전 다른 constant 이고 , 어쨋든 같은것이 없으면 text segment의 다른 영역에 저 값을 복사하고 추가한 그 값까지 해서 새로운 곳에 저장함.
//        // 근데 == 이면 주소를 가져다가 비교하지만 , .equals 를 이용하면 완전 그 content 를 이용해서 비교 하기 때문에 주소가 어디던
//        // 그 실제 content 를 비교해서 아스키 코드 상의 값이 같고 아니고를 판단.compare 을 하면 같으면 0 뭐 작거나 크면 음수 또는 양수를 반환함
//
//        //
//    }
//}
//
//// java double vs Double -> its concept is like Integer vs integer
//// Integer , Double 은 class (java.lang 패키지에서 제공 ) -> implemented with some primitive types and other class
//// 반면 int, double 는 primitive type supported by java Compiler
//
//// ++ch 와 ch++ 가 안의 함수의 구현이 다르구나
////char temp;
////temp = ch;
////ch ++1 ;
////return temp 면 ch++이고 , return ch 면 ++ch 이다
