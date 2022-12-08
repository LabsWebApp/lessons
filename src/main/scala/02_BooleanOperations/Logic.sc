var ticket = false //пропуск
var hands = false // дезинфекция рук
var feet = false // дезинфекция ног

var entry = ticket && hands && feet //вход

if (entry) "Come in!" else "Get out!"


var nightTime = false //тёмное время суток
var closedBlinds = false //жалюзи закрыты

var turnOnTheLight = nightTime || closedBlinds

if (turnOnTheLight) "Turn on the light" else "Turn off the light"



var activeUse = false //активное использование мониторов

var turnOffTheScreen = !activeUse || nightTime

if (turnOffTheScreen) "Turn off the screen" else "Turn on the screen"


val x: Byte = -1

x>>>2
x>>2
x<<2

Integer.toBinaryString(x)
Integer.toBinaryString(x>>>2)

var y = -2147483649L
y>>>1