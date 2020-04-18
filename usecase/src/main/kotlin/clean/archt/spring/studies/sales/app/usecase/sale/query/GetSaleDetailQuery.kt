package clean.archt.spring.studies.sales.app.usecase.sale.query

import clean.archt.spring.studies.sales.app.usecase.sale.SaleModel

interface GetSaleDetailQuery{

    fun execute(idSale:Long): SaleModel
}