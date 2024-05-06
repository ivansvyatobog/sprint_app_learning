package com.example.sprint_app_learning.controller

import com.example.sprint_app_learning.domain.CoffeeRepository
import com.example.sprint_app_learning.domain.model.Coffee
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/coffees")
class RestApiDemoController(
    private val coffeeRepository: CoffeeRepository
) {

    @GetMapping
    fun getCoffees(): Iterable<Coffee> {
        return coffeeRepository.findAll()
    }

    @GetMapping("/{id}")
    fun getCoffeeById(
        @PathVariable id: Long
    ): Optional<Coffee> {
        return coffeeRepository.findById(id)
    }

    @PostMapping
    fun postCoffee(@RequestBody coffee: Coffee): Coffee {
        return coffeeRepository.save(coffee)
    }

    @PutMapping("/{id}")
    fun putCoffee(@PathVariable id: Long, @RequestBody coffee: Coffee): ResponseEntity<Coffee> {
        return if (coffeeRepository.existsById(id)) {
            ResponseEntity(coffeeRepository.save(coffee), HttpStatus.OK)
        } else {
            ResponseEntity(coffeeRepository.save(coffee), HttpStatus.CREATED)
        }
    }

    @DeleteMapping("/{id}")
    fun deleteCoffee(@PathVariable id: Long) {
        coffeeRepository.deleteById(id)
    }
}