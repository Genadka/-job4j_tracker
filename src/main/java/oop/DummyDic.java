package oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String translation = dic.engToRus("apple");
        System.out.println(translation);
    }
}
