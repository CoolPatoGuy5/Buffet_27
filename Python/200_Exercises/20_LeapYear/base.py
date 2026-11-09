x = input("Please enter a year you'd like to check: ")
x = int(x)
if x % 4 != 0:
    print(str(x) + " is not a leap year.")
elif x % 100 == 0 and x % 400 != 0:
    print(str(x) + " is not a leap year")
else:
    print(str(x) + " is a leap year!")
