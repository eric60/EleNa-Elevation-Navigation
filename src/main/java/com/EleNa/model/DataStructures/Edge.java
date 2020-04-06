package com.EleNa.model.DataStructures;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "edges")
public class Edge {
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

    public void setDest(long dest) {
        this.dest = dest;
        this.distance = 1.0;
    }

}