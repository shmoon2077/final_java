package java011;

public class Score2Print {

    public void show(Score2[] std) {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t   국어\t   영어\t   수학\t   평균\t   합격여부");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        
        for (Score2 student : std) {
            System.out.printf("%s\t   %d\t   %d\t   %d\t   %.2f\t   %s\n",
                    student.getName(), student.getKor(), student.getEng(), student.getMath(),
                    student.getAvg(), student.getPass());
        }
    }
}