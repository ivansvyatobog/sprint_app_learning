package com.example.sprint_app_learning.domain

import com.example.sprint_app_learning.domain.model.Coffee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CoffeeRepository : CrudRepository<Coffee, Long>