import java.util.LinkedList;
import java.util.Queue;

class SnakeGame {
    private int width;
    private int height;
    private int[][] food;
    private Queue<int[]> snake;
    private int score;

    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;
        this.snake = new LinkedList<>();
        this.snake.offer(new int[]{0, 0});
        this.score = 0;
    }

    public int move(String direction) {
        int[] head = new int[]{snake.peek()[0], snake.peek()[1]};

        switch (direction) {
            case "U":
                head[0]--;
                break;
            case "D":
                head[0]++;
                break;
            case "L":
                head[1]--;
                break;
            case "R":
                head[1]++;
                break;
        }

        if (head[0] < 0 || head[0] >= height || head[1] < 0 || head[1] >= width) {
            return -1; // Game over - hit the wall
        }

        // Check if the head hits itself
        for (int[] part : snake) {
            if (part[0] == head[0] && part[1] == head[1]) {
                return -1; // Game over - hit itself
            }
        }

        // Check if the head eats food
        if (score < food.length && head[0] == food[score][0] && head[1] == food[score][1]) {
            score++;
        } else {
            snake.poll(); // Move snake by removing the tail
        }

        snake.offer(head);
        return score;
    }
}

public class DesignSnakeGame {
    public static void main(String[] args) {
        int width = 3, height = 2;
        int[][] food = {{1, 2}, {0, 1}};
        SnakeGame snakeGame = new SnakeGame(width, height, food);

        System.out.println("Move R: " + snakeGame.move("R")); // Output: 0
        System.out.println("Move D: " + snakeGame.move("D")); // Output: 0
        System.out.println("Move R: " + snakeGame.move("R")); // Output: 1 (eating the food)
        System.out.println("Move U: " + snakeGame.move("U")); // Output: 1
        System.out.println("Move L: " + snakeGame.move("L")); // Output: 2 (eating the food)
    }
}
