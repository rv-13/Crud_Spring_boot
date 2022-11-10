package com.example.CRUDApplication.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //  @Column(name = "id", nullable = false)
    private Long id;

    //    private Long id;
    private String title;
    private String author;

}
