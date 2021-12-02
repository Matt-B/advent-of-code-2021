package uk.co.matt_bailey.adventofcode2021

class Day02 {

    fun solvePart1(input: List<String>): Int {
        var horizontalPosition = 0
        var verticalPosition = 0
        input.forEach {
            var direction = it.split(" ")[0]
            var magnitude = it.split(" ")[1].toInt()
            if(direction == "forward") {
                horizontalPosition += magnitude
            } else {
                if(direction == "up") {
                    verticalPosition -= magnitude
                } else {
                    verticalPosition += magnitude
                }
            }

        }
        return horizontalPosition * verticalPosition
    }

    fun solvePart2(input: List<String>): Int {
        var horizontalPosition = 0
        var verticalPosition = 0
        var aim = 0
        input.forEach {
            var command = it.split(" ")[0]
            var magnitude = it.split(" ")[1].toInt()
            when (command) {
                "down" -> aim += magnitude
                "up" -> aim -= magnitude
                "forward" -> {
                    horizontalPosition += magnitude
                    verticalPosition += (magnitude * aim)
                }
            }
        }
        return horizontalPosition * verticalPosition
    }

}
