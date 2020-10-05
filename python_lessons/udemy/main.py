from udemy.classes.Person import Person

john = Person("John", "human")
print(john.name)
print(john.age)

bob = Person("Bob", "human", 20)
print(bob.name)
print(bob.age)

print(Person.MAX_SPEED)
print(bob.is_dead())

print(bob._Person__race)
#bob.__race - can't access private field
bob._Person__race = "ork" #or maybe we can
print(bob._Person__race)

print(bob._health)
bob._health = 55 # same with protected fields, but should not be used as _ shows that it is actually a protected field
print(bob._health)

print(bob.health)
# bob.health = 60 # error

print(bob.current_speed)
bob.current_speed = 500
print(bob.current_speed)
