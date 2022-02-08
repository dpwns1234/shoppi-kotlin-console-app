package screen
import data.Product

class ShoppingProductList {
    private val products = arrayOf(
        Product("패션", "겨울 패딩"),
        Product("전자기기", "핸드폰"),
        Product("반려", "간식 사료"),
        Product("반려", "치약")
    )
    private val categories: Map<String, List<Product>> = products.groupBy{ product ->
        product.categoryLabel
    }

    fun showProducts(inputCategory: String) {
        val categoryProducts = categories[inputCategory]
        if(!categoryProducts.isNullOrEmpty()) {
            println("""
                ======================================
                선택하신 [$inputCategory] 카테고리 입니다.
            """.trimIndent())

            val productSize = categoryProducts.size
            for(index in 0 until productSize) {
                println("$index, ${categoryProducts[index].name}")
            }
        }
        else {
            categoeyEmptyErrorMessage(inputCategory)
        }
    }

    private fun categoeyEmptyErrorMessage(inputCategory: String) {
        println("$inputCategory 의 상품이 없습니다.")
    }
}