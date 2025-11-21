package singleTonDP;

public class SingleTonPatternEager {

    // Eager way of creating SingleTon Object

    private static SingleTonPatternEager singleTonPatternEager = new SingleTonPatternEager();

    public static SingleTonPatternEager getInstance() {
        return singleTonPatternEager;
    }
}
