package lv.acodemy;

public class PezTest {
    public static void main(String[] args) {

        // Создаём 4 диспенсера с разными характеристиками
        PezDispenser dispenser1 = new PezDispenser("Spider-Man", "Red", "Marvel");
        PezDispenser dispenser2 = new PezDispenser("Iron Man", "Gold", "Marvel");
        PezDispenser dispenser3 = new PezDispenser("Super Mario", "Red", "Nintendo");
        PezDispenser dispenser4 = new PezDispenser("Luigi", "Green", "Nintendo");

        // Пробуем загрузить больше конфет, чем влезает
        System.out.println("Пробуем загрузить больше конфет, чем влезает...");
        dispenser1.load(20); // Пример с загрузкой
        dispenser2.load(30); // Пример с загрузкой

        // Пробуем выдать больше конфет, чем есть в диспенсере
        System.out.println("Пробуем выдать больше конфет, чем есть...");
        dispenser3.dispense(20); // Пример с выдачей
        dispenser4.dispense(15); // Пример с выдачей

        // Печатаем информацию о каждом диспенсере
        System.out.println("Информация о диспенсерах:");
        dispenser1.printInfo();
        dispenser2.printInfo();
        dispenser3.printInfo();
        dispenser4.printInfo();
    }
}
