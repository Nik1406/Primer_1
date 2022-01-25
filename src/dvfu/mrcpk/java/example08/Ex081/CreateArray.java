package dvfu.mrcpk.java.example08.Ex081;

public class CreateArray {
    public static void main(String[] args) { // примитивный тип, размер массива задан явно
        int[] price = new int[10]; // неявное задание размера
        int[] rooms = new int[] { 1, 2, 3 }; // содержит ссылочные переменные
        Item[] items = new Item[10];
        Item[] undefinedItems = new Item[] { new Item(1), new Item(2), new Item(3) };
    }
}
class Item {
    public Item(int i) {
    }
}
