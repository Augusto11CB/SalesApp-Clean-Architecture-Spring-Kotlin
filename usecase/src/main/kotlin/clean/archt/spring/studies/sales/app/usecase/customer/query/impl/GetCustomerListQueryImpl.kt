package clean.archt.spring.studies.sales.app.usecase.customer.query.impl

import clean.archt.spring.studies.sales.app.usecase.customer.CustomerModel
import clean.archt.spring.studies.sales.app.usecase.customer.query.GetCustomerListQuery
import clean.archt.spring.studies.sales.app.usecase.customer.gateway.CustomerDataBaseService
import clean.archt.spring.studies.sales.app.usecase.customer.toModel

class GetCustomerListQueryImpl(private val customerDataBaseService: CustomerDataBaseService) : GetCustomerListQuery {

    override fun execute(): List<CustomerModel> {
        return customerDataBaseService.findAll().map { it.toModel() }.toList()
    }

}