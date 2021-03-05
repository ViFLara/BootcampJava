package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExample {
    private static final ExecutorService peopleToPerformActivity =
            Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        House house = new House(new Bedroom());
        List<Future<String>> futures =
                house.getsWorkHouse().stream()
                        .map(activity -> peopleToPerformActivity.submit(() -> {
                                    try {
                                        return activity.performs();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    return null;
                                })
                        ).collect(Collectors.toCollection(CopyOnWriteArrayList::new));

        while (true) {
            int numberOfActivitiesDidntCarryOut = 0;
            for (Future<?> future : futures) {
                if (future.isDone()) {
                    try {
                        System.out.println("Congratulations, you have done " + future.get());
                        futures.remove(future);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numberOfActivitiesDidntCarryOut++;
                }
            }
            if (futures.stream().allMatch(Future::isDone)) {
                break;
            }
            System.out.println("Number of activities didn't finish : :" + numberOfActivitiesDidntCarryOut);
            Thread.sleep(500);
        }
        peopleToPerformActivity.shutdown();
    }
}

class House {
    private final List<Room> rooms;

    House(Room... rooms) {
        this.rooms = Arrays.asList(rooms);
    }

    List<Activity> getsWorkHouse() {
        return this.rooms.stream().map(Room::getsRoomWork)
                .reduce(new ArrayList<>(), (pivo, activities) -> {
                    pivo.addAll(activities);
                    return pivo;
                });
    }
}

interface Activity {
    String performs() throws InterruptedException;
}

abstract class Room {
    abstract List<Activity> getsRoomWork();
}

class Bedroom extends Room {
    @Override
    List<Activity> getsRoomWork() {
        return Arrays.asList(
                // () -> this.cleanTheHouse(),
                this::cleanTheHouse,
                this::sweepTheBedroom,
                this::cleanTheWardrobe
                );
    }
    private String cleanTheWardrobe() throws InterruptedException {
        Thread.sleep(5000);
        String clean_the_wardrobe = "clean the wardrobe";
        System.out.println(clean_the_wardrobe);
        return clean_the_wardrobe;
    }

    private String sweepTheBedroom() throws InterruptedException {
        Thread.sleep(7000);
        String sweep_the_bedroom = "sweep the bedroom ";
        System.out.println(sweep_the_bedroom);
        return sweep_the_bedroom;
    }

    private String cleanTheHouse() throws InterruptedException {
        Thread.sleep(10000);
        String make_the_bed = "make the bed ";
        System.out.println(make_the_bed);
        return make_the_bed;
    }
}