package com.claudiodesio.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MappaIncrementale<K, V> extends HashMap<K, Collection<V>> {

    public void add(K key, V value) {
        if (this.get(key) == null) {
            Collection<V> collection = getCollection();
            collection.add(value);
            this.put(key, collection);
        } else {
            Collection<V> arrayList = this.get(key);
            arrayList.add(value);
        }
    }

    protected Collection<V> getCollection() {
        return new ArrayList<>();
    }
}