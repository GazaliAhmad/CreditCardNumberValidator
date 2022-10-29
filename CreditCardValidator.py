odd_digits_sum: int = 0
even_digits_sum: int = 0
total_sum: int = 0

credit_card_number: str = input(
    "Enter a credit card number without spaces or dashes: ")
credit_card_number = credit_card_number[::-1]

for x in credit_card_number[::2]:
    odd_digits_sum += int(x)

for x in credit_card_number[1::2]:
    x = int(x) * 2
    if x >= 10:
        even_digits_sum += (1 + (x % 10))
    else:
        even_digits_sum += x

total_sum = odd_digits_sum + even_digits_sum

print(f'\nThe credit card number: {credit_card_number[::-1]} is valid\n') if total_sum % 10 == 0 else print(
    f'The credit card number: {credit_card_number[::-1]} is invalid\n')
