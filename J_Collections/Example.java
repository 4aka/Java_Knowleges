package J_Collections;

import java.util.Collections;
import java.util.List;
import java.util.*;

public class Example {

    public static void main(String[] args) {

        Collection<Object> col1 = FirstCollection();
        Collection<String> col2 = SecondCollection();

        // Демонстрация прохода по коллекции
        System.out.println("============= Проход по коллекции");
        for (Object o : col1) {
            System.out.println("Item:" + o);
        }

        System.out.println();
        // Демонстрация прохода по коллекции через итератор
        System.out.println("============= Проход по коллекции через итератор");

        for (Iterator<?> it = col1.iterator(); it.hasNext(); ) {
            String s = (String) it.next();
            System.out.println("Item:" + s);
        }
        System.out.println();

        // Демонстрации групповых операций
        System.out.println();
        System.out.println("============= Групповые операции");
        // Можно проверить содержаться ли ВСЕ элементы col2 в col
        if (col1.containsAll(col2)) {
            System.out.println("Коллекция col содержит все от col2");
        }

        System.out.println("============= Добавление всех элементов в col1 из col2");
        // Можно добавить элементы из col2 в col1
        col1.addAll(col2);
        for (Object o : col1) {
            System.out.println("Item:" + o);
        }

        System.out.println("============= Удаление всех элементов col2, которые есть в col1");
        // Можно удалить ВСЕ элементы col2, которые есть в col1
        col1.removeAll(col2);
        for (Object o : col1) {
            System.out.println("Item:" + o);
        }

        // Пересоздаем коллекции для дпальнейшей демонстрации
        col1 = FirstCollection();
        col2 = SecondCollection();
        System.out.println("============= Удаление элементов из col1, которых нет в col2");
        col1.retainAll(col2);

        for (Object o : col1) {
            System.out.println("Item:" + o);
        }
        System.out.println("============= Очистка коллекции - не будет элементов");
        col1.clear();

        for (Object o : col1) {
            System.out.println("Item:" + o);
        }
        System.out.println();

        // Удаление элемента коллекции
        // Снова создаем коллекцию для демонстрации
        col1 = FirstCollection();
        // Удаляем один элемент
        col1.remove("1");
        System.out.println("============= Удаляем элемент '1' - его не будет в списке");
        for (Object o : col1) {
            System.out.println("Item:" + o);
        }

        // Удаление коллекции через итератор
        // Снова создаем коллекцию для демонстрации
        col1 = FirstCollection();
        System.out.println("============= Удаление через итератор");
        while (!col1.isEmpty()) {
            Iterator<?> it = col1.iterator();
            Object o = it.next();
            System.out.println("Удаляем:" + o);
            // Удаляем элемент
            it.remove();
        }
    }

    private static Collection<Object> FirstCollection() {
        Collection<Object> col = new ArrayList<>();
        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        col.add("7");
        return col;
    }

    private static Collection<String> SecondCollection() {
        Collection<String> col2 = new ArrayList<>();
        col2.add("1");
        col2.add("2");
        col2.add("3");
        return col2;
    }

    public static void work() {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        String[] planets = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(planets));

        // work with Collections
        Collections.sort(solarSystem);       // sort
        Collections.addAll(FirstCollection(), SecondCollection());
        Collections.reverse(solarSystem);    // reverse
        Collections.shuffle(solarSystem);    // shuffle
        Collections.sort(solarSystem);       // sort
        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
//		[Нептун, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Меркурий] =>
//		[Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун]

        // work with ArrayList
        solarSystem.add("Плутон");         // add new element
        solarSystem.clear();               // clear
        solarSystem.clone();               // clone
        solarSystem.contains(mars);        // true or false
        solarSystem.get(5);                // get fifth element
        solarSystem.remove(5);        // remove fifth element
    }

    public static void unmodifiable() {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        List<String> solarSystem = Collections.unmodifiableList(
                new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)));

        solarSystem.add("Плутон");         // попробуем добавить новый элемент
    }
}
