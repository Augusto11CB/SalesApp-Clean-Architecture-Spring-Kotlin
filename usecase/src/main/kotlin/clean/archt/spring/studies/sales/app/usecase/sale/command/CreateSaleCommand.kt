package clean.archt.spring.studies.sales.app.usecase.sale.command

import clean.archt.spring.studies.sales.app.usecase.sale.SaleModel

interface CreateSaleCommand {

    fun execute(model: SaleModel)
}