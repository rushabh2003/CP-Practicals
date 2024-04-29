def min_money_exchange(expenses):
    total_expenses = sum(expenses)
    print(round(total_expenses, 2))

    equal_share = total_expenses / len(expenses)

    money_exchange = sum(abs(expense - equal_share) for expense in expenses)

    return money_exchange

expenses = list(map(float, input("Enter expenses: ").split()))
min_money = min_money_exchange(expenses)
print(round(min_money/2, 2))