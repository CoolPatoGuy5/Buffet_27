x = input("Please enter a number: ")
y = input("Please enter an operation: ")
z = input("Please enter another number: ")
if(y == "+"):
    a = int(x) + int(z)
    print(str(x) + "+" + str(z) + "=" + str(a))
elif(y == "-"):
    b = int(x) - int(z)
    print(str(x) + "-" + str(z) + "=" + str(b))
elif(y == "*"):
    c = int(x) * int(z)
    print(str(x) + "*" + str(z) + "=" + str(c))
elif(y =="/"):
    d = int(x) / int(z)
    print(str(x) + "/" + str(z) + "=" + str(d))
else:
    print("Wat")


