import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

class Lion_exhib_Main{



        public static void main(String args[]) throws Exception {

            Scanner scanner = new Scanner(System.in);

            String operation;

            List<LionDescription> descriptions = new ArrayList<LionDescription>();

            List<LionSchedule> schedule = new ArrayList<LionSchedule>();

            do

            {

            operation = scanner.next();

            if (operation.equals("definition"))

            {

            LionDescription description = new LionDescription();

            description.name = scanner.next();

            description.height = scanner.nextInt();

            descriptions.add(description);

            }

            if (operation.equals("schedule"))

            {

            LionSchedule scheduleEntry = new LionSchedule();

            scheduleEntry.name = scanner.next();

            scheduleEntry.enterTime = scanner.nextInt();

            scheduleEntry.exitTime = scanner.nextInt();

            schedule.add(scheduleEntry);

            }

            } while (!operation.equals("start"));

            LionCompetition elephantCompetition = new LionCompetition(descriptions, schedule);

            do

            {

            int currentTime = scanner.nextInt();

            operation = scanner.next();

            if (operation.equals("enter"))

            {

            int size = scanner.nextInt();

            elephantCompetition.LionEntered(currentTime, size);

            }

            if (operation.equals("exit"))

            {

            int size = scanner.nextInt();

            elephantCompetition.LionLeft(currentTime, size);

            }

            if (operation.equals("inspect"))

            {

            List<String> elephants = elephantCompetition.getBiggestLions();

            System.out.print(elephants.size());

            for (String name : elephants) {

            System.out.print(" " + name);

            }

            System.out.println();

            }

            } while (!operation.equals("end"));

            }


}
