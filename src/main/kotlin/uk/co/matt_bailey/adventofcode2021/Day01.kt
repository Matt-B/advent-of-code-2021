package uk.co.matt_bailey.adventofcode2021

class Day01() {

    fun solvePart1(input: List<String>): Int {
        return getNumberOfIncreases(input.map { it.toInt() })
    }

    fun solvePart2(input: List<String>): Int {
        var listOfDepths: List<Int> = input.map { it.toInt() }
        var threeTierMeasurements = listOfDepths.mapIndexed { index, element ->
            element + listOfDepths.getOrElse(index + 1) { 0 } + listOfDepths.getOrElse(index + 2) { 0 }
        }
        return getNumberOfIncreases(threeTierMeasurements)
    }

    private fun getNumberOfIncreases(input: List<Int>): Int {
        var numberOfIncreases = 0
        for(index in 1 until input.size) {
            if(input[index] > input[index - 1]) {
                numberOfIncreases++
            }
        }
        return numberOfIncreases
    }

}
