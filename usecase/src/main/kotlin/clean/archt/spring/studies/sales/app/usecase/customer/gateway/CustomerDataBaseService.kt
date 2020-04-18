package clean.archt.spring.studies.sales.app.usecase.customer.gateway

import clean.archt.spring.studies.sales.app.entity.domain.Customer

interface CustomerDataBaseService {

    fun findAll(): List<Customer>

    fun findById(id:Long):Customer?
}