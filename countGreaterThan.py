def countGreaterThan(numbers, threshold):
    count = 0

    for index in range(len(numbers)):
        if numbers[index] > threshold:
            count += 1

    return count


numbers = [3, 7, 2, 9, 5, 1, 8]

print(countGreaterThan(numbers, 5))
