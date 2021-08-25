package de.niklas.utils.atomic;

import java.util.concurrent.ConcurrentHashMap;

public class AtomicDoubleMap<K> implements AtomicMap<K, Double> {

    private final ConcurrentHashMap<K, Double> map;

    public AtomicDoubleMap() {
        map = new ConcurrentHashMap<>();
    }

    @Override
    public Double get(K key) {
        return map.get(key);
    }

    @Override
    public Double getAndInc(K key) {
        double d = get(key);
        double n = d + 1;
        set(key, n);
        return d;
    }

    @Override
    public Double incAndGet(K key) {
        double d = get(key);
        d += 1;
        set(key, d);
        return d;
    }

    @Override
    public void set(K key, Double value) {
        map.put(key, value);
    }

    @Override
    public void setAndInc(K key, Double value) {
        double n = value + 1;
        set(key, n);
    }

    @Override
    public Double setAndGet(K key, Double value) {
        set(key, value);
        return get(key);
    }

    @Override
    public Double setAndIncAndGet(K key, Double value) {
        set(key, value);
        return getAndInc(key);
    }
}
