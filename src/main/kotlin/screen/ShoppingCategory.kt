package screen

import data.CartItems

class ShoppingCategory {
    public fun showCategories() {
        val categories: Array<String> = arrayOf("패션", "전자기기", "반려동물용품")
        val category2 = arrayOf("패션", "전자기기", "반려2")
        val category3 = arrayOf<String>("패현3,", "전자기기3", "반려3")
        //val intArray = IntArray(3) (1, 2, 0)
        val falt = FloatArray(3) { 1f; 3f; 2f }

        for (categoryName in categories) {
            println(categoryName)
        }
        println("=> 장바구니로 이동하시려면 #을 입력해주세요")
        var inputCategory: String? = readLine()
        while (inputCategory.isNullOrBlank()) {
            println("값을 입력해주세요.")
            inputCategory = readLine();
        }

        if (inputCategory == "#") {
            val shoppingCart = ShoppingCart();
            shoppingCart.showCartItems()
        }
        else {
            // TODO 2. 카테고리 상품 목록 보여주기
            if(categories.contains(inputCategory)){
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(inputCategory)
            }
            else {
                showErrorMessage(inputCategory)
            }

            // 장바구니 담기
            println("""
                =====================================
                장바구니에 담을 상품 번호를 선택해주세요.
            """.trimIndent())

        }
    }

    private fun showErrorMessage(inputCategory: String?) {
        println("$inputCategory")
        showCategories()
    }

}