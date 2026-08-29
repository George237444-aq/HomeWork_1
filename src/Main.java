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




   }
}