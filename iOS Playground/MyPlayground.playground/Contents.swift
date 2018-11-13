import UIKit

func fibonacci(num : Int) -> Int {
    if num < 1 {
        print("Invalid input")
        return -1
    }
    if num == 1 || num == 2 {
        return 1
    }
    var pre = 1, cur = 1, temp = 0, i = 3
    while i <= num {
        temp = cur
        cur += pre
        pre = temp
        i += 1
    }
    return cur
}

fibonacci(num : 10)

func isPrime(num : Int) -> Bool {
    if num <= 1 {
        return false
    }
    var i = 2
    while i <= num / 2 {
        if num % 2 == 0 {
            return false
        }
        i += 1
    }
    return true
}

isPrime(num : 111)

func factorialCalculator(num : Int) -> Int {
    if num < 0 {
        return -1
    }
    if num == 0 || num == 1 {
        return 1
    }
    var i = 2, res = 1
    while i <= num {
        res *= i
        i += 1
    }
    return res
}

factorialCalculator(num: 5)
