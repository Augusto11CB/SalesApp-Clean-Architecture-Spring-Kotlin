package clean.archt.spring.studies.sales.app.usecase.sale.command.impl

import clean.archt.spring.studies.sales.app.usecase.customer.gateway.CustomerDataBaseService
import clean.archt.spring.studies.sales.app.usecase.employee.gateway.EmployeeDataBaseService
import clean.archt.spring.studies.sales.app.usecase.product.gateway.ProductDataBaseService
import clean.archt.spring.studies.sales.app.usecase.sale.SaleModel
import clean.archt.spring.studies.sales.app.usecase.sale.command.CreateSaleCommand
import clean.archt.spring.studies.sales.app.usecase.sale.gateway.SaleDataBaseService
import clean.archt.spring.studies.sales.app.usecase.sale.toEntity

class CreateSaleCommandImpl(
        private val saleDataBaseService: SaleDataBaseService,
        private val customerDataBaseService: CustomerDataBaseService,
        private val employeeDataBaseService: EmployeeDataBaseService,
        private val productDataBaseService: ProductDataBaseService
) : CreateSaleCommand {
    override fun execute(model: SaleModel) {

        //TODO update SaleModel to Store EmployeeModel, CustomerModel, ProductModel
//        val customer = customerDataBaseService.findById(model.)

//        saleDataBaseService.createSale(model.toEntity())
    }

}