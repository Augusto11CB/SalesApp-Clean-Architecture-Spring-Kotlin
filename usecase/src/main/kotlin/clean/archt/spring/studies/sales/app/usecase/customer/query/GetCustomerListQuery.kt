package clean.archt.spring.studies.sales.app.usecase.customer.query

import clean.archt.spring.studies.sales.app.usecase.customer.CustomerModel

interface GetCustomerListQuery {

    fun execute(): List<CustomerModel>
}