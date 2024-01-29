import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int lastAttackTime = 0;
        Map<Integer, Integer> damageMap = new HashMap<>();
        int noAttackDuration = 0;

        // Populate the damage map and find the last attack time
        for (int[] attack : attacks) {
            damageMap.put(attack[0], attack[1]);
            lastAttackTime = Math.max(lastAttackTime, attack[0]);
        }

        // Iterate through each second from start to last attack
        for (int time = 1; time <= lastAttackTime; time++) {
            if (damageMap.containsKey(time)) { // If there's an attack
                currentHealth -= damageMap.get(time);
                noAttackDuration = 0;
            } else { // If no attack
                currentHealth += bandage[1];
                noAttackDuration++;

                // Apply extra healing
                if (noAttackDuration == bandage[0]) {
                    currentHealth += bandage[2];
                    noAttackDuration = 0;
                }

                // Ensure health does not exceed max
                if (currentHealth > health) {
                    currentHealth = health;
                }
            }

            // Check if health is depleted
            if (currentHealth <= 0) {
                return -1;
            }
        }

        return currentHealth;
    }
}
