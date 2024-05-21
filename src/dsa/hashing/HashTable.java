package dsa.hashing;

import java.util.LinkedList;

public class HashTable<T> {
    private LinkedList[] hashTable;
    private int size;

    public HashTable(int N) {
        hashTable = new LinkedList[N];
    }

    public void put(T value) {
        int hashIndex = hash(value);

        if (hashTable[hashIndex] == null) {
            hashTable[hashIndex] = new LinkedList();
        }
        hashTable[hashIndex].add(value);
        size++;
    }

    //nje metode me lexu listen per cdo linked list
    // nje metode me fshi
    // na ka mbet edhe key me specifiku

    private int hash(T value) {
        return (value.hashCode() & 0x7fffffff) % hashTable.length;
    }
}
