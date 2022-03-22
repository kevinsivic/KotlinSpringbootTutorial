package com.industriallogic.FizzBuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class EmployeeTests {
    private val description = "description"
    lateinit var employee: Employee

    private val firstname = "firstname"

    private val lastname = "lastname"

    private fun employee(): Employee {
        return Employee(firstname, lastname, description)
    }

    @BeforeEach
    fun beforeEach() {
        this.employee = employee()
    }

    @Test
    fun shouldHaveFirstName() {
        assertEquals(firstname, employee.firstname)
    }

    @Test
    fun shouldHaveLastName() {
        assertEquals(lastname, employee.lastname)
    }

    @Test
    fun shouldHaveDescription() {
        assertEquals(description, employee.description)
    }
}