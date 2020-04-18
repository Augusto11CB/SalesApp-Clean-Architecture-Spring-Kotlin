package clean.archt.spring.studies.sales.app.usecase.employee.gateway

import clean.archt.spring.studies.sales.app.entity.domain.Employee

interface EmployeeDataBaseService {

    fun findAll(): List<Employee>

    fun findById(id: Long): Employee?
}