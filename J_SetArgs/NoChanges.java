package J_SetArgs;

public class NoChanges {

    public static void main(String[] args) {

        NoChanges ob = new NoChanges();

        int a = 15, b = 20;
        System.out.println("a & b before try to change: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a & b after change: " + a + " " + b);

        // a & b before try to change: 15 20
        // a & b after change: 15 20
    }

    /*
     * Этот метод не может изменить значения аргументов,
     * передаваемых ему при вызове, если используется int.
     * Если использовать классы - оболочки:
     *  DouЬle, Float, Byte, Short, Integer, Long Character
     *  то можно передать в качестве параметра простые типы по ссылке.
     */
    void noChange(int i, int j) {
        /*
         * так как передается значение аргумента.
         */
        i = i + j;
        j = -j;
        // Изменения переменной происходят только в теле метода
        // Подходит для расчетов.
    }
}