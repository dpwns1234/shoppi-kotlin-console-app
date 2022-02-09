package screen
import data.CartItems
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

//            val productSize = categoryProducts.size
//            for(index in 0 until productSize) {
//                println("$index, ${categoryProducts[index].name}")
//            }
            // 고차원 함수로 위의 주석 코드를 아래 코드로 변경
            categoryProducts.forEachIndexed{ index, product ->
                println("$index, ${product.name}")
            }

            // 장바구니
            showCartOption(categoryProducts, inputCategory)
        }
        else {
            categoryEmptyErrorMessage(inputCategory)
        }
    }

    private fun categoryEmptyErrorMessage(inputCategory: String) {
        println("$inputCategory 의 상품이 없습니다.")
    }

    private fun showCartOption(categoryProducts: List<Product>, inputCategory: String) {
        println("""
            ***===============================================***
            장바구니에 담을 상품 번호를 선택해주세요.
        """.trimIndent())

        val selectedIndex = readLine()?.toIntOrNull()!!
        categoryProducts.getOrNull(selectedIndex)?.let { product ->
            CartItems.addProduct(product)
            println("=> 장바구니로 이동하시려면 #을, 계속 쇼핑하시려면 *을 입력해주세요.")
            val answer = readLine()
            if(answer == "#") {
                val shoppingCart = ShoppingCart()
                shoppingCart.showCartItems()
            }
            else if(answer == "*") {
                showProducts(inputCategory)
            }
            else {
                // TODO. 그 외 값을 입력한 경우에 대한 처리
            }

        }
    }

}