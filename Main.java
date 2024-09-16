import java.util.*;
import java.io.*;
import java.util.Scanner; 

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (true) 
        {
            System.out.print("\nВыберите задачу (1-20) или 0, чтобы выйти: ");
            int userChoice = scanner.nextInt();
            System.out.print("\n");

            try 
            {
                switch (userChoice) 
                {
                    case 0:
                        System.out.println("Программа завершена.");
                        return;
                    case 1:
                        // 1. Класс "Человек" Создайте класс Person с полями name, age, gender.
                        System.out.println("1. Класс Человек \n");
                        newPerson Person = new newPerson("John", 25, "Male");
                        Person.printInfo();
                        Person.setName("Кэтти");
                        Person.getAge();
                        Person.getGender("Helicopter Crocodile");
                        Person.printInfo();

                        break;
                    case 2:
                        //2. Наследование: Класс "Работник" и "Менеджер"
                        Worker worker1 = new Worker("Teodor", 25, "Male", 50000, null);
                        Worker worker2 = new Worker("Ann", 28, "Female", 60000, null);
                        Worker worker3 = new Worker("Dmitry", 30, "Male", 70000, null);

                        Worker[] subordinates = {worker1, worker2};

                        Manager manager = new Manager("Alice", 35, "Female", 100000, subordinates);

                        manager.printInfo();
                        break;
                    case 3:
                        // 3. Полиморфизм: Животные
                        System.out.println("3. Полиморфизм: Животные \n");
                        Animal[] animals = {new Cat(), new Dog(), new Cow()};
                        for (Animal animal : animals) {
                            animal.makeSound();
                        }
                        break;
                    case 4:
                        // 4. Абстрактный класс "Транспорт"
                        System.out.println("4. Абстрактный класс Транспорт \n");
                        Transport car = new Car();
                        Transport bike = new Bike();
                        car.move();
                        bike.move();
                        break;
                    case 5:
                        // 3. Класс "Книга" и "Библиотека"
                        System.out.println("5. Класс Книга и Библиотека \n");
                        Library library = new Library();
                        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
                        library.addBook(new Book("Metro 2033", "Dmitry Glukhovsky", 2005));
                        library.findBooksByAuthor("J.R.R. Tolkien");
                        library.findBooksByYear(1954);
                        break;
                    case 6:
                        // 6. Инкапсуляция: Банк
                        System.out.println("6. Инкапсуляция: Банк \n");
                        BankAccount account = new BankAccount(1234567890, 1000);
                        account.deposit(500);
                        account.withdraw(200);
                        System.out.println("Balance: " + account.getBalance());
                        break;
                    case 7:
                        // 7. Счетчик объектов
                        System.out.println("7. Счетчик объектов \n");
                        Counter counter1 = new Counter();
                        Counter counter2 = new Counter();
                        Counter counter3 = new Counter();
                        System.out.println("Number of counter objects: " + Counter.getCount());
                        break;
                    case 8:
                        // 8. Площадь фигур
                        System.out.println("8. Площадь фигур \n");
                        Shape circle = new Circle(5);
                        Shape rectangle = new Rectangle(4, 6);
                        System.out.println("Circle area: " + circle.getArea());
                        System.out.println("Rectangle area: " + rectangle.getArea());
                        break;
                    case 9:
                        // 9. Наследование: Животные и их движения
                        System.out.println("9. Наследование: Животные и их движения \n");
                        Animal_Move fish = new Fish();
                        Animal_Move bird = new Bird();
                        Animal_Move fox = new Fox();
                        fish.move();
                        bird.move();
                        fox.move();
                        break;
                    case 10:
                        // 10. Работа с коллекциями: Университет
                        System.out.println("10. Работа с коллекциями: Университет \n");
                        University university = new University();
                        university.addStudent(new Student("Bart Simpson", "CS101", 4.0));
                        university.addStudent(new Student("Petr Cheh", "CS102", 3.5));
                        university.addStudent(new Student("Cavalsky", "CS101", 3.0));
                        university.sortStudentsByName();
                        university.printStudents();
                        university.filterStudentsByGrade(3.5);
                        break;
                    case 11:
                        // 11. Класс "Магазин"
                        System.out.println("11. Класс Магазин \n");
                        Store store = new Store();
                        store.addProduct(new Product("Apple", 1.0, 10));
                        store.addProduct(new Product("Banana", 0.5, 20));
                        store.removeProduct("Apple");
                        store.findProductByName("Banana");
                        break;
                    case 12:
                        // 12. Интерфейс "Платежная система"
                        System.out.println("12. Интерфейс Платежная система \n");
                        PaymentSystem creditCard = new CreditCard();
                        PaymentSystem payPal = new PayPal();
                        creditCard.pay(100);
                        payPal.refund(50);
                        break;
                    case 13:
                        // 13. Генерация уникальных идентификаторов
                        System.out.println("13. Генерация уникальных идентификаторов \n");
                        UniqueID uniqueID1 = new UniqueID();
                        UniqueID uniqueID2 = new UniqueID();
                        System.out.println(uniqueID1.getId());
                        System.out.println(uniqueID2.getId());
                        break;
                    case 14:
                        // 14. Класс "Точка" и "Прямоугольник"
                        System.out.println("14. Класс Точка и Прямоугольник \n");
                        Point point1 = new Point(1, 2);
                        Point point2 = new Point(5, 6);
                        RectangleArea Rectangle = new RectangleArea(point1, point2);
                        System.out.println("Rectangle area: " + Rectangle.calculateArea());                                                                        break;
                    case 15:
                        // 15. Комплексные числа
                        System.out.println("15. Комплексные числа \n");
                        ComplexNumber c1 = new ComplexNumber(2, 3);
                        ComplexNumber c2 = new ComplexNumber(1, -1);
                        System.out.println("c1 + c2 = " + c1.add(c2));
                        System.out.println("c1 - c2 = " + c1.subtract(c2));
                        System.out.println("c1 * c2 = " + c1.multiply(c2));
                        System.out.println("c1 / c2 = " + c1.divide(c2));
                        break;
                    case 16:
                        // 16. Перегрузка операторов: Матрица
                        System.out.println("16. Перегрузка операторов: Матрица \n");
                        Matrix m1 = new Matrix(new double[][]{{1, 2}, {3, 4}});
                        Matrix m2 = new Matrix(new double[][]{{5, 6}, {7, 8}});
                        System.out.println("m1 + m2 = n" + m1.add(m2));
                        System.out.println("m1 * m2 = n" + m1.multiply(m2));
                        break;
                    case 17:
                        // 17. Создание игры с использованием ООП (текстовая RPG)
                        System.out.println("17. Создание игры с использованием ООП \n");
                        Player player = new Player("Hero", 100, new Sword());
                        Enemy goblin = new Enemy("Goblin", 50);
                        player.attack(goblin);
                        break;
                    case 18:
                        // 18. Автоматизированная система заказов
                        System.out.println("18. Автоматизированная система заказов \n");
                        Order order = new Order(new Customer("Alice Valentine"));
                        order.addProduct(new Product_sys("Apple", 1.0));
                        order.addProduct(new Product_sys("Banana", 0.5));
                        System.out.println("Order total: " + order.getTotalCost());
                        order.printOrderHistory();
                        break;
                    case 19:
                        // 19. Наследование: Электроника
                        System.out.println("19. Наследование: Электроника \n");
                        Device smartphone = new Smartphone("Apple", "iPhone 13 Pro");
                        Device laptop = new Laptop("Dell", "XPS 13");
                        smartphone.turnOn();
                        smartphone.takePhoto();
                        laptop.turnOn();
                        break;
                    case 20:
                        // 20. Игра "Крестики-нолики"
                        System.out.println("20. Игра Крестики-нолики \n");
                        Game game = new Game();
                        PlayerXO playerX = new PlayerXO("X");
                        PlayerXO playerO = new PlayerXO("O");
                        game.setPlayers(playerX, playerO);
                        game.play();
                        break;
                    default:
                        System.out.println("Неправильный выбор. Попробуйте снова");
                }
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}


// 1. Класс "Человек"
// Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста.
// Добавьте метод для изменения имени.
 
class newPerson
{
    private String Name;
    private int Age;
    private String Gender;

    public newPerson(String Name, int Age, String Gender)
    {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    public String getName()
    {
        return Name;
    }

    public int getAge()
    {
        return Age++;
    }

    public String getGender(String gender)
    {
        Gender = gender;
        return Gender;
    }

    
    public void setName(String Name)
    {
        this.Name = Name;
    }
    
    public void printInfo()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
        //System.out.println("\n");

    }
}

// 2. Наследование: Класс "Работник" и "Менеджер"
// Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary.
// Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

class Worker extends newPerson {
    private double salary;
    private Worker[] subordinates;
    
    public Worker(String name, int age, String gender, double salary, Worker[] subordinates) {
        super(name, age, gender);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary + "\n");
    }
}

