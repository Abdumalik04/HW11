import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        Iphone phone=new Iphone();
        phone.name="Iphone 13 Pro Max";
        phone.gb="512 gb";
        phone.akb="100%";
        phone.sena="1500$";
        System.out.println("sena:"+phone.sena +"\n"+ phone.name + " \n"+ phone.gb  +" \n"+  phone.akb);
        //phone.getInfo();*/

/*        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        System.out.println(jash(age));
    }

    static int jash(int age){
        int jash=2023;
        return jash ;*/

/*
        double[] san = {1, 2, 3, 4.4, 5, 6, 7, 8, 9.9, 10};

        for (double num:san) {
            System.out.println(num);
        }*/

  /*      method(1, 2, 3, 4.4, 5, 6.6, 7, 8, 9.9, 10);
    }

    static void method(double... varags) {
        for (int i = 0; i<varags.length; i++){
            if (varags[i] == 4.4 || varags[i] == 6.6 || varags[i] == 9.9){
                System.out.println(varags[i]);



            }

        }
*/
        /*//TODO PASPORT



Pasport pasport=new Pasport();
pasport.firstName="Turatbek uulu";
pasport.lastName="Abdumalik";
pasport.gender="Man";
pasport.Strana="Kyrgyzstan";
pasport.yearOfBith=2004;
pasport.id=new Random().toString(10);

        System.out.println("Фамилия:\n"+pasport.firstName +"\n"+"Имя:\n"+ pasport.lastName +"\n"+"Род:\n"+ pasport.gender +"\n"+"Страна:\n"+ pasport.Strana +"\n"+"Год Рождения:\n"+ pasport.yearOfBith +"\n"+"ID:\n"+ pasport.id);*/
/*//TODO seosons klass

while (true){
    Seasons sezon=new Seasons();
    sezon.seasons();*/
        /*//TODO sabakta 4 misal

        Students student = new Students();
        student.group = "Java";
        student.name = "Adileet";
        student.age = 21;

        Students students1 = new Students();
        students1.group = "Java";
        students1.name = "Abdumalik";
        students1.age = 18;

        Students students2 = new Students();
        students2.group = "Java";
        students2.name = "Stalbek";
        students2.age = 28;

        Students students3 = new Students();
        students3.group = "Js";
        students3.name = "Erjigit";
        students3.age = 18;

        Students students4 = new Students();
        students4.group = "Js";
        students4.name = "Baxa";
        students4.age = 19;

        Students[] gruppa =new Students[] {student, students1, students2, students3, students4};
        int number = 0;
        int number1 = 0;
         double num=0;
        for (Students jav : gruppa) {
            if (jav.group.equals("Java")) {
                number++;

            } else if (jav.group.equals("Js")) {
                number1++;
            }
        }

        System.out.println("Java da:" + number);
        System.out.println("Js te:" + number1);
            for (Students js : gruppa) {
                num = js.age + num;
            }
            System.out.print(num/ gruppa.length   );*/
        System.out.println("Ведите:PIN KOD");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Account account = new Account();
            account.nameKarta = "MBANK";
            account.balance = 1000;
            account.id="28045740:ID";
            account.at="Turatbek uulu Abdumalik";
            double parol = scanner.nextDouble();
            if (parol == 2804) {
                System.out.println("Добро пожалавать в: " + account.nameKarta);
                System.out.println(account.at+"\n"+account.id);
                System.out.println("У вас на балансе: " + account.balance+":Сомов");
                System.out.println(account.balance +"+"+ account.diposite(500)+"="+account.balance+"Сомов");
                System.out.println(account.balance +"-"+ account.num(300)+"="+account.balance+"Сомов");
                System.out.println("У вас на балансе осталься:"+account.balance+"Сомов");
                System.out.println("Хорошого дня?");
            }else {
                System.out.println("Не Правилбный:PIN KOD");
        }
    }
}}










