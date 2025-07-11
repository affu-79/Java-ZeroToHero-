import java.util.*;
// internal Implementation of HashMap !
public class Program115 {

    // Custom implementation of a generic HashMap
    static class HashMap<K, V> {

        // Inner class to store key-value pair
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total number of nodes (entries)
        private int N; // total number of buckets
        private LinkedList<Node>[] buckets; // array of linked lists

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // initial number of buckets
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash function to convert key → bucket index
        private int hashFunction(K key) {
            int bi = Math.abs(key.hashCode()) % N;
            return bi;
        }

        // Searches for key in linked list at bucket[bi], returns index or -1
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i; // found at index i
                }
            }
            return -1; // not found
        }

        // Doubles the bucket size and re-inserts all existing nodes
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2; // double the bucket size
            buckets = new LinkedList[N]; // new bucket array

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Reset node count
            n = 0;

            // Re-insert all old nodes
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> li = oldBuckets[i];
                for (int j = 0; j < li.size(); j++) {
                    Node node = li.get(j);
                    put(node.key, node.value); // rehash
                }
            }
        }

        // Puts a key-value pair in the map
        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index (linked list index)

            if (di == -1) { // key not present
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exists → update value
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double) n / N; // load factor
            if (lambda > 2.0) { // rehash if load factor exceeds threshold
                rehash();
            }
        }

        // Returns value for a given key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null; // key not found
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        // Checks if a key is present
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        // Removes a key and returns the value
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null; // not found
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        // Returns true if map is empty
        public boolean isEmpty() {
            return n == 0;
        }

        // Returns list of all keys in map
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("India", 120);
        map.put("China", 200);
        map.put("USA", 170);

        // Display keys and their values
        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " : " + map.get(keys.get(i)));
        }

        // Remove a key
        map.remove("India");
        System.out.println("After removing India: " + map.get("India")); // should be null
    }
}
