package uk.co.matt_bailey.adventofcode2021

import java.io.File
import kotlin.test.Test

class Day03Test {

    @Test
    fun `Part 1 - Can solve provided example`() {

        val inputs = listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010"
        )

        val answer = Day03().solvePart1(inputs)

        assert(answer == 198)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day3.txt").readLines()

        val answer = Day03().solvePart1(inputs)

        assert(answer == 693486)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {

        val inputs = listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010"
        )

        val answer = Day03().solvePart2(inputs)

        assert(answer == 230)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day3.txt").readLines()

        val answer = Day03().solvePart2(inputs)

        assert(answer == 3379326)
    }
}