class Manager extends Worker {
    private double salary;
    private Worker[] subordinates;

    public Manager(String name, int age, String gender, double salary, Worker[] subordinates) {
        super(name, age, gender, salary, subordinates);
        this.subordinates = subordinates;
    }

    public void setSalary(double salary) {
            this.salary = salary;
        
    }
    
    public void setSubordinates(Worker[] subordinates) {
        this.subordinates = subordinates;
    }
    
    public void printInfo() {
        super.printInfo();
        System.out.println("Subordinates: \n");
        for (Worker subordinate : subordinates) {
            subordinate.printInfo();
        }
    }
}

// 3. Полиморфизм: Животные
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Moo!");
    }
}

// 4. Абстрактный класс "Транспорт"
abstract class Transport {
    abstract void move();
}

class Car extends Transport {
    @Override
    void move() {
        System.out.println("The car is driving.");
    }
}

class Bike extends Transport {
    @Override
    void move() {
        System.out.println("The bike is riding.");
    }
}

// 5. Класс "Книга" и "Библиотека"
class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author " + author + ":");
        for (Book book : books) {
            if (book.author.equals(author)) {
                System.out.println(book.title);
            }
        }
    }

    public void findBooksByYear(int year) {
        System.out.println("Books published in " + year + ":");
        for (Book book : books) {
            if (book.year == year) {
                System.out.println(book.title);
            }
        }
    }
}

