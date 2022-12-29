package br.com.gabriel.admin.catalogo.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CategoryTest {
    @Test
    fun `Should create a new instance of Category`() {
        Assertions.assertNotNull(Category())
    }

    @Test
    fun `Should return a new object of Category with id equals 1`() {
        val category = Category()
        category.id = "1"

        Assertions.assertEquals("1", category.id)
    }
}