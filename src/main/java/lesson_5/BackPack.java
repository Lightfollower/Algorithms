package lesson_5;

public class BackPack {
    public BackPack(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    int carryingCapacity;

    public static class Junk {
        int cost;
        int weight;

        public Junk(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }
    }


    static int calculateBackpack(Junk[] junk, int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (junk[i].weight > W) {
            return calculateBackpack(junk, i - 1, W);
        } else {
            return Math.max(calculateBackpack(junk, i - 1, W), calculateBackpack(junk,i - 1, W - junk[i].weight) + junk[i].cost);
        }
    }

    public static void main(String[] args) {
        BackPack backPack = new BackPack(120);
        Junk[] junk = new Junk[]{new Junk(1200, 80), new Junk(1100, 75), new Junk(1000, 10),
                new Junk(900, 65), new Junk(800, 60), new Junk(40, 65)};

        System.out.println(calculateBackpack(junk, junk.length - 1, backPack.carryingCapacity));
    }
}
