
public class Main {
    public static void main(String[] args) throws Exception {
// 1. Функция для нахождения максимума
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите числа: ");
//        int a = in.nextInt(); int b = in.nextInt();
//        try {
//            int max = MinOrMax(a, b);
//            System.out.println("Максимальное число: " + max);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static int MinOrMax(int x, int y) throws Exception {
//        if (x == y) {
//            throw new Exception("Числа равны");
//        }
//        return Math.max(x, y);
//    }
////////////////////////////////////////////////
//2. Калькулятор деления
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите числа: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        try {
//            System.out.println("Равно: " + Division(a, b));
//        } catch (ArithmeticException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static int Division(int x, int y) throws ArithmeticException{
//        if(y == 0){
//            throw  new ArithmeticException("Делить на ноль нельзя");
//        }
//        return x / y;
//    }
////////////////////////////////////////////////
//3. Конвертер строк в числа
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String n = in.nextLine();
//        try {
//            int result = convertStringToInt(n);
//            System.out.println("Результат конвертации: " + result);
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка: Строка не может быть конвертирована в целое число.");
//        }
//    }
//
//    public static int convertStringToInt(String x) {
//        if (x == null || x.trim().isEmpty()) {
//            throw new NumberFormatException("Строка пуста или равна null");
//        }
//        return Integer.parseInt(x);
//    }
////////////////////////////////////////////////
//4. Проверка возраста
//        Scanner in = new Scanner(System.in);
//        System.out.print("Сколько вам лет? ");
//        int age = in.nextInt();
//        try{
//            int res = TrueOrFalseAge(age);
//            System.out.println("Ого, я не знала, что вам " + age);
//        } catch (IllegalArgumentException e){
//            System.out.println("Ошибка, неккоректный возраст");
//        }
//
//    }
//
//    public static int TrueOrFalseAge(int n) throws  IllegalArgumentException{
//        if (n == 0 || n > 150){
//            throw new IllegalArgumentException("Вы должно быть шутите");
//        }
//        return n;
//    }
////////////////////////////////////////////////
//5. Нахождение корня
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число, чтобы узнать его корень: ");
//        int a = in.nextInt();
//        try {
//            System.out.println("Корень числа " + a + " равняется " + SquareRoot(a));
//        } catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static int SquareRoot(int x) throws IllegalArgumentException{
//        if(x < 0){
//            throw  new IllegalArgumentException("Число отрицательное");
//        }
//        return (int) Math.sqrt(x);
//    }
////////////////////////////////////////////////
//6. Факториал
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число N: ");
//        int n = in.nextInt();
//        try {
//            System.out.println("Факториал " + n + " равняется " + factorial(n));
//        } catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public static int factorial(int x) throws  IllegalArgumentException{
//        if(x < 0){
//            throw new IllegalArgumentException("Число отрицательное");
//        }
//        if (x == 1){
//
//            return 1;
//        }
//        return x * factorial(x - 1);
//    }
////////////////////////////////////////////////
//7. Проверка массива на нули
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        try {
//            checkArrayForZeros(array);
//            System.out.println("В массиве нет нулей.");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static void checkArrayForZeros(int[] arr) throws Exception {
//        for (int value : arr) {
//            if (value == 0) {
//                throw new Exception("Массив содержит ноль!");
//            }
//        }
//    }
////////////////////////////////////////////////
//8. Калькулятор возведения в степень
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = in.nextInt();
//        System.out.print("Введите степень, в которую хотите возвести число: ");
//        int b = in.nextInt();
//        try{
//            int rez = BaseExponent(a, b);
//            System.out.println("Результат " + rez);
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static int BaseExponent(int x, int y) throws Exception{
//        if(y < 0){
//            throw new Exception("Степень отрицательная");
//        }
//        return (int) Math.pow(x, y);
//    }
////////////////////////////////////////////////
//9. Обрезка строки
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String stroka = in.nextLine();
//        System.out.println("Введите кол-во символов: ");
//        int n = in.nextInt();
//        try {
//            String result = obrezka(stroka, n);
//            System.out.println("Обрезанная строка: " + result);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static String obrezka(String x, int y) throws Exception {
//        if (y > x.length()) {
//            throw new Exception("Кол-во символов больше длины строки");
//        }
//        return x.substring(0, y);
//    }
////////////////////////////////////////////////
//10. Поиск элемента в массиве
//        Scanner scanner = new Scanner(System.in);
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println("Введите элемент для поиска: ");
//        int elementToFind = scanner.nextInt();
//        try {
//            int index = findElement(array, elementToFind);
//            System.out.println("Элемент найден на индексе: " + index);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static int findElement(int[] array, int element) throws Exception {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == element) {
//                return i;
//            }
//        }
//        throw new Exception("Элемент не найден в массиве");
//    }
////////////////////////////////////////////////
//11. Конвертация в двоичную систему
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число, которое хотите перевести в двоичную систему: ");
//        int n = in.nextInt();
//        try {
//            System.out.println(perevod(n));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static String perevod(int x) throws Exception {
//        if (x < 0) {
//            throw new Exception("Вы ввели отрицательное число");
//        }
//        StringBuilder stroka = new StringBuilder();
//        if (x == 0) {
//            return "0";
//        }
//        while (x > 0) {
//            if (x % 2 == 0) {
//                stroka.insert(0, "0");
//            } else {
//                stroka.insert(0, "1");
//            }
//            x = x / 2;
//        }
//        return stroka.toString();
//    }
////////////////////////////////////////////////
//12. Проверка делимости
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите числа: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        try {
//            System.out.println("Равно: " + Division(a, b));
//        } catch (ArithmeticException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static int Division(int x, int y) throws ArithmeticException{
//        if(y == 0){
//            throw  new ArithmeticException("Делить на ноль нельзя");
//        }
//        return x / y;
//    }
////////////////////////////////////////////////
//13. Чтение элемента списка
//        List<String> myList = List.of("cat", "dog", "mouse");
//        try {
//            System.out.println(getElementAtIndex(myList, 1));
//            System.out.println(getElementAtIndex(myList, 3));
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static <T> T getElementAtIndex(List<T> list, int index) {
//        if (index < 0 || index >= list.size()) {
//            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка.");
//        }
//        return list.get(index);
//    }
////////////////////////////////////////////////
//14. Парольная проверка
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите пароль ");
//        String password = in.nextLine();
//        try {
//            proverka(password);
//            System.out.println("Ваш пароль надежен");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static String proverka(String x) throws Exception{
//        //WeakPasswordException не работает
//        if(x.length() < 8){
//            throw new Exception("Пароль слишком легкий, необходимо придумать пароль, где больше 8 символов");
//        }
//        return x;
//    }
////////////////////////////////////////////////
//15. Проверка даты
//        String date = "31.12.2022";
//        try {
//            checkDate(date);
//            System.out.println("Дата корректная: " + date);
//        } catch (DateTimeParseException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static void checkDate(String date) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate.parse(date, formatter);
//    }
////////////////////////////////////////////////
//16. Конкатенация строк
//        String str1 = "Hello, ";
//        String str2 = "World!";
//        try {
//            System.out.println(concatenateStrings(str1, str2));
//            System.out.println(concatenateStrings(str1, null));
//        } catch (NullPointerException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static String concatenateStrings(String str1, String str2) {
//        if (str1 == null || str2 == null) {
//            throw new NullPointerException("Одна из строк равна null");
//        }
//        return str1 + str2;
//    }
////////////////////////////////////////////////
//17. Остаток от деления
//        int dividend = 10;
//        int divisor = 3;
//        try {
//            System.out.println(remainder(dividend, divisor));
//            System.out.println(remainder(dividend, 0));
//        } catch (ArithmeticException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static int remainder(int dividend, int divisor) {
//        if (divisor == 0) {
//            throw new ArithmeticException("Деление на ноль");
//        }
//        return dividend % divisor;
//    }
//}
////////////////////////////////////////////////
//18. Квадратный корень
//        double number = 16;
//        try {
//            System.out.println(squareRoot(number));
//            System.out.println(squareRoot(-4));
//        } catch (IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static double squareRoot(double number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Отрицательное число не имеет квадратного корня");
//        }
//        return Math.sqrt(number);
//    }
//}
////////////////////////////////////////////////
//19. Конвертер температуры
//        double celsius = 25;
//        try {
//            System.out.println(celsius(celsius));
//            System.out.println(celsius(-300));
//        } catch (IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static double celsius(double celsius) {
//        if (celsius < -273.15) {
//            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
//        }
//        return (celsius * 9 / 5) + 32;
//    }
//}
////////////////////////////////////////////////
//20. Проверка строки на пустоту
//        String str1 = null;
//        String str2 = "la";
//        try {
//            checkString(str2);
//            checkString(str1);
//        } catch (IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    public static void checkString(String str) {
//        if (str == null || str.isEmpty()) {
//            throw new IllegalArgumentException("Строка пустая или равна null");
//        } else {
//            System.out.println("Строка корректная: " + str);
//        }
    }
}