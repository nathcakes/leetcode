package google

fun romanToInt(s: String): Int {
    var i = 0;
    var sum = 0;
    while (i < s.length) {
        val current = s[i]
        when (current) {
            'I' -> {
                if (i + 1 < s.length) {
                    if (s[i + 1] == 'V') {
                        sum += 4;
                        i += 2;
                    } else if (s[i + 1] == 'X') {
                        sum += 9;
                        i += 2;
                    } else {
                        sum++; i++;
                    }
                } else {
                    sum++; i++;
                }
            }

            'V' -> {
                sum += 5;i++;
            }

            'X' -> {
                if (i + 1 < s.length) {
                    if (s[i + 1] == 'L') {
                        sum += 40;
                        i += 2;
                    } else if (s[i + 1] == 'C') {
                        sum += 90;
                        i += 2;
                    } else {
                        sum += 10;
                        i++;
                    }
                } else {
                    sum += 10;
                    i++;
                }
            }

            'L' -> {
                sum += 50;i++;
            }

            'C' -> {
                if (i + 1 < s.length) {
                    if (s[i + 1] == 'D') {
                        sum += 400;
                        i += 2;
                    } else if (s[i + 1] == 'M') {
                        sum += 900;
                        i += 2;
                    } else {
                        sum += 100;
                        i++;
                    }
                } else {
                    sum += 100;
                    i++;
                }
            };
            'D' -> {
                sum += 500;i++;
            }

            'M' -> {
                sum += 1000;i++;
            }

            else -> return -1;
        }
    }
    return sum;
}

fun main() {
    println("Expected 3: Result ${romanToInt("III")}")
    println("Expected: 58 Result ${romanToInt("LVIII")}")
    println("Expected 1994 Result: ${romanToInt("MCMXCIV")}")
}