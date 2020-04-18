package clean.archt.spring.studies.sales.app.usecase.employee.query

import clean.archt.spring.studies.sales.app.usecase.employee.EmployeeModel

interface GetEmployeeListQuery {

    fun execute(): List<EmployeeModel>
}