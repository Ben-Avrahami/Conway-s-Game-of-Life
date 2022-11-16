


[![](https://dryuc24b85zbr.cloudfront.net/tes/resources/11310079/image?width=500&height=500&version=1519313639596)](https://dryuc24b85zbr.cloudfront.net/tes/resources/11310079/image?width=500&height=500&version=1519313639596)



# Conway's Game of Life

The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970. It is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves. It is Turing complete and can simulate a universal constructor or any other Turing machine.

rules
-------------
The universe of the Game of Life is an infinite(in this specific implementation it is 10*10), two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, live or dead (or populated and unpopulated, respectively). Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:

Any live cell with fewer than two live neighbours dies, as if by underpopulation.
Any live cell with two or three live neighbours lives on to the next generation.
Any live cell with more than three live neighbours dies, as if by overpopulation.
Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

These rules, which compare the behavior of the automaton to real life, can be condensed into the following:

Any live cell with two or three live neighbours survives.
Any dead cell with three live neighbours becomes a live cell.
All other live cells die in the next generation. Similarly, all other dead cells stay dead.
The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed, live or dead; births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick.  Each generation is a pure function of the preceding one. The rules continue to be applied repeatedly to create further generations.

###Example Of Patterns
                
[![Patterns in Game Of Life](https://blog.xojo.com/wp-content/uploads/2022/05/CleanShot-2022-05-02-at-14.25.12@2x-1024x924.png "Patterns in Game Of Life")](https://blog.xojo.com/wp-content/uploads/2022/05/CleanShot-2022-05-02-at-14.25.12@2x-1024x924.png "Patterns in Game Of Life")


#### Done By
Ben Avrahami , The game was created as an assignment in the course- Advanced Object Orianted Programming with Java (20554) in The Open University Of Israel.
