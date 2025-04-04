package org.example

fun main() {
    checkSudoku(
        name = "should return true when sudoku contains empty cells represented by '-'",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedAnswer = true
    )

    checkSudoku(
        name = "should return false when the board is not square",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9', '1')
            )
        ),
        expectedAnswer = false
    )

    checkSudoku(
        name = "should return true when sudoku with numbers inside valid range",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '4', '6', '7', '0', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        expectedAnswer = false
    )


    checkSudoku(
        name = "should return true when sudoku with no duplicate in row",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedAnswer = true
    )


    checkSudoku(
        name = "should return true when sudoku with no duplicate in column",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '8', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedAnswer = false
    )


    checkSudoku(
        name = "should return true when sudoku with no duplicate in subgrid",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '-', '9', '-', '5'),
                listOf('-', '-', '4', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedAnswer = false
    )


}

fun checkSudoku(name: String, result: Boolean, expectedAnswer: Boolean) {
    println("Test: $name")
    if (result == expectedAnswer ) {
        println("Test Passed")
    } else {
        println("Test Failed")
    }
}