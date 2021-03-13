package com.claudiodesio.collections;

import java.util.Collection;

public class MappaIncrementaleRobusta<K, V> extends MappaIncrementale<K, V> {

    @Override
    protected Collection<V> getCollection() {
        return new SetRobusto<>();
    }
    
}