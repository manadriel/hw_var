public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {   //just make var
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog= " + dog + " cat= " + cat + " paper= " + paper);
        // Пишем код для задачи 1
    }
    public static void task2 () {   //add smthng 2 var
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog= " + dog + " cat= " + cat + " paper= " + paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog= " + dog + " cat= " + cat + " paper= " + paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend= " + friend);
        friend = friend + 2;
        System.out.println("friend+2= " + friend);
        friend = friend / 7;
        System.out.println("(friend+2)/7= " + friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog =" + frog);
        frog = frog * 10;
        System.out.println("frog * 10 =" + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 =" + frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxers = boxer1 + boxer2;
        System.out.println("Boxers =" + boxers);
        var differense = boxer1 - boxer2;
        System.out.println("Differense = " + differense);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var differense = boxer2 % boxer1;
        System.out.println("Differense = " + differense);
        differense = boxer2 - boxer1;
        System.out.println("Differense = " + differense);
    }
   public static void task8 () {
        System.out.println("Задача 8");
        var hours = 680;
        var hoursPerWorker = 8;
        var workers = hours/hoursPerWorker ;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers = workers + 94;
        hours = hoursPerWorker * workers;
       System.out.println("Если в компании работает " + workers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");

    }

}