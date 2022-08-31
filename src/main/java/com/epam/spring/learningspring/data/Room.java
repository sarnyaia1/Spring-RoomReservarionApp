package com.epam.spring.learningspring.data;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "BED_INFO")
    private String bedInfo;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + roomId +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                '}';
    }
}