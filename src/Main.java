//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задание 1
   var dog = 8.0;
   var cat = 3.6;
   var paper = 763789;
    System.out.println("dog " + dog + " cat " + cat + " paper " + paper);

    // задание 2
        dog = dog + 4;
       cat = cat + 4;
       paper = paper + 4;
        System.out.println("dog " + dog + " cat " + cat + " paper " + paper);

        // задание 3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog " + dog + " cat " + cat + " paper " + paper);


        //задание 4
        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //задание 6
        var b1 = 78.2;
        var b2 = 82.7;
        var massa = b1 + b2;
        var raznica = b2 - b1;
        System.out.println("общий вес - "  + massa);
        System.out.println("разница в весе - " + raznica);

        // задание 7
        var ost = b2 % b1;
        System.out.println("остаток - " + ost);

        //final
        var hourAll = 640;
        var hourOnEmployee = 8;
        var employee = hourAll / hourOnEmployee;
        System.out.println("в компании работает " + employee + " сотрудников");

        employee = employee + 94;
        hourAll = employee * hourOnEmployee;
        System.out.println("если в компании работает " + employee + " человек, то всего " + hourAll + " часов может быть поделено между сотруднкиами");

  //задание 1
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.1f;
        double f = 6.1;
        System.out.println("значение переменной a c типом int = " + a);
        System.out.println("значение переменной b c типом byte = " + b);
        System.out.println("значение переменной c c типом short = " + c);
        System.out.println("значение переменной d c типом long = " + d);
        System.out.println("значение переменной e c типом float = " + e);
        System.out.println("значение переменной f c типом double = " + f);

        //задание 2

        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;

        //задание 3;

        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        int teacherAll = teacherOne + teacherTwo + teacherThree;
        int paperAll = 480;
        int paperForStudent = paperAll / teacherAll;
        System.out.println("на каждого ученика рассчитано " + paperForStudent + " листов бумаги");

// задание 4


     byte productivityPerMinute = 9;
     int productivity2 = productivityPerMinute * 20;
     int productivity3 = productivityPerMinute * 1440;
     int productivity4 = productivity3 * 3;
     int productivity5 =  productivity3 * 30;
     System.out.println("за 20 минут машина произвела " + productivity2 + " штук бутылок");
     System.out.println("за сутки машина произвела " + productivity3 + " штук бутылок");
     System.out.println("за трое суток машина произвела " + productivity4 + " штук бутылок");
     System.out.println("за месяц машина произвела " + productivity5 + " штук бутылок");


     //задание 5

     byte cansPerClass = 2 + 4;
     int classInShool = 120 / cansPerClass;
     int whitePaint = classInShool * 2;
     int brownPaint = classInShool * 4;
     System.out.println("в школе, где " + classInShool + " классов нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");


     //задание 6
     short bananas = 5 * 80;
     short milk = 2 * 105;
     short iceCream = 2 * 100;
     short egg = 4 * 70;
     int gramm = bananas + milk + iceCream + egg;
     float kg = gramm / 1000f;
     System.out.println("грамм = " + gramm + "; кг = " + kg + ";");

     //задание 7
     short grammAll = 7 * 1000;
     int diet1 = grammAll / 250;
     int diet2 = grammAll / 500;
     System.out.println("диета 1 занимает " + diet1 + " дней, а вторая всего лишь " + diet2 + " дней");

    // задание 8

     int paycheckMaryaBefore = 67760;
     int procent1 = paycheckMaryaBefore / 100 * 10;
     int paycheckMaryaAfter = paycheckMaryaBefore + procent1;
     int difference1 = procent1 * 12;
     System.out.println("зарплата Маши после повышения: " + paycheckMaryaAfter + " Годовой доход вырос на" + difference1 + "рублей");

     int paycheckDenisBefore = 83690;
     int procent2 = paycheckDenisBefore / 100 * 10;
     int paycheckDenisAfter = paycheckMaryaBefore + procent2;
     int difference2 = procent2 * 12;
     System.out.println("зарплата Дениса после повышения: " + paycheckDenisAfter + " Годовой доход вырос на" + difference2 + "рублей");


     int paycheckKrissBefore = 76230;
     int procent3 = paycheckKrissBefore / 100 * 10;
     int paycheckKrissAfter = paycheckKrissBefore + procent3;
     int difference3 = procent3 * 12;
     System.out.println("зарплата Кристины после повышения: " + paycheckKrissAfter + " Годовой доход вырос на" + difference3 + "рублей");















   }
}