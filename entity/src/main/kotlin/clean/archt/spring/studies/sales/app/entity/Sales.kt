package clean.archt.spring.studies.sales.app.entity

import java.time.LocalDateTime
import javax.persistence.*

data class Sales(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val datePurchase: LocalDateTime = LocalDateTime.now(),

        val unitPrice: Double,

        val quantity: Int,

        val totalPrice: Double,

        @ManyToOne
        @JoinColumn(name = "id")
        val idCustomer: Customer,

        @ManyToOne
        @JoinColumn(name = "id")
        val idEmployee: Employee,
        
        @ManyToOne
        @JoinColumn(name = "id")
        val idProduct: Product

) : Entity