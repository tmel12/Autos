package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Warteschlange {
    private Queue<String> queue;
    private int kapazitaet;

    public Warteschlange(int kapazitaet) {
        this.kapazitaet = kapazitaet;
        this.queue = new LinkedList<>();
    }

    public boolean autoHinzufuegen(String auto) {
        if(queue.size() < kapazitaet) {
            queue.add(auto);
            return true;
        }
        else {
            return false;
        }
    }

    public String autoEntfernen() {
        if(!istLeer()) {
            return queue.poll();
        }
        return null;
    }

    public boolean verlassen(String auto) {
        return queue.remove(auto);
    }

    public int groesse() {
        return queue.size();
    }

    public boolean istVoll() {
        return queue.size() == kapazitaet;
    }

    public boolean istLeer() {
        return queue.isEmpty();
    }
}
