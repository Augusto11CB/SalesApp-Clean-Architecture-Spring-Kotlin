package clean.archt.spring.studies.sales.app.usecase.sale

import clean.archt.spring.studies.sales.app.entity.domain.Customer
import clean.archt.spring.studies.sales.app.entity.domain.Employee
import clean.archt.spring.studies.sales.app.entity.domain.Product
import clean.archt.spring.studies.sales.app.entity.domain.Sale
import java.time.LocalDateTime


data class SaleModel(
        val id: Long,
        val datePurchase: LocalDateTime = LocalDateTime.now(),
        val unitPrice: Double,
        val quantity: Int,
        val totalPrice: Double,
        val customerName: String,
        val employeeName: String,
        val productName: String
)

fun SaleModel.toEntity(customer: Customer, employee: Employee, product: Product): Sale {
    return Sale(
            id,
            datePurchase,
            unitPrice,
            quantity,
            totalPrice,
            customer,
            employee,
            product
    )
}

fun Sale.toModel(): SaleModel {
    return SaleModel(
            id,
            datePurchase,
            unitPrice,
            quantity,
            totalPrice,
            customer.name,
            employee.name,
            product.name
    )
}

fun List<Sale>.toModel(): List<SaleModel> {
    return map { it.toModel() }
}