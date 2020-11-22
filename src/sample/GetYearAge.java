package sample;


public class GetYearAge {
    public static void main(String[] args){
        SetYearAge sya = new SetYearAge(25,1997);
        int NowYear = sya.year + sya.age;
        System.out.println("******Made by Clooney******");
        System.out.println("Вы родились в " + sya.year + " году");
        System.out.println("Сейчас вам " + sya.age +" лет");
        System.out.println("Сейчас " + NowYear + " год");
        

        

}
}