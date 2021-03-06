package com.EleNa.model.DataStructures;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "edges")
public class Edge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "src")
    private long src;

    @Column(name = "dest")
    private long dest;

    @Column(name = "distance")
    private double distance;

    public Edge(long src) {
        this.src = src;
    }

    public Edge(){}

    public Edge(int id, long src, long dest, double distance) {
        this.id = id;
        this.src = src;
        this.dest = dest;
        this.distance = distance;
    }

    public Edge(long src, long dest) {
        this.src = src;
        this.dest = dest;
    }

    public void setDest(long dest) {
        this.dest = dest;
        this.distance = 1.0;
    }

    public long getSrc() {
        return this.src;
    }

    public long getDest() {
        return this.dest;
    }
}