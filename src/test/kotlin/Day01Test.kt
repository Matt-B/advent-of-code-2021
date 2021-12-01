package uk.co.matt_bailey.adventofcode2021

import java.io.File
import kotlin.test.Test

class Day01Test {

    @Test
    fun `Part 1 - Can solve provided example`() {

        val inputs = listOf("199", "200", "208", "210", "200", "207", "240", "269", "260", "263")

        val answer = Day01().solvePart1(inputs)

        assert(answer == 7)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day1.txt").readLines()

        val answer = Day01().solvePart1(inputs)

        assert(answer == 1692)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {

        val inputs = listOf("199", "200", "208", "210", "200", "207", "240", "269", "260", "263")

        val answer = Day01().solvePart2(inputs)

        assert(answer == 5)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day1.txt").readLines()

        val answer = Day01().solvePart2(inputs)

        assert(answer == 1724)
    }

}
