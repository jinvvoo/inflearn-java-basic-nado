package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14;        // 결과 3.14
        float f = 3.14F;       // 3.14뒤에 F를 붙여야 double형변환 / 결과 3.14
        System.out.println(d);
        System.out.println(f);

        double dd = 3.14123456789;
        float ff = 3.14123456789F;       // 반올림 // 3.14뒤에 F를 붙여야 double형변환
        System.out.println(dd);
        System.out.println(ff);

        long l = 1000000000000L;        // int 는 -21억 ~ 21억 \\// long 으로
        System.out.println(l);

        long ll = 1_000_000_000_000L;
        System.out.println(ll);
    }

    // int, long, float, double, char, String, boolean

}
