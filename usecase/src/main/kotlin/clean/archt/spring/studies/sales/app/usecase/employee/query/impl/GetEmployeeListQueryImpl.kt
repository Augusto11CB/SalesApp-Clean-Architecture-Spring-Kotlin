package clean.archt.spring.studies.sales.app.usecase.employee.query.impl

import clean.archt.spring.studies.sales.app.usecase.employee.EmployeeModel
import clean.archt.spring.studies.sales.app.usecase.employee.query.GetEmployeeListQuery
import clean.archt.spring.studies.sales.app.usecase.employee.gateway.EmployeeDataBaseService
import clean.archt.spring.studies.sales.app.usecase.employee.toModel

class GetEmployeeListQueryImpl(private val customerDataBaseService: EmployeeDataBaseService) : GetEmployeeListQuery {

    override fun execute(): List<EmployeeModel> {
        return customerDataBaseService.findAll().map { it.toModel() }.toList()
    }

}