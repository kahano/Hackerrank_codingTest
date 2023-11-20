# Hackerrank_codingTest
A solution for a coding test in Hackerrank.

As a lion trainer, you are taking part in an international lion exhibition. During the event lions from different teams enter and exit the showroom where lion experts can inspect and score them. Lions do not enter the showroom all at once, as that would cause too much commotion. The organizers of the event are letting them in and out based on a predefined schedule. Before the show starts you get access to the schedule for your lions - but not for the others. Nevertheless, during the show, you can observe all lions getting in and out of the room. Based on your experience, you believe that judges tend to award the biggest lions in the room with the highest scores. Before the final results are out, you want to estimate your chances of winning this competition.

Problem Statement :

Complete the following functions:

• The LionCompetition class constructor that accepts lion descriptions and the private schedule of when the lions enter and exit the showroom.

• The LionEntered and LionLeft functions that are called whenever a new lion enters or leaves the room.

• The getBiggestLions function that, for the current time, returns a list of our lions in the room that are at least as big as the biggest lion from competing teams in the room. The presented list has to be sorted alphabetically.

Function definitions:

LionCompetition class constructor parameters:

• Lions - list or elements describing your lions:

• name - string representing a name of the lion

• height - height of the lion

• schedule - a private schedule of when your lions enter and leave the show room

• name - string representing a name of the lion

• enterTime - number of minutes since the start of the show when the lion will enter the room

• exitTime - number of minutes since the start of the show whin the lion will exit the room

LionEntered function parameters:

• currentTime - number of minutes since the start of the show

• height - height of the lion that entered the room

LionLeft function parameters:

• currentTime - number of minutes since the start of the show

• height - height of the lion that left the room

Constraints

• Subsequent invocations of Lionleft and lionEntered functions are always called in order. according to the currentTime parameter.

The schedule is strictly followed - your lions enter and exit the room exactly at specified times.

The lion inspection (invocation of the getBiggestLions function) takes place either before or after all lions scheduled to enter or leave the room at a given minute did that - never in between.

• Lion names are unique.

• Times (currentTime, enterTime and exitTine) are always whole numbers (and multiple events can occur at the same time).

• A single lion enters the room only once during the show.

testing it through the console


![image](https://github.com/kahano/Hackerrank_codingTest/assets/48335933/4c229823-17d5-48fd-bb33-74c50122e5fa)
