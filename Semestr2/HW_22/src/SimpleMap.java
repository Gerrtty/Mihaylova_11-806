public class SimpleMap<K, V> implements Map<K, V> {
    Entry[] entries;
    private int n = 0;
    private double CONSTANTA = 1.5;

    public SimpleMap(int size) {
        entries = new Entry[size];
    }

    @Override
    public void put(K key, V value) {
        if(n == entries.length){
            grow();
        }
        for(int i = 0; i < n; i++){
            if(entries[i].key.equals(key)){
                entries[i].value = value;
                return;
            }
        }
        Entry<K, V> entry = new Entry(key, value);
        entries[n] = new Entry<>(key, value);
        n++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                return (V) entries[i].value;
            }
        }
        return null;
    }

    public void grow(){
        Entry[] newEntries = new Entry[(int)(entries.length * CONSTANTA)];
        for(int i = 0; i < n; i++){
            newEntries[i] = entries[i];
        }
        entries = newEntries;
    }

    public boolean isRepeat(K key){
        for(int i = 0; i < n; i++){
            if(entries[i].key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(int i = 0; i < n; i++){
            System.out.println(entries[i].key + ": " + entries[i].value);
        }
    }
}

class Entry<A, B>{
    A key;
    B value;

    public Entry(A key, B value){
        this.key = key;
        this.value = value;
    }
}
