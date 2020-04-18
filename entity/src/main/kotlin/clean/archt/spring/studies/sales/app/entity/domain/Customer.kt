package clean.archt.spring.studies.sales.app.entity.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Customer(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val name: String
) : Entity