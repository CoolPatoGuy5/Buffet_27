y = int(input("How long would you like your line to be?: "))
z = int(input("How wide would you like your line to be?: "))
w = input("What symbol would you like your box to made made out of?: ")
num = 0
num2 = 0
for a in range(1,z):
    num2 = num2 + 1
    print(w)
    if(num2 == z):
        break    
    for x in range(1,y):
        num = num + 1
        print(w, end=" ")
        if(num == y):
            break