// 6. Инкапсуляция: Банк
class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// 7. Счетчик объектов
class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// 8. Площадь фигур
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

// 9. Наследование: Животные и их движения
class Animal_Move {
    void move() {
        System.out.println("Animal is moving.");
    }
}

class Fish extends Animal_Move {
    @Override
    void move() {
        System.out.println("Fish is swimming.");
    }
}

class Bird extends Animal_Move {
    @Override
void move() {
    System.out.println("Bird is flying.");
}
}

class Fox extends Animal_Move {
    @Override
    void move() {
        System.out.println("Fox is running.");
    }
}

// 10. Работа с коллекциями: Университет
class Student {
    String name;
    String group;
    double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
}

class University {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortStudentsByName() {
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
    }

    public void printStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Group: " + student.group + ", Grade: " + student.grade);
        }
    }

    public void filterStudentsByGrade(double minGrade) {
        System.out.println("Students with grade >= " + minGrade + ":");
        for (Student student : students) {
            if (student.grade >= minGrade) {
                System.out.println("Name: " + student.name + ", Group: " + student.group + ", Grade: " + student.grade);
            }
        }
    }
}

// 11. Класс "Магазин"
class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Store {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(product -> product.name.equals(name));
    }

    public void findProductByName(String name) {
        for (Product product : products) {
            if (product.name.equals(name)) {
                System.out.println("Product found: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }
}

// 12. Интерфейс "Платежная система"
interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made with Credit Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of " + amount + " processed by Credit Card.");
    }
}

class PayPal implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made with PayPal.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of " + amount + " processed by PayPal.");
    }
}

// 13. Генерация уникальных идентификаторов
class UniqueID {
    private static int counter = 0;
    private int id;

    public UniqueID() {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }
}

// 14. Класс "Точка" и "Прямоугольник"
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class RectangleArea {
    Point topLeft;
    Point bottomRight;

    public RectangleArea(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double calculateArea() {
        return (bottomRight.x - topLeft.x) * (topLeft.y - bottomRight.y);
    }
}

// 15. Комплексные числа
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(
                real * other.real - imaginary * other.imaginary,
                real * other.imaginary + imaginary * other.real
        );
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new ComplexNumber(
                (real * other.real + imaginary * other.imaginary) / denominator,
                (imaginary * other.real - real * other.imaginary) / denominator
        );
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? "+" : "") + imaginary + "i";
    }
}

