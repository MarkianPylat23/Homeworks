package com.cursor.lfu.lfu.task;

public class Node {
    public int key;
    public String news;
    public int frequency;
    Node prev;
    Node next;

    public Node(int key, String news, int frequency){
        this.key   = key;
        this.news = news;
        this.frequency = frequency;
    }
}
