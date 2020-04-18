package clean.archt.spring.studies.sales.app.usecase.customer

import clean.archt.spring.studies.sales.app.entity.domain.Customer

data class CustomerModel(
        val id: Long,
        val name: String
)

fun Customer.toModel(): CustomerModel {
    return CustomerModel(id, name)
}

fun List<Customer>.toModel(): List<CustomerModel> {
    return map { it.toModel() }
}