package Enums;
//Lesson 48
// Object -> Enum -> Seaon
public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal){
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
        }

        Season season = Season.SUMMER;

        System.out.println(season instanceof Enum); //проверка на то является ли обьектом класса

        switch (season){
            case SUMMER:
                System.out.println("Warm");
                break;
            case WINTER:
                System.out.println("Cold");
                break;
        }

        Animal animal1 = Animal.FROG;
        System.out.println(animal1);

        //полезные методы
        Season season1 = Season.AUTUMN;
        System.out.println(season1.name()); //Имя

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranlation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());//индекс
    }
}
