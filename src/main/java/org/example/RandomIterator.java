package org.example;

import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {
    int max;
    int min;

    private final Random random = new Random();

    public RandomIterator(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }
}
