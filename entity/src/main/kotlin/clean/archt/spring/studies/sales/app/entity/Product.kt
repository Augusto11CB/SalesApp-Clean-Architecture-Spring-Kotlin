package clean.archt.spring.studies.sales.app.entity

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Product(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val name: String,

        val price: Double
) : Entity