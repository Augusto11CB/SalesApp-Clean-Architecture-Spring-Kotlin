package clean.archt.spring.studies.sales.app.usecase.sale.gateway

import clean.archt.spring.studies.sales.app.entity.domain.Sale

interface SaleDataBaseService {

    fun findAll(): List<Sale>

    fun findSaleById(id: Long): Sale

    fun createSale(sale: Sale)
}