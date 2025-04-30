package lv.acodemy;

public class PezDispenser {

    private String name;
    private String color;
    private String series;
    private int candyCount;
    private static final int MAX_CAPACITY = 12; // Максимальная вместимость диспенсера

    // Конструктор для инициализации диспенсера
    public PezDispenser(String name, String color, String series) {
        this.name = name;
        this.color = color;
        this.series = series;
        this.candyCount = 0; // Начальное количество конфет
    }

    // Метод для загрузки конфет в диспенсер
    public void load(int candies) {
        if (candies < 0) {
            System.out.println("Нельзя загрузить отрицательное количество конфет!");
            return;
        }
        if (this.candyCount + candies > MAX_CAPACITY) {
            System.out.println("Попытка загрузить слишком много конфет! Доступно место: " + (MAX_CAPACITY - candyCount));
            this.candyCount = MAX_CAPACITY; // Заполняем до максимума
        } else {
            this.candyCount += candies;
        }
        System.out.println("Добавлено " + candies + " конфет(ы). Сейчас: " + this.candyCount);
    }

    // Метод для выдачи конфет
    public void dispense(int candies) {
        if (candies < 0) {
            System.out.println("Нельзя выдать отрицательное количество конфет!");
            return;
        }
        if (candies > this.candyCount) {
            System.out.println("Недостаточно конфет. В наличии: " + this.candyCount);
        } else {
            this.candyCount -= candies;
            System.out.println(candies + " конфет(ы) выданы. Осталось: " + this.candyCount);
        }
    }

    // Метод для вывода информации о диспенсере
    public void printInfo() {
        System.out.println("Название: " + this.name);
        System.out.println("Цвет: " + this.color);
        System.out.println("Серия: " + this.series);
        System.out.println("Конфет в наличии: " + this.candyCount);
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSeries() {
        return series;
    }

    public int getCandyCount() {
        return candyCount;
    }
}
