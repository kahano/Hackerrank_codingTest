 import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;


 class LionCompetition{



        private Map<Integer, String> our_lions = new TreeMap<>(); // mapping each given height to it's respective lion name in my team

        private TreeSet<Integer> presented_lions = new TreeSet<>(); // all other lions that are available in the cirkus
        private TreeSet<Integer> our_presented_lions = new TreeSet<>(); // my lions that entered the cirkus for the show

        private Map<String,LionSchedule> ourSchedule = new HashMap<>();// store my lions schedule

        public LionCompetition(List<LionDescription> lions, List<LionSchedule> schedule) {

            /* Enter your code here. */

                for(LionDescription lion : lions){
                    our_lions.putIfAbsent(lion.height, "");
                    our_lions.put(lion.height,lion.name);
                }

                for(LionSchedule sc : schedule){
                    ourSchedule.put(sc.name,sc);
                }



        }

        public void LionEntered(int currentTime, int height) {

            /* Enter your code here. */
                

            if(our_lions.containsKey(height)){
                    String name = our_lions.get(height);
                    int ent_time = ourSchedule.get(name).enterTime;
                    if(ent_time == currentTime){
                        our_presented_lions.add(height);
                        return;
                                                        
                    }

            }
            else{
                    presented_lions.add(height);
                   
            }
                     
             

        }

        public void LionLeft(int currentTime, int height) {

           
            /* Enter your code here. */

            if(our_lions.containsKey(height)){
                        String name = our_lions.get(height);
                        int exit_time = ourSchedule.get(name).exitTime;
                        if(exit_time == currentTime){
                            our_presented_lions.remove(height);
                            return;                        
                       
                        }
                        
            }
            else{
                presented_lions.remove(height);
             
            }



        }

        public List<String> getBiggestLions()

        {

        /* Enter your code here. */
        if(our_presented_lions.isEmpty()){
            return new ArrayList<String>();
        }

        int max_height_otherTeams = presented_lions.last();
        List<Integer> list = new ArrayList<Integer>(our_presented_lions);

        List<String> res = new ArrayList<>();
        for(Map.Entry<Integer,String> entry : our_lions.entrySet()){
            for(int value : list){
                if( value >= max_height_otherTeams && value == entry.getKey()){ // comparing the heights of my lions with the biggest lion from the other teams
                    res.add(entry.getValue()); // add my lions if they are bigger
                    
                }
            }
        }
        Collections.sort(res);
        return res;
        // adding alphabitically all the elements in the list



        }
}
