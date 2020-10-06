class Person():
    dead_health = 0  # static
    MAX_SPEED = 100  # no 'final' word as in java, but if named in caps, then it ois constant

    def __init__(self, name, race, age=10):  # default value for age
        self.name = name
        self.age = age
        self._health = 100  # protected with _
        self.__race = race  # private field with __
        self._current_speed = 20

    def hit(self, damage):
        self._health -= damage

    def is_dead(self):
        return self._health == Person.dead_health
        # return self.health == dead_health # - will also work, but better to call with class name

    @property
    def health(self):
        return self._health

    @property
    def current_speed(self):
        return self._current_speed

    @current_speed.setter
    def current_speed(self, current_speed):
        if current_speed < 0:
            self._current_speed = 0
        elif current_speed > 100:
            self._current_speed = 100
        else:
            self._current_speed = current_speed

    pass
