package clean.archt.spring.studies.sales.app.entity.domain

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

//@SpringBootTest
class PollsApplicationTests {

    @Test
    fun contextLoads() {
    }

    private lateinit var customer: Customer
    private val id = 1L
    private val name = "Test"

    @BeforeAll
    fun init() {
        this.customer = Customer(id, name)
    }

    fun testSetAndGetId() {

    }


    fun testSetAndGetName() {

    }
}