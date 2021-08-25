package de.niklas.utils.atomic;

import java.util.concurrent.ConcurrentHashMap;

public interface AtomicMap<K, V> {
    V get(K key);
    V getAndInc(K key);
    V incAndGet(K key);
    void set(K key, V value);
    void setAndInc(K key, V value);
    V setAndGet(K key, V value);
    V setAndIncAndGet(K key, V value);
}
