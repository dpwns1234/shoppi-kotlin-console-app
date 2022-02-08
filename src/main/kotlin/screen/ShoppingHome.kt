package screen

class ShoppingHome {

    fun start() {
        showWelcomeMessage()
        showCategories()


    }
    private fun showWelcomeMessage() {
        println("안녕, shoppi에 오신 것을 환영합니다!");
        println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

        val name = readLine()
        println(
            """
            감사합니다. 반가워요 $name 님
            원하시는 카테고리를 선택해주세요
            ***===============================================***
        """.trimIndent()
        )
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }
}