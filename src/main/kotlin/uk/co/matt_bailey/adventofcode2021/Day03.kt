package uk.co.matt_bailey.adventofcode2021

class Day03 {

    fun solvePart1(input: List<String>): Int {

        var finalBinaryGamma = ""
        var finalBinaryEpsilon = ""

        for(index in 0 until input.first().length) {
            if(getOccurrencesOfBitAtColumnIndex(input, '0', index) > getOccurrencesOfBitAtColumnIndex(input, '1', index)) {
                finalBinaryGamma += "0"
                finalBinaryEpsilon += "1"
            } else {
                finalBinaryGamma += "1"
                finalBinaryEpsilon += "0"
            }
        }

        return Integer.parseInt(finalBinaryEpsilon, 2) * Integer.parseInt(finalBinaryGamma, 2)
    }

    fun solvePart2(input: List<String>): Int {

        var oxygenGeneratorRating = filterByOccurrencesOfBitAtIndexes(input, true)
        var co2ScrubberRating = filterByOccurrencesOfBitAtIndexes(input, false)

        return Integer.parseInt(oxygenGeneratorRating, 2) * Integer.parseInt(co2ScrubberRating, 2)
    }

    private fun getOccurrencesOfBitAtColumnIndex(input: List<String>, bit: Char, index: Int): Int {

        var columns = Array(input.first().length) { "" }

        input.forEach {
            it.toCharArray().forEachIndexed { index, char ->
                columns[index] = columns[index] + char
            }
        }

        return columns[index].count { it == bit }
    }

    private fun filterByOccurrencesOfBitAtIndexes(input: List<String>, mostPopular: Boolean): String {

        var currentIndex = 0
        var inputList = input

        while(inputList.size > 1) {
            inputList = if(getOccurrencesOfBitAtColumnIndex(inputList, '1', currentIndex) >= getOccurrencesOfBitAtColumnIndex(inputList, '0', currentIndex)) {
                if(mostPopular) { inputList.filter { it[currentIndex] == '1' } } else { inputList.filter { it[currentIndex] == '0' } }
            } else {
                if(mostPopular) { inputList.filter { it[currentIndex] == '0' } } else { inputList.filter { it[currentIndex] == '1' } }
            }
            currentIndex++
        }

        return inputList.first()
    }
}
