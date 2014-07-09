## Bowling Kata

Now that you've gone through the Prime Factors Kata, reinforce what you've learned with the Bowling Kata. 

***
### Overview
Keep the same things in mind. 
Write a failing test, write just enough code to make that specific test pass, keep things dry, keep things simple. Again develop a method not a complicated class.

#### First Test
In bowling, the bowler gets two attempts to clear the pins in a frame. If the player never rolls a spare or a strike, then the score is simply summed up.
Start with this test. If you are given these 10 frames: "31415390107133238009" the score is the sum of each digit, in this case the answer is 3+1+4+1...+8+0+0+9=63

#### Next Test
Let's introduce the concept of a spare. If a bowler gets a spare (meaning he knocks down all 10 pins in two attempts, in a single frame), his score is doubled for the next roll. If you are given these 10 frames: "91415390107133238009", then the sum looks like the following 9+1(spare detected)+2*(4)+1+5+3+.....+8+0+0+9=73. Keep in mind that a value is considered a spare only if the pins belong to the same frame.

#### Links
http://content.codersdojo.org/code-kata-catalogue/bowling-game/

http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata