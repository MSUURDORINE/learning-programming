def findAllOccurrences(numbers, target):

    for index in range(len(numbers)):
        if numbers[index] == target:
            print("Fount at index ", index)

numbers = [1, 2, 3, 2, 4, 2, 5, ]

findAllOccurrences(numbers, 2)
