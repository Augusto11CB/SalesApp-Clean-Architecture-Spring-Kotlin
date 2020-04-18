package clean.archt.spring.studies.sales.app.entity.domain

import java.time.LocalDateTime
import javax.persistence.*

data class Sale(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val datePurchase: LocalDateTime = LocalDateTime.now(),
        val unitPrice: Double,
        val quantity: Int,
        val totalPrice: Double,

        @ManyToOne
        @JoinColumn(name = "id")
        val customer: Customer,

        @ManyToOne
        @JoinColumn(name = "id")
        val employee: Employee,

        @ManyToOne
        @JoinColumn(name = "id")
        val product: Product

) : Entity