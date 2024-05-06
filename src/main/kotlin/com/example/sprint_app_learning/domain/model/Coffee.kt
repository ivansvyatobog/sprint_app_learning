package com.example.sprint_app_learning.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "coffee")
class Coffee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String
)