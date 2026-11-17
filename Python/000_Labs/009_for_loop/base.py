y = int(input("How long would you like your line to be?: "))
z = input("Would you like your line to be horizontal or vertical?: ")
num = 0
for x in range(0,y):
    num = num + 1
    if(z == "horizontal"):
        print("*", end=" ")
    elif(z == "vertical"):
        print("*")
        if(num == y):
            break
    
