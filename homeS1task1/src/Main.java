//Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
//  Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей
//  и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра
//  и т. д. компонент для проведения исследований дополнительные компоненты, например отвечающие за вывод данных в консоль,
//  загрузку и сохранения в файл, получение\построение отдельных моделей человека
//  Под “проведением исследования” можно понимать получение всех детей выбранного человека.



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human>  allPeople = new ArrayList<>();
        for (int i = 0; i<10; i++){
            Human human = new Human();
            allPeople.add(human);
        }

        Iterator itrAllPeople = allPeople.iterator();
        int i = 0;
        while (itrAllPeople.hasNext()){
            System.out.print(i++ + " ");
            System.out.println(itrAllPeople.next());

        }

        System.out.print("Введите обьект исследования : ");
        Scanner in = new Scanner(System.in);
        int findHumanIndex = Integer.parseInt(in.nextLine());
        in.close();
        Human findHuman = allPeople.get(findHumanIndex);

        System.out.println(findHuman);

        Iterator itrAllPeopleFind = allPeople.iterator();
        while (itrAllPeopleFind.hasNext()){

            Human currentHuman = (Human) itrAllPeopleFind.next();
//            System.out.println(currentHuman);
            if (findHuman.family.equals(currentHuman.family)) {
                if (Human.Relationship[4].equals(currentHuman.relationship)) {
                        System.out.println(currentHuman);
                }
            }
        }





    }
}