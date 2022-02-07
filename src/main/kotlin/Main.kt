fun main(args: Array<String>) {

    println("안녕, shoppi에 오신 것을 환영합니다!");
    println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

    val name = readLine()
    println("""
        감사합니다. 반가워요 $name 님
        원하시는 카테고리를 선택해주세요
        ***===============================================***
    """.trimIndent())
    /*
    카테고리 출력
    입력 받은 후 저장
     */

    val categories : Array<String> = arrayOf("패션", "전자기기", "반려동물용품")
    val category2 = arrayOf("패션", "전자기기", "반려2")
    val category3 = arrayOf<String>("패현3,", "전자기기3", "반려3")
    //val intArray = IntArray(3) (1, 2, 0)
    val falt = FloatArray(3) { 1f; 3f; 2f}

    for(categoryName in categories) {
        println(categoryName)
    }
    println("=> 장바구니로 이동하시려면 #을 입력해주세요")
    var inputCategory: String? = readLine()
    while(inputCategory.isNullOrBlank())
    {
        println("값을 입력해주세요.")
        inputCategory = readLine();
    }

    if(inputCategory == "#") {
        // TODO 1. 장바구니 이동
    }
    else {
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 주어진 카테고리를 입력하지 않을 경우 예외 처리 해주기
    }






}