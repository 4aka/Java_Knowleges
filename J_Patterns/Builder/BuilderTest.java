package J_Patterns.Builder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuilderTest {

    public static void main(String[] args) {

        List<BuilderAnimal> animals = new ArrayList<>();

        BuilderAnimal monkey1 = new BuilderAnimal("monkey", "Zeo", 3, 13);
        BuilderAnimal monkey2 = new BuilderAnimal("monkey", "Peter", 5, 14);
        BuilderAnimal dog1 = new BuilderAnimal("dog", "Rex", 7, 6);
        BuilderAnimal dog2 = new BuilderAnimal("dog", "Xantar", 10, 16);
        BuilderAnimal cat = new BuilderAnimal("cat", "Tom", 2, 2);
        BuilderAnimal mouse = new BuilderAnimal("mouse", "Jerry", 1, 1);
        BuilderAnimal pig = new BuilderAnimal("pig", "Pumba", 4, 45);
        BuilderAnimal oak = new BuilderAnimal("pig", "Pumba", 4, 45);

        animals.add(monkey1);
        animals.add(monkey2);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat);
        animals.add(mouse);
        animals.add(pig);
        animals.add(oak);

        sortAllByAgeInReverseOrder(animals);

        for (BuilderAnimal animal : animals) {
            System.out.print(animal.getAge() + ", ");
        }

        sortAllByName(animals);

        for (BuilderAnimal animal : animals) {
            System.out.print(animal.getName() + ", ");
        }
    }

    public static void getAnimalWithMaximumWeight(List<BuilderAnimal> animals) {
        double result = 0.0;

        for (BuilderAnimal animal : animals) {

            if (animal.getWeight() > result) {
                result = animal.getWeight();
            }
        }
        System.out.println(result);
    }

    public static List<BuilderAnimal> getOnlyDogs(List<BuilderAnimal> animals) {
        List<BuilderAnimal> dogs = new ArrayList();

        for (BuilderAnimal animal : animals) {

            if (animal.getType().equals("dog")) {
                dogs.add(animal);
            }
        }
        return dogs;
    }

    public static boolean isMouseWithNameExist(List<BuilderAnimal> animals, String expectedName) {

        for (BuilderAnimal animal : animals) {
            if (animal.getType().equals("mouse") && animal.getName().equals(expectedName)) return true;
        }
        return false;
    }

    public class sortAge implements Comparator<BuilderAnimal> {

        @Override
        public int compare(BuilderAnimal o1, BuilderAnimal o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    public class sortName implements Comparator<BuilderAnimal> {

        @Override
        public int compare(BuilderAnimal o1, BuilderAnimal o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static List<BuilderAnimal> sortAllByName(List<BuilderAnimal> animals) {
        Comparator<BuilderAnimal> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        animals.sort(comparator.reversed());
        return animals;
    }

    public static List<BuilderAnimal> sortAllByAgeInReverseOrder(List<BuilderAnimal> animals) {
        Comparator<BuilderAnimal> comparator = (o1, o2) -> o1.getAge() - (o2.getAge()); // Second way
        animals.sort(comparator.reversed());
        return animals;
    }
}