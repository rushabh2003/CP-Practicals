def totDis(houses):
    houses.sort()

    median_index = len(houses) // 2

    median_house = houses[median_index]

    total_dist = sum(abs(house - median_house) for house in houses)

    return total_dist

n = int(input("Enter no. of houses: "))
houses = list(map(int, input("Enter houses: ").split()))
min_dist = totDis(houses)
print(min_dist)
