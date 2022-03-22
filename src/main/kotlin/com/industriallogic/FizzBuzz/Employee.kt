package com.industriallogic.FizzBuzz

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Employee(
    val firstname: String,
    val lastname: String,
    val description: String
) {
    @Id
    @GeneratedValue
    var id: Long? = null
}