// 16. Перегрузка операторов: Матрица
class Matrix {
    private double[][] data;

    public Matrix(double[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }
        int rows = data.length;
        int cols = data[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        if (data[0].length != other.data.length) {
            throw new IllegalArgumentException("Number of columns in first matrix must equal number of rows in second matrix.");
        }
        int rows = data.length;
        int cols = other.data[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < data[0].length; k++) {
                    result[i][j] += data[i][k] * other.data[k][j];                }
            }
        }
        return new Matrix(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

// 17. Создание игры с использованием ООП (текстовая RPG)
class Player {
    public String name;
    public char mark;
    public boolean turn;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " attacks " + enemy.name + " with " + weapon.getName());
        int damage = weapon.getDamage();
        enemy.takeDamage(damage);
        System.out.println(enemy.name + " takes " + damage + " damage.");
        if (enemy.isDead()) {
            System.out.println(enemy.name + " is dead.");
        }
    }
}

class Enemy {
    String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isDead() {
        return health <= 0;
    }
}

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}

class Sword extends Weapon {
    public Sword() {
        super("Sword", 10);
    }
}

// 18. Автоматизированная система заказов
class Order {
    private Customer customer;
    private List<Product_sys> products = new ArrayList<>();
    private List<Order> orderHistory = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product_sys product) {
        products.add(product);
    }

    public double getTotalCost() {
        double total = 0;
        for (Product_sys product : products) {
            total += product.price;
        }
        return total;
    }

    public void printOrderHistory() {
        System.out.println("Order history:");
        for (Order order : orderHistory) {
            System.out.println("Customer: " + order.customer.name + ", Total cost: " + order.getTotalCost());
        }
    }
}

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }
}

class Product_sys {
    public String name;
    double price;

    public Product_sys(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// 19. Наследование: Электроника
class Device {
    public String brand;
    public String model;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Device is turned on.");
    }

    public void turnOff() {
        System.out.println("Device is turned off.");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with " + model);
    }
}

class Smartphone extends Device {

    public Smartphone(String brand, String model) {
        super(brand);
        this.model = model;
    }
}

class Laptop extends Device {
    public Laptop(String brand, String model) {
        super(brand);
        this.model = model;
    }
}

// 20. Игра "Крестики-нолики"

class PlayerXO {
    String name;
    char mark;
    boolean turn = false;

    public PlayerXO(String name) {
        this.name = name;
        this.mark = name.charAt(0);
    }
}

class Game {
    private PlayerXO playerX;
    private PlayerXO playerO;
    private char[][] board = new char[3][3];

    public void setPlayers(PlayerXO playerX, PlayerXO playerO) {
        this.playerX = playerX;
        this.playerO = playerO;
    }

    public void play() {
        initializeBoard();
        while (!isGameOver()) {
            printBoard();
            PlayerXO currentPlayer = getCurrentPlayer();
            System.out.println(currentPlayer.name + "'s turn: ");
            int row = getValidInput("Enter row (0-2): ");
            int col = getValidInput("Enter column (0-2): ");
            if (placeMark(row, col, currentPlayer.mark)) {
                if (isGameOver()) {
                    printBoard();
                    System.out.println(currentPlayer.name + " wins!");
                } else {
                    switchPlayer();
                }
            }
        }
        if (!isGameOver()) {
            printBoard();
            System.out.println("It's a draw!");
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private PlayerXO getCurrentPlayer() {
        return (playerX.turn) ? playerX : playerO;
    }

    private void switchPlayer() {
        
        playerX.turn = !playerX.turn;
        playerO.turn = !playerO.turn;
    }

    private boolean placeMark(int row, int col, char mark) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        board[row][col] = mark;
        return true;
    }

    private boolean isGameOver() {
        return hasPlayerWon(playerX.mark) || hasPlayerWon(playerO.mark) || isBoardFull();
    }

    private boolean hasPlayerWon(char mark) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == mark && board[1][j] == mark && board[2][j] == mark) {
                return true;
            }
        }
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
            return true;
        }
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private int getValidInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                int input = Integer.parseInt(System.console().readLine());
                if (input >= 0 && input <= 2) {
                    return input;
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}

