package uk.co.matt_bailey.adventofcode2021

import java.io.File
import kotlin.test.Test

class Day02Test {

    @Test
    fun `Part 1 - Can solve provided example`() {

        val inputs = listOf(
            "forward 5",
            "down 5",
            "forward 8",
            "up 3",
            "down 8",
            "forward 2"
        )

        val answer = Day02().solvePart1(inputs)

        assert(answer == 150)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day2.txt").readLines()

        val answer = Day02().solvePart1(inputs)

        assert(answer == 1499229)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {

        val inputs = listOf(
            "forward 5",
            "down 5",
            "forward 8",
            "up 3",
            "down 8",
            "forward 2"
        )

        val answer = Day02().solvePart2(inputs)

        assert(answer == 900)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {

        val inputs = File("src/test/resources/day2.txt").readLines()

        val answer = Day02().solvePart2(inputs)

        assert(answer == 1340836560)
    }

}
