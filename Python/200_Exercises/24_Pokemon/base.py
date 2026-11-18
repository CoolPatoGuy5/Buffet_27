import requests


# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

x = input("Which Pokemon would you like to learn about?: ")
y = "https://pokeapi.co/api/v2/pokemon/" + x
pokemon = requests.get(y).json()
print(y)
print("I dont know how to do dis sry :/ heres da link so u can try to find some info on ur own or just use a personal computer becuz these school chromebook admins r dum")
print("Heres some of da info i got about " + x)
print("type/types:")
print(pokemon["types"][0]["type"]["name"])
print("abilty/abilities:")
print(pokemon["abilities"][0]["ability"]["name"])
print("im not gona do anymor dis gona cause me to have a stroke (dis be confusing) ;_;")

