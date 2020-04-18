package clean.archt.spring.studies.sales.app.usecase.employee

import clean.archt.spring.studies.sales.app.entity.domain.Employee

data class EmployeeModel(
        val id: Long,
        val name: String
)

fun Employee.toModel(): EmployeeModel {
    return EmployeeModel(id, name)
}

fun List<Employee>.toModel(): List<EmployeeModel> {
    return map { it.toModel() }
}