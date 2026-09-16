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

     friend = friend + 2;
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
     var firstBoxerWeight = 78.2;
     var secondBoxerWeight = 82.7;
     var totalWeight = firstBoxerWeight + secondBoxerWeight;
     var weightDifference = secondBoxerWeight - firstBoxerWeight;
     System.out.println("общий вес - " + totalWeight);
     System.out.println("разница в весе - " + weightDifference);

     // задание 7
     var remainder = secondBoxerWeight % firstBoxerWeight;
     System.out.println("остаток - " + remainder);

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

     double one = 27.12;
     long two = 987678965549L;
     float three = 2.786f;
     short four = 569;
     short five = -159;
     int six = 27897;
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


     byte productivityPerMinute = 8;
     int productivity2 = productivityPerMinute * 20;
     int productivity3 = productivityPerMinute * 1440;
     int productivity4 = productivity3 * 3;
     int productivity5 = productivity3 * 30;
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
     int averageValue = (diet1 + diet2) / 2;
     System.out.println("диета 1 занимает " + diet1 + " дней, а вторая всего лишь " + diet2 + " дней, среднее значение " + averageValue);


     // задание 8

     int paycheckMaryaBefore = 67760;
     int procent1 = paycheckMaryaBefore / 100 * 10;
     int paycheckMaryaAfter = paycheckMaryaBefore + procent1;
     int difference1 = procent1 * 12;
     System.out.println("зарплата Маши после повышения: " + paycheckMaryaAfter + " Годовой доход вырос на" + difference1 + "рублей");

     int paycheckDenisBefore = 83690;
     int procent2 = paycheckDenisBefore / 100 * 10;
     int paycheckDenisAfter = paycheckDenisBefore + procent2;
     int difference2 = procent2 * 12;
     System.out.println("зарплата Дениса после повышения: " + paycheckDenisAfter + " Годовой доход вырос на" + difference2 + "рублей");


     int paycheckKrissBefore = 76230;
     int procent3 = paycheckKrissBefore / 100 * 10;
     int paycheckKrissAfter = paycheckKrissBefore + procent3;
     int difference3 = procent3 * 12;
     System.out.println("зарплата Кристины после повышения: " + paycheckKrissAfter + " Годовой доход вырос на" + difference3 + "рублей");


     //задание 1
     int age = 63;
     if (age >= 18) {
      System.out.println("если возраст равен " + age + " то он совершеннолетний");

     } else {
      System.out.println("если возраст равен " + age + "он не достиг совершеннолетия");
     }


     //задание 2
     int temperature = 7;
     if (temperature >= 5) {
      System.out.println("на улице " + temperature + " градусов. Можно не надевать шапку");
     } else {
      System.out.println("на улице " + temperature + " градусов. Нужно надеть шапку");
     }


     ///задание 3

     int speed = 70;
     if (speed <= 60) {
      System.out.println("ваша скорость " + speed + "км/ч - вы хороший водитель");
     } else {
      System.out.println("ваша скорость " + speed + "км/ч - вам штраф");
     }


     //задание 4

     int ageApplicant = 15;


     if (ageApplicant >= 2 && ageApplicant <= 6) {
      System.out.println("ваш возраст " + ageApplicant + " вам нужно в детсад");
     }
     else {
      System.out.println("вам не нужно в детсад");
     }

     if (ageApplicant >= 7 && ageApplicant <= 17) {
      System.out.println("ваш возраст " + ageApplicant + " вам нужно в школу");
     }
     else {
      System.out.println("вам не нужно в школу");
     }

     if (ageApplicant >= 18 && ageApplicant <= 24) {
      System.out.println("ваш возраст " + ageApplicant + " вам нужно в универ");
     }
     else {
      System.out.println("вам не нужно в универ");
     }

     if (ageApplicant >= 24) {
      System.out.println("ваш возраст " + ageApplicant + " вам нужно на работу");
     }

     else {
      System.out.println("вам не нужно на работу");
     }


     //задача 5

     byte child = 7;
     if (child < 5) {
      System.out.println("ребенку " + child + " лет, ему нельзя кататься");
     } else if (child > 5 && child <= 14)
      {
        System.out.println("ребенку " + child + " лет, ему можно кататься, но только со взрослым");
     } else if (child > 14) {
       System.out.println("ребенку " + child + " лет, ему можно кататься самостоятельно");
      }










     //задание 6
     int passengers = 76;
     if (passengers < 60) {
      System.out.println("в вагоне есть сидячие места");
     } else if (passengers > 60 && passengers < 101) {
      int seatingPlaces = passengers - 60;
      System.out.println("Места есть, 60 пассажиров может сидеать, остальные " + seatingPlaces + " будут стоять");
     }
      else {
          System.out.println("в вагоне нет мест");
      }


     //final


     int wOne = 5;
     int wTwo = 5;
     int wThree = 3;

     if (wOne >= wTwo && wOne >= wThree) {
      System.out.println("число " + wOne + " самое большое");

     } else {
      System.out.println("число " + wOne + " не самое большое");
     }


     if (wTwo >= wOne && wTwo >= wThree) {
      System.out.println("число " + wTwo + " самое большое");

     } else {
      System.out.println("число " + wTwo + " не самое большое");
     }


     if (wThree >= wOne && wThree >= wTwo) {
      System.out.println("число " + wThree + " самое большое.");

     } else {
      System.out.println("число " + wThree + " не самое большое");
     }



     //задание 1

     int clientOS = 0;

     if (clientOS == 0){
      System.out.println("чтобы скачать приложение на IOS, перейдите по ссылке: ");
     }

     else {
      System.out.println("чтобы скачать приложение на Android перейдите по ссылке");
     }

     //задание 2

     int clientDeviceYear = 2015;
     if (clientOS == 0 && clientDeviceYear < 2015){
      System.out.println("чтобы скачать облегченное приложение на IOS, перейдите по ссылке: ");
     } else if (clientOS == 0 && clientDeviceYear >= 2015){
      System.out.println("чтобы скачать приложение на IOS, перейдите по ссылке: ");
     } else if (clientOS != 0 && clientDeviceYear < 2015) {
      System.out.println("чтобы скачать облегченное приложение на Android перейдите по ссылке");
     } else {
      System.out.println("чтобы скачать приложение на Android перейдите по ссылке");
     }


     // задание 3
     int year = 2001;
     if (year % 400 == 0) {
      System.out.println( year + " Год является високосным");
     } else if (year % 100 == 0){
      System.out.println( year + " Год не является високосным");
     } else if (year % 4 == 0){
      System.out.println( year + " Год является високосным");
     }
     else {
      System.out.println( year + " Год не является високосным");
     }

     //задание 4

     int deliveryDistance = 95;
     int deliveryTime = 1;
     if (deliveryDistance <= 20){
     System.out.println("потребуется " + deliveryTime + " день" );
     } else if (deliveryDistance > 20 && deliveryDistance < 60) {
      deliveryTime = deliveryTime + 1;
      System.out.println("потребуется " + deliveryTime + " дня" );
     } else if (deliveryDistance > 60 && deliveryDistance < 100) {
      deliveryTime = deliveryTime + 1;
      System.out.println("потребуется " + deliveryTime + " дня" );
     } else{
      System.out.println("сюда не доставлкм");
     }


     //final

     int monthNumber = 12;
      switch (monthNumber) {
       case 1:
        System.out.println("Январь - зима");
        break;
       case 2:
        System.out.println("февраль - зима");
        break;
       case 3:
        System.out.println("март - весна");
        break;
       case 4:
        System.out.println("апрель - весна");
        break;
       case 5:
        System.out.println("май - весна");
        break;
       case 6:
        System.out.println("июнь - лето");
        break;
       case 7:
        System.out.println("июль - лето");
        break;
       case 8:
        System.out.println("август - лето");
        break;
       case 9:
        System.out.println("сентябрь - осень");
        break;
       case 10:
        System.out.println("октябрь - осень");
        break;
       case 11:
        System.out.println("ноябрь - осень");
        break;
       case 12:
        System.out.println("декабрь - зима");
        break;

          default:
           System.out.println("такого месяца не существует");



      }



    }
}