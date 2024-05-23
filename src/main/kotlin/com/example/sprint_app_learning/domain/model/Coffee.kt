package com.example.sprint_app_learning.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "coffee")
open class Coffee(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long? = 0,
    open var name: String? = null
)